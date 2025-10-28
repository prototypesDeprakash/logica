import pandas as pd

df = pd.read_csv('ecommerce_sales.csv')
missing_data = df.isnull()


df.loc[:, 'Product Description'] = df['Product Description'].fillna("No description")

median_price = df['Price'].median()
df.loc[:, 'Price'] = df['Price'].fillna(median_price)

print("Missing Data Information:")
print(missing_data)
print()

print("Cleaned Dataset:")
print(df)
print()

print("Dataset Information - After Cleaning:")
df.info()
