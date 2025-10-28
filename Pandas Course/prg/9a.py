import pandas as pd
import matplotlib.pyplot as plt
import spacy
from textblob import TextBlob

# Sample tweets
tweets = [
    "Apple's latest iPhone update has some amazing features!",
    "The traffic in Los Angeles today is a complete nightmare.",
    "I just watched the new Marvel movie, and it was okay, nothing special.",
    "Microsoft Teams keeps crashing on my laptop, super frustrating!",
    "SpaceX successfully launched another rocket into orbit, incredible achievement!",
]


# --- Sentiment Analysis ---
def get_sentiment(text):
    score = TextBlob(text).sentiment.polarity
    if score > 0.1:
        return "positive"
    elif score < -0.1:
        return "negative"
    return "neutral"


sentiments = [get_sentiment(t) for t in tweets]

# --- Entity Recognition (NER) ---
nlp = spacy.load("en_core_web_sm")
entities = []
for t in tweets:
    doc = nlp(t)  # FIXED INDENTATION
    for ent in doc.ents:
        entities.append((t, ent.text, ent.label_))

# --- Console Output ---
print("=== Sentiment Results ===")
for tw, s in zip(tweets, sentiments):
    print(f"{s.upper():<8} | {tw}")

print("\n=== Named Entities ===")
for t, ent, label in entities:
    print(f'{ent} ({label}) <- from: "{t}"')

# --- Plot sentiment counts ---
sent_df = pd.Series(sentiments).value_counts()

plt.figure(figsize=(5, 4))
sent_df.plot(kind="bar", color=["green", "red", "gray"])
plt.title("Tweet Sentiment Distribution")
plt.ylabel("Count")
plt.tight_layout()
plt.savefig("twitter_sentiments.png")
plt.close()
print("\nBar chart saved as twitter_sentiments.png")
