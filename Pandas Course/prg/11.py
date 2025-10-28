# -----------------------
# Google Trends Keyword Analysis (Modified Code)
# -----------------------

# Step 1: Import libraries
import pandas as pd
import numpy as np
import matplotlib.pyplot as plt
import seaborn as sns
from pytrends.request import TrendReq

# Optional: To silence pandas future warnings
pd.set_option("future.no_silent_downcasting", True)

# Set plot style
sns.set(style="whitegrid")

# Step 2: Initialize pytrends
pytrend = TrendReq()

# Step 3: Define search keywords
kw_list = [
    "Artificial Intelligence",
    "Machine Learning",
    "Deep Learning",
    "ChatGPT",
    "OpenAI",
]

# Step 4: Build the payload for the last 3 months
pytrend.build_payload(kw_list, timeframe="today 3-m")

# Step 5: Get interest by region
region_df = pytrend.interest_by_region()
region_df = region_df.fillna(False).infer_objects(copy=False)  # Fix applied here
region_df = region_df[(region_df != 0).all(1)].dropna(how="all", axis=0)

# Step 6: Top 5 regions for AI keyword
top_regions = region_df.sort_values(by="Artificial Intelligence", ascending=False).head(
    5
)

# Step 7: Plot Interest by Region (Bar Chart)
top_regions.plot(kind="bar", figsize=(10, 5), width=0.8)
plt.title("Top 5 Regions by Search Interest (Google Trends)")
plt.xlabel("Regions")
plt.ylabel("Search Interest")
plt.legend(title="Keywords")
plt.tight_layout()
plt.show()

# Step 8: Interest over time
interest_time_df = pytrend.interest_over_time()
interest_time_df = interest_time_df.fillna(False).infer_objects(
    copy=False
)  # Fix applied here
if "isPartial" in interest_time_df.columns:
    interest_time_df = interest_time_df.drop(columns=["isPartial"])

# Line plot for trends over time
interest_time_df.plot(figsize=(12, 6))
plt.title("Google Trends: Keyword Search Interest Over Time")
plt.xlabel("Date")
plt.ylabel("Search Interest")
plt.legend(title="Keywords")
plt.tight_layout()
plt.show()

# Step 9: Correlation Heatmap between keywords
plt.figure(figsize=(8, 5))
sns.heatmap(region_df.corr(), annot=True, cmap="YlGnBu")
plt.title("Correlation Between Keywords")
plt.tight_layout()
plt.show()
