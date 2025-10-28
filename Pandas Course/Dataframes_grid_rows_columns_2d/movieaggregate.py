import pandas as pd

data ={"Movies":["Avengers","Batman","Dune3","Tenet"],
       "Cost":[100,154,122,342]
       }
df = pd.DataFrame(data,index=["Movie 1","Movie 2","Movie 3","Movie 4"])
new_row = pd.DataFrame([{"Movies":"Minecraft","Cost":872}],index=["Movie 5"]) #adding row
df=pd.concat([df,new_row])

df["rating"]=[9.2,9.8,9.9,7.9,8.5]
df.index.name="no"
print(df.sort_values(by=["rating"])[::-1]) #ascending order
#print(df[df["rating"]>9])