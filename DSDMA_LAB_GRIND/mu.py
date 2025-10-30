import pandas as pd

data ={
    "Name":["mugilan","sandhya","swetha"],
    "Age":[20,21,34],
    "bc":[15,23,231],
  

    "timestamp":[
        '2025-10-28 13:12:00',
        '2025-10-23 8:47:00',
        '2025-10-29 3:34:00'
    ],
    
}

df = pd.DataFrame(data)
print(df)
df['ctr']=df['Age']/df['bc'] *100
df["timestamp"] = pd.to_datetime(df["timestamp"])
df['hour']=df["timestamp"].dt.hour

print(df)