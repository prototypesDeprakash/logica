import pandas as pd
df = pd.read_csv("C:/Users/prave/OneDrive/Desktop/logica/DSDMA_LAB_GRIND/test.csv")

#display first 5 elements form a csv
print(df.head())
#Displays column name
print(df.columns)
#row,col number 3*4
print(df.shape)

print(df.info)
print(df.describe)