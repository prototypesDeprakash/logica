import pandas as pd
import matplotlib.pyplot as plt

# Example data
data = {
    'Date': ['2025-10-01', '2025-10-02', '2025-10-03', '2025-10-04', '2025-10-05'],
    'Likes': [120, 150, 170, 160, 180],
    'Reactions': [80, 90, 95, 100, 110]
}

df = pd.DataFrame(data)
df['Date'] = pd.to_datetime(df['Date'])

# Plot

plt.plot(df['Date'], df['Likes'], label='Likes')
plt.plot(df['Date'], df['Reactions'], label='Reactions')
# plt.title('Likes and Reactions Over Time')
# plt.xlabel('Date')
# plt.ylabel('Count')
# plt.legend()
plt.grid(True)
plt.show()
