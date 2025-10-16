import pandas as pd
import matplotlib.pyplot as plt
import numpy as np

# === Step 1: Create dummy sales dataset ===
# Replace this with your actual sales CSV if you have one
data = {
    "Date": pd.date_range(start="2020-01-01", end="2024-12-31", freq="M"),
    "Sales": np.random.randint(1000, 5000, size=60)  # random monthly sales
}
df = pd.DataFrame(data)

# === Step 2: Extract Year & Month ===
df["Year"] = df["Date"].dt.year
df["Month"] = df["Date"].dt.month

# === Step 3: Aggregate yearly sales ===
yearly_sales = df.groupby("Year")["Sales"].sum().reset_index()

# === Step 4: Calculate Year-over-Year Growth ===
yearly_sales["YoY Growth %"] = yearly_sales["Sales"].pct_change() * 100

# === Step 5: Display results in console ===
print("\n===== Year-over-Year Sales Comparison =====")
print(yearly_sales)

# === Step 6: Plot Yearly Sales (Bar Chart) ===
plt.figure(figsize=(8,5))
bars = plt.bar(yearly_sales["Year"], yearly_sales["Sales"], color="skyblue")
for bar in bars:
    yval = bar.get_height()
    plt.text(bar.get_x() + bar.get_width()/2, yval + 200, str(yval), ha="center", fontsize=9)

plt.title("Year-over-Year Sales Comparison")
plt.xlabel("Year")
plt.ylabel("Total Sales")
plt.tight_layout()
plt.show()

# === Step 7: Plot YoY Growth % (Line Chart) ===
plt.figure(figsize=(8,5))
plt.plot(yearly_sales["Year"], yearly_sales["YoY Growth %"], marker="o", color="green", linestyle="--")
for i, val in enumerate(yearly_sales["YoY Growth %"]):
    if not pd.isna(val):
        plt.text(yearly_sales["Year"].iloc[i], val + 0.5, f"{val:.2f}%", ha="center", fontsize=9)

plt.title("Year-over-Year Growth (%)")
plt.xlabel("Year")
plt.ylabel("Growth %")
plt.axhline(0, color="red", linestyle="--")  # baseline at 0
plt.tight_layout()
plt.show()
