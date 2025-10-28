import pandas as pd
#filtering - keeping hte rows that match a condition

df = pd.read_csv("C:/Users/prave/OneDrive/Desktop/logica/Pandas Course/importingData/data.csv")
print(df[ (df["Weight"]>90) & (df["Height"]>2)])