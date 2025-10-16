import sqlite3
from datetime import datetime, timedelta
import random
import os

# Path to save dummy history file
dummy_history = r"C:\Users\prave\OneDrive\Desktop\logica\Dsdma\dummyhistory"

# Ensure folder exists
os.makedirs(os.path.dirname(dummy_history), exist_ok=True)

# Connect/create SQLite DB
conn = sqlite3.connect(dummy_history)
cursor = conn.cursor()

# Create urls table similar to Chrome's
cursor.execute("""
CREATE TABLE IF NOT EXISTS urls (
    id INTEGER PRIMARY KEY,
    url TEXT,
    visit_count INTEGER,
    last_visit_time INTEGER
)
""")

# Helper: convert datetime to Chrome timestamp (microseconds since 1601-01-01)
def to_chrome_time(dt):
    epoch_start = datetime(1601, 1, 1)
    delta = dt - epoch_start
    return int(delta.total_seconds() * 1_000_000)

# Dummy URLs
browsing_urls = [
    "https://www.amazon.in/s?k=laptop",
    "https://www.flipkart.com/search?q=shoes",
    "https://www.myntra.com/women-tops"
]

purchase_urls = [
    "https://www.amazon.in/gp/cart/view.html",
    "https://www.flipkart.com/checkout/init",
    "https://www.myntra.com/checkout/order-summary"
]

# Generate 50 random entries
entries = []
now = datetime.now()
for i in range(50):
    if random.random() < 0.7:
        url = random.choice(browsing_urls)
    else:
        url = random.choice(purchase_urls)
    visit_count = random.randint(1, 5)
    last_visit = now - timedelta(days=random.randint(0,10), hours=random.randint(0,23))
    entries.append((url, visit_count, to_chrome_time(last_visit)))

# Insert dummy data
cursor.executemany("INSERT INTO urls (url, visit_count, last_visit_time) VALUES (?, ?, ?)", entries)
conn.commit()
conn.close()

print(f"Dummy history created at {dummy_history}")
