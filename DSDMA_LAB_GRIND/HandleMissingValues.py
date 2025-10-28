import pandas as pd
data = {

    "Name":['prakash','Thomas','Kumar'],
    "Age":[20,21,19],
    "Degree":["Btech",None,None]
}

df = pd.DataFrame(data)
print(df)

#couting missing values

print(df.isnull().sum())

#Remvoe missing values (removes the entire row)
#df.dropna(inplace=True)
#df.fillna("fuck",inplace=True)

#df.fillna(method = 'ffill',inplace=True)  # forward fill , same we can do backward fill also
# df.sort_values(by="Age",ascending=True,inplace=True )
# print(df)

# high_age = df[df["Age"]>19]
# print("Age > 19")
# print(high_age)

print("-------------------------------------")
print(df.query("Age <=19"))