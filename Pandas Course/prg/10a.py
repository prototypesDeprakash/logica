# Import libraries
import pandas as pd
import matplotlib.pyplot as plt
from pytrends.request import TrendReq

# Initialize pytrends
pytrend = TrendReq()

# Step 1: Get keyword suggestions (optional)
keywords = pytrend.suggestions(keyword="Artificial Intelligence")
df_suggestions = pd.DataFrame(keywords)
print("Top 5 Keyword Suggestions:")
print(df_suggestions.head(5))

# Step 2: Define search terms
kw_list = [
    "Artificial Intelligence",
    "Machine Learning",
    "Deep Learning",
    "ChatGPT",
    "OpenAI",
]

# Step 3: Build the payload for the last 3 months
pytrend.build_payload(kw_list, timeframe="today 3-m")

# Step 4: Interest by Region
regiondf = pytrend.interest_by_region()
regiondf = regiondf[(regiondf != 0).all(1)].dropna(how="all", axis=0)

# Step 5: Bar Chart for Top 5 Regions
top_regions = regiondf.sort_values(by="Artificial Intelligence", ascending=False).head(
    5
)
top_regions.plot(
    kind="bar", figsize=(12, 6), title="Interest by Region (Google Trends)", width=0.8
)

plt.xlabel("Region")
plt.ylabel("Search Interest")
plt.legend(title="Keywords")
plt.tight_layout()
plt.show()
