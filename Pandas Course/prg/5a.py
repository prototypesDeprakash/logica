import pandas as pd

# Creating the DataFrame
df = pd.DataFrame({
    "A": ["Pizza", "Pizza", "Pizza", "Pizza", "Pizza", "Sandwich", "Sandwich", "Sandwich", "Sandwich"],
    "B": ["one", "one", "one", "two", "two", "one", "one", "two", "two"],
    "C": ["small", "large", "large", "small", "small", "large", "small", "small", "large"],
    "D": [1, 2, 2, 3, 3, 4, 5, 6, 7],
    "E": [2, 4, 5, 5, 6, 6, 8, 9, 9]
})

print("Dataframe:")
print(df)
print()
# BASIC PIVOT TABLE (only numeric columns)
print("BASIC PIVOT TABLE")
table = pd.pivot_table(df, index=['A', 'B'], values=['D', 'E'])
print(table)
print()
# SUM aggregation (using 'sum' string instead of np.sum)
print("SOME BASIC AGGREGATE OPERATIONS")
table = pd.pivot_table(df, index=['A', 'B'], values=['D', 'E'], aggfunc='sum')
print(table)
print()
# MEAN aggregation using 'mean' string instead of np.mean
print("MEAN AGGREGATION")
table = pd.pivot_table(df, values=['D', 'E'], index=['A', 'C'],
                       aggfunc={'D': 'mean', 'E': 'mean'})
print(table)
print()
# MULTIPLE AGGREGATIONS using strings
print("MULTIPLE AGGREGATIONS")
table = pd.pivot_table(df, values=['D', 'E'], index=['A', 'C'],
                       aggfunc={'D': 'mean',
                                'E': ['min', 'max', 'mean']})
print(table)
