import pandas as pd
data={
    'id':[4,5,3],
    'name':["olgret","marla","jackson"],
    'age':[32,34,40],
    'marks':[65,98,37]
}
df1 = pd.read_csv("C:/Users/prave/OneDrive/Desktop/logica/DSDMA_LAB_GRIND/test.csv")
df2 =pd.DataFrame(data)
merged_df = pd.merge(df1,df2,on="id")
print(merged_df)

concat_df = pd.concat([df1,df2],ignore_index=True)
print(concat_df)