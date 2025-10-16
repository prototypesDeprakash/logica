import sqlite3
import os
import pandas as pd
from datetime import datetime, timedelta
import matplotlib.pyplot as plt

# === Step 1: Path to Chrome History (update profile path as needed) ===
history_db = r"C:\Users\prave\AppData\Local\Google\Chrome\User Data\Profile 15\History"

# === Step 2: Connect to DB ===
conn = sqlite3.connect(history_db)
cursor = conn.cursor()

cursor.execute("""
SELECT urls.url, urls.visit_count, urls.last_visit_time
FROM urls
ORDER BY last_visit_time DESC
LIMIT 1000
""")

rows = cursor.fetchall()
conn.close()

# === Step 3: Convert Chrome timestamp ===
def chrome_time_to_datetime(chrome_time):
    if chrome_time:
        return datetime(1601, 1, 1) + timedelta(microseconds=chrome_time)
    return None

data = []
for url, visits, last_time in rows:
    data.append([url, visits, chrome_time_to_datetime(last_time)])

df = pd.DataFrame(data, columns=["URL", "Visit Count", "Last Visit Time"])

# === Step 4: Define e-commerce sites & keywords ===
ecommerce_sites = ["amazon.in", "flipkart.com", "myntra.com"]
purchase_keywords = ["checkout", "payment", "cart", "order", "success", "confirm"]

# Filter only ecommerce visits
df = df[df["URL"].str.contains("|".join(ecommerce_sites), case=False, na=False)]

# === Step 5: Classify browsing vs purchases ===
def classify_activity(url):
    for keyword in purchase_keywords:
        if keyword in url.lower():
            return "Purchase"
    return "Browse"

df["Activity"] = df["URL"].apply(classify_activity)

# === Step 6: Aggregate browsing & purchases ===
browsing_count = df[df["Activity"] == "Browse"].shape[0]
purchase_count = df[df["Activity"] == "Purchase"].shape[0]

# === Step 7: Silent Buyer Rule ===
def is_silent_buyer(browsing, purchases, browse_threshold=20, ratio_threshold=10):
    if browsing >= browse_threshold:
        if purchases == 0:
            return True
        elif (browsing / (purchases + 1e-6)) > ratio_threshold:
            return True
    return False

silent_buyer = is_silent_buyer(browsing_count, purchase_count)

# === Step 8: Suggest Engagement Strategy ===
if silent_buyer:
    if purchase_count == 0:
        strategy = "Send welcome discount coupon"
    else:
        strategy = "Send personalized product recommendation"
else:
    strategy = "Normal engagement"

# === Step 9: Display Final Analysis in Console ===
print("\n===== Silent Buyer Analysis =====")
print(f"Total Browsing Sessions: {browsing_count}")
print(f"Total Purchase Pages Visited: {purchase_count}")
print(f"Silent Buyer? {'YES' if silent_buyer else 'NO'}")
print(f"Suggested Engagement Strategy: {strategy}")

# === Step 10: Visualization ===
activities = ["Browsing", "Purchases"]
counts = [browsing_count, purchase_count]

plt.figure(figsize=(6,4))
bars = plt.bar(activities, counts, color=["skyblue", "lightgreen"])

# Annotate values on bars
for bar in bars:
    yval = bar.get_height()
    plt.text(bar.get_x() + bar.get_width()/2, yval + 0.5, int(yval), ha="center", fontsize=10)

plt.title("Silent Buyer Analysis")
plt.xlabel("Activity Type")
plt.ylabel("Count")

# Add annotation for engagement strategy
plt.text(0.5, max(counts) + 2, f"Strategy: {strategy}", ha="center", fontsize=10, color="red")

plt.tight_layout()
plt.show()
