import pandas as pd
print(pd.__version__)

#series in pandas
# 1 dimensional labeled array
# eg- single column in a spread sheet
  
data = ["Prakash","John Davis","oak Kudas",120]
series = pd.Series(data,index=["User Name","User identity","user crazy identiry","user id"])
print(series)

print("selecting by lable")
print(series.loc["User identity"]) #loc means locking to a lable

data2 = [100,101,102]
series2=pd.Series(data2,index=["a","b","c"])
print(series2.loc["c"])
series2.loc["c"] = 200 # so we can also update a value using its lable in the series
print(series2)

# we can also get data with the integer location (idex) instead of lable
print(series2.iloc[0])
