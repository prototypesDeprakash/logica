import pandas as pd

data = {
    'Campaign': ['A', 'A', 'B', 'B', 'C', 'C'],
    'Platform': ['Facebook', 'Twitter', 'Facebook', 'Twitter', 'Facebook', 'Twitter'],
    'Clicks': [100, 150, 200, 250, 300, 350],
    'Revenue': [1000, 1500, 2000, 2500, 3000, 3500]
}

df = pd.DataFrame(data)

#total number  of clicks for each campain
pivot = df.pivot_table(values='Clicks',index = 'Campaign',aggfunc='sum')
print(pivot)
print(df.head())
print(df.shape)
print(df.describe())

print(df.index)
print(df['Campaign'])
print(df.sort_values(by='Clicks',ascending=True))
