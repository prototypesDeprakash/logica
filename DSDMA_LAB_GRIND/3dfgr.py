import matplotlib.pyplot as plt 
import pandas as pd

data = {
    'Impressions': [55, 43, 10,500],
    'Clicks': [5, 10, 15, 25],
    'Revenue': [5000, 10000, 7500, 15000]
}

df = pd.DataFrame(data)
axis = plt.figure().add_subplot(111,projection="3d")
axis.scatter(df['Impressions'],df['Clicks'],df['Revenue'] ,color = 'red')
plt


plt.show()