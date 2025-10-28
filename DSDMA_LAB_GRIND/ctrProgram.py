import pandas as pd


data ={
    "impression":[90,67,87,32],
    "Clicks":[32,56,22,12]
}
df = pd.DataFrame(data)
df['CTR']=(df['Clicks']/df['impression']) *100

print(df)