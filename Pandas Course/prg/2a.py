import pandas as pd

technologies = {
    "Courses": ["Excel", "Cloud", "ML", "Python", "Cloud", "Excel"],
    "Fee": [18000, 23000, 25000, 21000, 22000, 17000],
    "Duration": ["25days", "30days", "45days", "35days", "30days", "25days"],
    "Discount": [1200, 2000, 2100, 1800, 1900, 1100],
}
# before sorting and indexing
df = pd.DataFrame(technologies)
print(df)
print()

# indexing
print("Indexed dataframe:")
df.index.name = "Index"
print(df)
print()

# after sorting
print("Sorted dataframe: ")
sorted_df = df.sort_values(by=["Courses"])
print(sorted_df)
print()
