import pandas as pd

data = {
    'Month': ['Jan', 'Jan', 'Feb', 'Feb'],
    'Category': ['A', 'B', 'A', 'B'],
    'Sales': [200, 150, 300, 250]
}

df = pd.DataFrame(data)
print(df.unstack())
print(df.stack())