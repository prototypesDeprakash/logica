import pandas as pd
import matplotlib.pyplot as plt

# --- Sample sales data ---
sales = pd.DataFrame(
    {
        "date": pd.date_range("2024-09-01", periods=10),
        "sales": [120, 180, 90, 200, 150, 220, 140, 160, 100, 190],
    }
)

# --- Sample reviews ---
reviews = [
    "Absolutely love this product, worth every penny!",
    "Good quality but shipping was late",
    "Terrible experience, will not buy again",
    "Decent product, works fine",
    "Worst customer service ever",
    "Excellent quality, highly recommended",
    "Not bad, but could be better",
    "Amazing product, super fast delivery",
    "Very disappointed with the purchase",
    "Good value for money",
]


# --- Simple sentiment function ---
def get_sentiment(text):
    text = text.lower()
    if any(
        w in text
        for w in ["love", "good", "amazing", "excellent", "highly recommended"]
    ):
        return "positive"
    if any(w in text for w in ["terrible", "worst", "disappointed"]):
        return "negative"
    return "neutral"


# --- SALES ANALYSIS ---
print("\n=== Sales Data ===")
print(sales)

# Plot sales trend
plt.figure(figsize=(6, 4))
plt.plot(sales["date"], sales["sales"], marker="o")
plt.title("Sales Trend")
plt.xlabel("Date")
plt.ylabel("Sales")
plt.xticks(rotation=45)
plt.tight_layout()
plt.show()

# --- REVIEWS ANALYSIS ---
sentiments = [get_sentiment(r) for r in reviews]
sent_df = pd.Series(sentiments).value_counts()

print("\n=== Review Sentiments ===")
print(sent_df)

# Plot sentiment distribution
plt.figure(figsize=(5, 4))
sent_df.plot(kind="bar", title="Customer Review Sentiments")
plt.tight_layout()
plt.show()
