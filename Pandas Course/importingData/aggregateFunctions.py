import pandas as pd
#used to summarize and analyze data
# we can find mean , sum etc
df = pd.read_csv("C:/Users/prave/OneDrive/Desktop/logica/Pandas Course/importingData/data.csv")

#whole data frame
print(df.mean(numeric_only=True))
print(df.sum(numeric_only=True))

print(df.min(numeric_only=True))
print(df.max(numeric_only=True))
print(df.count())

print("Single column form a data frame")
print(df["Height"].mean())
print(df["Weight"].sum())

#Group by example
group =df.groupby("Type1")
print(group["Height"].mean())
print(group["Height"].sum())