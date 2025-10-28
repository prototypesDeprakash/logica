import pandas as pd
import numpy as np

data = {
    'CustomerID': [701, 702, 503, 701, 702, 904, 701],
    'Cost': [250, 500, 300, 150, 200, 400, 100],
    'Date': [
        '03-06-2025', '23-06-2025', '06-06-2025',
        '05-06-2025', '22-06-2025', '17-06-2025', '30-06-2025'
    ]
}

df = pd.DataFrame(data)
print("Customer Purchase Data:")
print(df)
print()

grouped = df.groupby('CustomerID')

total = grouped['Cost'].aggregate('sum')


median_transaction = grouped['Cost'].aggregate('median')


transaction_count = grouped['Cost'].aggregate('count')


print("Total Amount Spent by Each Customer:")
print(total)
print()

print("Median Transaction Amount for Each Customer:")
print(median_transaction)
print()

print("Count of Transactions for Each Customer:")
print(transaction_count)
