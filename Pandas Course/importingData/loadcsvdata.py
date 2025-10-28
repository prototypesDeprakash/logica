import pandas as pd
import matplotlib.pyplot as plt
df = pd.read_csv("C:/Users/prave/OneDrive/Desktop/logica/Pandas Course/importingData/data.csv")
print(df)

print("Selection by column example")
#to select singe column do like this 
print(df["Name"])
#to select multiple column do like this
print(df[["Name","Weight"]])

print("Selection by row/s")
print(df.iloc[0:11:2 ,0:3]) #print datas form 0 to 11 only second row  , 0:3 means first 3 columns 
plt.scatter(df["Name"],df["Weight"],color="red",marker='o')
#plt.pie(df["Weight"],labels=df["Name"],autopct='%1.1f%%', startangle=90)
plt.show()
#we can set the index form number to name of the pokeymon by
#index_column="Name"