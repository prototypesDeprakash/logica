import pandas as pd
import matplotlib.pyplot  as plt

data ={'Campain':["A","B","C"],
       "Impression":[123,53,242]}
df=pd.DataFrame(data)

plt.bar(df['Campain'], df['Impression'] ,color='red')
plt.show()
 