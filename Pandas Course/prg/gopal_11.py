# High Value Customer Identification (RFM Analysis)

import pandas as pd
import numpy as np
import matplotlib.pyplot as plt
import seaborn as sns

# Step 1: Sample customer dataset
data = {
    "CustomerID": [101, 102, 103, 104, 105, 106, 107],
    "InvoiceDate": pd.to_datetime(
        [
            "2025-01-15",
            "2025-02-10",
            "2025-01-25",
            "2025-03-05",
            "2025-02-18",
            "2025-03-01",
            "2025-02-28",
        ]
    ),
    "InvoiceNo": [2001, 2002, 2003, 2004, 2005, 2006, 2007],
    "Quantity": [5, 8, 3, 10, 15, 6, 12],
    "Price": [100, 80, 120, 60, 75, 90, 110],
}

df = pd.DataFrame(data)

# Step 2: Calculate total amount
df["TotalAmount"] = df["Quantity"] * df["Price"]

# Step 3: Current date for recency calculation
current_date = pd.to_datetime("2025-03-15")

# Step 4: RFM metrics
rfm = (
    df.groupby("CustomerID")
    .agg(
        {
            "InvoiceDate": lambda x: (current_date - x.max()).days,  # Recency
            "InvoiceNo": "count",  # Frequency
            "TotalAmount": "sum",  # Monetary
        }
    )
    .reset_index()
)

rfm.columns = ["CustomerID", "Recency", "Frequency", "Monetary"]

# Step 5: Ranking each metric (lower recency is better)
rfm["R_rank"] = pd.qcut(rfm["Recency"], 4, labels=[4, 3, 2, 1]).astype(int)
rfm["F_rank"] = pd.qcut(
    rfm["Frequency"].rank(method="first"), 4, labels=[1, 2, 3, 4]
).astype(int)
rfm["M_rank"] = pd.qcut(rfm["Monetary"], 4, labels=[1, 2, 3, 4]).astype(int)

# Step 6: Final RFM Score
rfm["RFM_Score"] = rfm["R_rank"] + rfm["F_rank"] + rfm["M_rank"]

# Step 7: Top High Value Customers
top_customers = rfm.sort_values(by="RFM_Score", ascending=False).head(5)

print("Top High Value Customers:")
print(top_customers[["CustomerID", "Recency", "Frequency", "Monetary", "RFM_Score"]])

# Step 8: Visualization - Top Customers by Monetary Value
plt.figure(figsize=(8, 5))
sns.barplot(x="CustomerID", y="Monetary", data=top_customers)
plt.title("Top High Value Customers by Monetary Value")
plt.xlabel("Customer ID")
plt.ylabel("Total Spend")
plt.tight_layout()
plt.show()

# Scatter plot: Frequency vs Monetary
plt.figure(figsize=(8, 5))
sns.scatterplot(x="Frequency", y="Monetary", data=rfm, hue="CustomerID", s=100)
plt.title("Customer Frequency vs Monetary Value")
plt.xlabel("Frequency")
plt.ylabel("Monetary Value")
plt.tight_layout()
plt.show()
