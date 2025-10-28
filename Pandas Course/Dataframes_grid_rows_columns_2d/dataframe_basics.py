import pandas as pd 
data = {
         "Name":["Sponj Bob","Patrick","squidWard"], #column 1
         "Age":[30,35,58] #column 2
        }
df = pd.DataFrame(data,index=["Employee 1","Employee 2","Employee 3"])
#print(df)
print("access a specific row")
print(df.loc["Employee 2"])
print("adding a  new column")
df["Job"]=["cook","friend of bob","Cashier"]


print("adding a new row")
new_row  = pd.DataFrame([{"Name":"Sandy","Age":28,"Job":"hecking"}]  ,index=["Employee 4"])
df=pd.concat([df,new_row])
print(df)