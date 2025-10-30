import pandas as pd
import seaborn as sb
import matplotlib.pylab as plt

data = {
    'Campaign': ['A', 'B', 'C', 'D'],
    'Clicks': [120, 90, 300, 150],
    'Impressions': [1000, 800, 2000, 1500],
    'Engagements': [400, 250, 600, 500]
}

df= pd.DataFrame(data)
df.set_index('Campaign',inplace=True)
sb.heatmap(df)
plt.show()