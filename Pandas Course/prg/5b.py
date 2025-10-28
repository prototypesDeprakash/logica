import pandas as pd

# Load the dataset
df = pd.read_csv("manufacturing_data.csv")

# Display basic information
print("Dataset preview:")
print(df.head())

# Convert 'Date' to datetime if needed
df["Date"] = pd.to_datetime(df["Date"])

# Pivot table: Total units produced by Factory and Product
pivot_units = pd.pivot_table(
    df,
    index="Factory",
    columns="Product",
    values="Units_Produced",
    aggfunc="sum",
    fill_value=0,
)

print("\nTotal Units Produced by Factory and Product:")
print(pivot_units)

# Pivot table: Defect rate by Factory
df["Defect_Rate"] = df["Defective_Units"] / df["Units_Produced"]
pivot_defect_rate = pd.pivot_table(
    df, index="Factory", values="Defect_Rate", aggfunc="mean"
)

print("\nAverage Defect Rate by Factory:")
print(pivot_defect_rate)

# Pivot table: Units produced per shift per product
pivot_shift = pd.pivot_table(
    df,
    index="Shift",
    columns="Product",
    values="Units_Produced",
    aggfunc="sum",
    fill_value=0,
)

print("\nUnits Produced per Shift per Product:")
print(pivot_shift)

# Optional: Save pivot table results to CSV
pivot_units.to_csv("pivot_units_by_factory_product.csv")
pivot_defect_rate.to_csv("average_defect_rate_by_factory.csv")
pivot_shift.to_csv("units_by_shift_product.csv")
