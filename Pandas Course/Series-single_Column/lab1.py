import pandas as pd


df = pd.read_csv("C:/Users/prave/OneDrive/Desktop/logica/Pandas Course/Series-single_Column/telecom_data.csv")

print("Original Data:\n")
print(df, "\n")


df_hiericalindexing = df.set_index(["Network", "Service", "Customersegment"])


print("Data with Hierarchical Indexing:\n")
print(df_hiericalindexing)
