import pandas as pd
import numpy as np
import matplotlib.pyplot as plt;
from sklearn.linear_model import LinearRegression

data = {
    "Name":["Prakash","Raj","Kumar","John"],
    "Age":[20,21,34,43],
    "Mark":[32,45,89,43]
}

df = pd.DataFrame(data)
print(df)


#1) Querry - high age
high_age = df.query("Age>40")
print(high_age)

#2) time of the day analysis
data2 ={
    "Views":[12,344,56,32],
    "Reactions":[433,432,456,234],
    "timestamp":[
        "29-10-2025 12:53:00",
        "23-10-2025 21:34:00",
        "12-10-2025 4:22:00",
        "9-10-2025 3:32:59"
    ]
}
df2 = pd.DataFrame(data2)
df2['timestamp']=pd.to_datetime(df2['timestamp'])
df2['hour'] = df2["timestamp"].dt.hour
print(df2.query("hour >12"))

df['newcolm'] = np.where(df["Age"]>21 ,"High","Low")
print(df)


x=df[["Age"]]
y=df["Mark"]

model =LinearRegression()
model.fit(x,y)
print(model.predict(x))