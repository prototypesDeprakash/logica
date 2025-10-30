import matplotlib.pyplot as plt
import pandas as pd
from mpl_toolkits.mplot3d import Axes3D

# Sample data
data = {
    'Impressions': [1000, 2000, 1500, 3000],
    'Clicks': [50, 100, 75, 150],
    'Revenue': [5000, 10000, 7500, 15000]
}
df = pd.DataFrame(data)

figure = plt.figure()

axis  = figure.add_subplot(111,projection ='3d')
axis.scatter(df['Impressions'],df['Clicks'],df['Revenue'],color='red')

plt.show()

plt.figure().add_subplot(111,projection='3d')
plt.figure().add_subplot(111,projection = '3d')
