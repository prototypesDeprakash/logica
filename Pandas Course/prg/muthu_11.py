# -----------------------------
# Mini Project: Customer Location vs Product Choice Analysis
# -----------------------------

# Step 1: Import libraries
import pandas as pd
import numpy as np
import matplotlib.pyplot as plt
import seaborn as sns

# Set style for plots
sns.set(style="whitegrid")

# Step 2: Load the dataset
data = pd.read_csv("customer_data.csv")

# Step 3: Preview dataset
print("First 5 rows of the dataset:")
print(data.head())
print("\nDataset Info:")
print(data.info())

# Step 4: Check for missing values
print("\nMissing Values in Each Column:")
print(data.isnull().sum())

# Step 5: Basic statistics
print("\nTotal Customers per Location:")
print(data["Location"].value_counts())

print("\nTotal Customers per Product:")
print(data["Product"].value_counts())

# Step 6: Group by Location & Product
location_product_counts = data.groupby(["Location", "Product"]).size().reset_index(name="Count")

# Step 7: Sort data to get top products per location
top_products = location_product_counts.sort_values(by="Count", ascending=False)
print("\nTop Products by Location:")
print(top_products)

# Step 8: Bar chart for product popularity across locations
plt.figure(figsize=(10,5))
sns.barplot(x="Location", y="Count", hue="Product", data=top_products)
plt.title("Customer Location vs Product Choice")
plt.xlabel("Location")
plt.ylabel("Number of Purchases")
plt.legend(title="Product")
plt.tight_layout()
plt.show()

# Step 9: Pivot table for heatmap
pivot_table = location_product_counts.pivot(index="Location", columns="Product", values="Count").fillna(0)

# Heatmap visualization
plt.figure(figsize=(8,5))
sns.heatmap(pivot_table, annot=True, cmap="YlGnBu")
plt.title("Heatmap: Location vs Product Choice")
plt.tight_layout()
plt.show()

# Step 10: Insights
max_location = data["Location"].value_counts().idxmax()
max_product = data["Product"].value_counts().idxmax()

print(f"\nINSIGHTS:")
print(f"1. Location with highest customer purchases: {max_location}")
print(f"2. Most popular product overall: {max_product}")
print("3. Heatmap shows intensity of purchases across locations and products.")

# Step 11: Conclusion
print("\nConclusion:")
print("The analysis shows how customer location impacts product preferences. "
      "This helps in targeted marketing campaigns and optimizing product supply in high-demand regions.")
