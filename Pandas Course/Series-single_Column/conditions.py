import pandas as pd
data =[100,101,102,103]
series = pd.Series(data,index=["a","b","c","d"])

print(series.iloc[0])# access with index
print(series.loc["a"]) #locate with lable

print("-------conditional operations---------")
print("series that are greater than 100")
print(series[series>100]) 
