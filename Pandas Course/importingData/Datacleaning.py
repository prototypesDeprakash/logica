import pandas as pd
df = pd.read_csv("C:/Users/prave/OneDrive/Desktop/logica/Pandas Course/importingData/data.csv")

#data celaning - fixing / removing  incomplete, incorrect or irrelevant data

df=df.drop(columns=["Legendary","No"])

#Handling missing data
#df=df.dropna(subset=["Type2"])  #Remove missing values 
df=df.fillna({"Type2":"No power"})  #replace missing values
print(df.to_string())