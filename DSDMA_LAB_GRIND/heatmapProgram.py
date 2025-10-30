import pandas as pd
import seaborn as sns
import matplotlib.pyplot as plt

# Sample dataset
data = {
    'Campaign': ['A', 'B', 'C', 'D'],
    'Clicks': [120, 90, 300, 150],
    'Impressions': [1000, 800, 2000, 1500],
    'Engagements': [400, 250, 600, 500]
}

df = pd.DataFrame(data)

# Set the campaign as index for better visualization
df.set_index('Campaign', inplace=True)
#corr = df.corr()
# Create the heatmap

sns.heatmap(df)

plt.title("Campaign Performance Heatmap")
plt.show()
