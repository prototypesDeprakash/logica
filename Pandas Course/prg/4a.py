import pandas as pd

df = pd.read_csv("homelessness.csv")
print(df.head())  # first 10 rows from dataframe
print()

# using the pandas set_index() function.
indexed_df = df.set_index(["region", "state", "individuals"])

print(indexed_df.head())
