import pandas as pd

data = {
    'Month': ['Jan', 'Jan', 'Feb', 'Feb'],
    'Category': ['A', 'B', 'A', 'B'],
    'Sales': [200, 150, 300, 250]
}
df = pd.DataFrame(data)
print(df['Sales'].agg('sum'))
print(df['Sales'].agg('mean'))
print(df['Sales'].agg('max'))
print(df['Sales'].agg('min'))


print(df.agg({'Sales':lambda x: x.max()-x.min()}))
print(df.groupby('Month').agg({
    'Sales':'sum'
}))