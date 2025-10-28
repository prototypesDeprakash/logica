import sys
import pandas as pd
import matplotlib.pyplot as plt
from vaderSentiment.vaderSentiment import SentimentIntensityAnalyzer


# --- Simple emotion mapping based on sentiment polarity ---
def sentiment_to_emotion(compound_score):
    # compound in [-1,1]
    if compound_score >= 0.5:
        return "very_positive"  # happy / excited
    if compound_score >= 0.05:
        return "positive"  # happy
    if compound_score > -0.05:
        return "neutral"
    if compound_score > -0.5:
        return "negative"  # sad / displeased
    return "very_negative"  # very angry / upset


def load_data(csv_path):
    df = pd.read_csv(csv_path, usecols=["post_id", "text", "likes"])
    # ensure types
    df["text"] = df["text"].astype(str)
    df["likes"] = pd.to_numeric(df["likes"], errors="coerce").fillna(0).astype(int)
    return df


def analyze(df):
    analyzer = SentimentIntensityAnalyzer()
    emotions = []
    compounds = []
    for txt in df["text"]:
        vs = analyzer.polarity_scores(txt)
        compounds.append(vs["compound"])
        emotions.append(sentiment_to_emotion(vs["compound"]))
    df["compound"] = compounds
    df["emotion"] = emotions
    return df


def summary_and_plots(df):
    # Summary: likes per emotion
    likes_by_emotion = (
        df.groupby("emotion", observed=True)["likes"].sum().sort_values(ascending=False)
    )
    counts_by_emotion = df["emotion"].value_counts()

    print("\n=== Likes by emotion ===")
    print(likes_by_emotion.to_string())
    print("\n=== Post counts by emotion ===")
    print(counts_by_emotion.to_string())

    # Bar chart: likes by emotion
    plt.figure(figsize=(8, 5))
    likes_by_emotion.plot(kind="bar")
    plt.title("Total Likes by Emotion")
    plt.xlabel("Emotion")
    plt.ylabel("Total Likes")
    plt.tight_layout()
    plt.show()

    # Bar chart: post counts by emotion
    plt.figure(figsize=(8, 5))
    counts_by_emotion.plot(kind="bar")
    plt.title("Number of Posts by Emotion")
    plt.xlabel("Emotion")
    plt.ylabel("Post Count")
    plt.tight_layout()
    plt.show()


def main():
    if len(sys.argv) < 2:
        print("Usage: python fb_analytics.py posts.csv")
        print("See sample CSV format in the code comments.")
        sys.exit(1)

    csv_path = sys.argv[1]
    df = load_data(csv_path)
    df = analyze(df)
    summary_and_plots(df)


if __name__ == "__main__":
    main()
