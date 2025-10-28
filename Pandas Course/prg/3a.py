import pandas as pd

df = pd.read_csv("E:\Semester-7\DSDMA - Lab\prg\custom_dataset.csv")

missing_data = df.isnull()
data_info = df.info()

df.fillna(df.mean(), inplace=True)

print("Cleaned Dataset:")
print(df)

print("Missing Data Information:")
print(missing_data)
print("Dataset Information:")
print(data_info)
