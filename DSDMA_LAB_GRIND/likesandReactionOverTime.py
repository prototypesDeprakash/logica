import pandas as pd
import matplotlib.pyplot as plt

# Create a small dataset
data = {
    'Date': ['2025-10-01', '2025-10-02', '2025-10-03', '2025-10-04', '2025-10-05'],
    'Likes': [120, 150, 180, 200, 170],
    'Reactions': [80, 90, 110, 130, 100]
}

df = pd.DataFrame(data)

# Convert Date column to datetime type
df['Date'] = pd.to_datetime(df['Date'])

print(df)
plt.plot(df['Date'], df['Likes'], marker='o', label='Likes')
plt.plot(df['Date'], df['Reactions'], marker='s', label='Reactions')

plt.title("Likes and Reactions Over Time")
plt.xlabel("Date")
plt.ylabel("Count")
plt.legend()
plt.grid(True)
plt.show()
