import pandas as pd

# Load the supply chain dataset
df = pd.read_csv("supply_chain_data.csv")

# Set 'Order_ID' as the index
df_indexed = df.set_index("Order_ID")

print("Indexed DataFrame:")
print(df_indexed)

# Access data using index
print("\nOrder with ID 103:")
print(df_indexed.loc[103])

# Filter: All orders from Supplier B
supplier_b_orders = df_indexed[df_indexed["Supplier"] == "Supplier B"]
print("\nOrders from Supplier B:")
print(supplier_b_orders)

# Filter by Warehouse and Product
filtered = df_indexed[
    (df_indexed["Warehouse"] == "WH2") & (df_indexed["Product"] == "Aluminum")
]
print("\nFiltered Orders (WH2 & Aluminum):")
print(filtered)
