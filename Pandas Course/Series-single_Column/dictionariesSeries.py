import pandas as pd 

calories = {"Day 1":1750 , "Day 2":2100 , "Day 3": 1700}

series =  pd.Series(calories )

series.loc["Day 3"]+=500 
print(series.loc["Day 3"]) 
print("days where i didnt follow my diet")
print(series[series>=2000])

print("days where i followed my diet")
print(series[series<2000])