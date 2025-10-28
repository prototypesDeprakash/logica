# Top Performing Influencer Identification

import pandas as pd
import numpy as np
import matplotlib.pyplot as plt
import seaborn as sns

# Step 1: Load sample influencer dataset
data = {
    "Influencer": ["Alice", "Bob", "Charlie", "Diana", "Ethan", "Fiona"],
    "Followers": [50000, 120000, 75000, 30000, 95000, 60000],
    "Likes": [8000, 15000, 12000, 5000, 13000, 7000],
    "Comments": [900, 1800, 1300, 600, 1500, 800],
    "Shares": [400, 1000, 700, 300, 900, 500]
}

df = pd.DataFrame(data)

# Step 2: Calculate Engagement Rate
df["Engagement"] = df["Likes"] + df["Comments"] + df["Shares"]
df["EngagementRate"] = (df["Engagement"] / df["Followers"]) * 100

# Step 3: Identify Top 5 Influencers
top_influencers = df.sort_values(by="EngagementRate", ascending=False).head(5)

print("Top 5 Performing Influencers:")
print(top_influencers[["Influencer", "EngagementRate"]])

# Step 4: Visualization - Bar Chart
plt.figure(figsize=(8,5))
sns.barplot(x="Influencer", y="EngagementRate", data=top_influencers)
plt.title("Top Influencers by Engagement Rate")
plt.ylabel("Engagement Rate (%)")
plt.xlabel("Influencer")
plt.tight_layout()
plt.show()

# Step 5: Scatter Plot - Followers vs Engagement Rate
plt.figure(figsize=(8,5))
sns.scatterplot(x="Followers", y="EngagementRate", data=df, hue="Influencer", s=100)
plt.title("Followers vs Engagement Rate")
plt.xlabel("Followers")
plt.ylabel("Engagement Rate (%)")
plt.tight_layout()
plt.show()
