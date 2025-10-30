import pandas as pd
from sklearn.linear_model import LinearRegression
import matplotlib.pyplot as plt


data ={
    "Addspend":[1000,2000,4500,3000],
    "impression":[3000,5000,7000,9000]
}

df = pd.DataFrame(data)
print(df)
x=df[["Addspend"]]
y=df["impression"]
model =LinearRegression()
pre =model.fit( x,y)
print(model.predict(x))

plt.scatter(df["Addspend"],df["impression"],color="blue")
plt.plot(df["Addspend"],model.predict(x))
plt.show()