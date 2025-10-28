import pandas as pd


data = {

    "Name":['prakash','Thomas','Kumar'],
    "Age":[20,21,None],
    "Degree":["Btech",None,None]
}

df = pd.DataFrame(data)
print(df)

print(df.isnull().sum())