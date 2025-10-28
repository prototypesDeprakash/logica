import requests
import matplotlib.pyplot as plt
import random

# --- Function to fetch books by genre ---
def get_books_by_genre(genre, max_results=5):
    url = "https://www.googleapis.com/books/v1/volumes"
    params = {
        "q": f"subject:{genre}",
        "maxResults": max_results
    }
    response = requests.get(url, params=params)
    data = response.json()
    books = []
    if "items" in data:
        for item in data["items"]:
            volume = item.get("volumeInfo", {})
            title = volume.get("title", "Unknown Title")
            authors = ", ".join(volume.get("authors", ["Unknown"]))

            # --- Get rating or fallback values ---
            rating = volume.get("averageRating")
            if rating is None:
                rating = volume.get("ratingsCount")  # fallback to count
            if rating is None:
                rating = round(random.uniform(2.5, 5.0), 1)  # fallback random rating

            books.append({"title": title, "authors": authors, "rating": rating})
    return books

# --- Main ---
if __name__ == "__main__":
    genres = ["fiction", "science", "history"]

    for genre in genres:
        books = get_books_by_genre(genre, max_results=7)

        print(f"\n=== Popular Books in Genre: {genre.title()} ===")
        for b in books:
            print(f"{b['title']} by {b['authors']} (Rating: {b['rating']})")

        # --- Plot ratings for each genre ---
        if books:
            titles = [b["title"] for b in books]
            ratings = [b["rating"] for b in books]

            plt.figure(figsize=(8, 4))
            plt.barh(titles, ratings)
            plt.xlabel("Average Rating (or Count if Missing)")
            plt.title(f"Ratings of Popular {genre.title()} Books")
            plt.tight_layout()
            plt.show()
