from textblob import TextBlob

s = TextBlob("Fuck you bith")
if(s.sentiment.polarity >0):
    print("happe")
else:
    print("sad")