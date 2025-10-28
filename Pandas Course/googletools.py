

#Google tools:


import pandas as pd
import matplotlib.pyplot as plt

# Simulated interest data by region
data = {
    'Region': ['USA', 'India', 'UK', 'Canada', 'Australia'],
    'Facebook': [90, 85, 70, 60, 75],
    'Apple': [80, 65, 60, 55, 70],
    'Amazon': [95, 80, 75, 65, 85],
    'Netflix': [70, 60, 55, 50, 65],
    'Google': [100, 95, 80, 75, 90]
}

# Create DataFrame
regiondf = pd.DataFrame(data)
regiondf.set_index('Region', inplace=True)

# Print first rows
print(regiondf.head())

# Plot the data
regiondf.plot(kind='bar', figsize=(18, 10))
plt.title("Simulated Interest by Region")
plt.xlabel("Countries")
plt.ylabel("Search Interest")
plt.legend(title="Keywords")
plt.show()






