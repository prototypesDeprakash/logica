from textblob import TextBlob

text = input("Enter text: ")
polarity = TextBlob(text).sentiment.polarity

if polarity > 0:
    print("Positive 😊")
elif polarity < 0:
    print("Negative 😞")
else:
    print("Neutral 😐")