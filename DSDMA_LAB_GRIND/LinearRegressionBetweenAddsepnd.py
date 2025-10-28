import pandas as pd
from sklearn.linear_model import LinearRegression
import matplotlib.pyplot as plt

data = {
        'AdSpend':[1000,2000,4500,3000],
        'Revenue':[3000,5000,7000,9000]
        }
df=pd.DataFrame(data)
print(df)

x=df[['AdSpend']]
y=df['Revenue']
model = LinearRegression()
model.fit(x,y)
pred = model.predict(x)

plt.scatter(df['AdSpend'] , df['Revenue'],color='blue', label='Actual Data')
plt.plot(df['AdSpend'],pred,color ='red',label = "LinearRegression")
plt.xlabel("ad Spent")
plt.ylabel("Revenue")
plt.show()