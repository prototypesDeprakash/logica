import pandas as pd

technologies = {
    "Course": ["Excel", "Data Analysis", "SQL", "Python", "Power BI", "Excel"],
    "Fee": [15000, 18000, 17000, 20000, 19000, 16000],
    "Duration": ["20days", "30days", "25days", "35days", "40days", "20days"],
    "Discount": [1000, 1500, 1200, 1800, 1600, 1100],
}

df = pd.DataFrame(technologies)
print("DataFrame:")
print(df)
print()

# Aggregate Functions: Sum
print("Aggregate Functions sum on Fee and Discount:")
result = df[["Fee", "Discount"]].aggregate("sum")
print(result)
print()

# Aggregate Functions: Mean (instead of invalid 'average')
print("Aggregate Functions mean on Fee and Discount:")
result = df[["Fee", "Discount"]].aggregate("mean")
print(result)
print()

# Aggregate Functions: Min and Max per Course
print("Minimum and Maximum Fee for each Course:")
result = df.groupby("Course")["Fee"].aggregate(["min", "max"])
print(result)
print()

# Aggregate Functions: Mean using .mean() directly
print("Mean value on Fee and Discount:")
result = df[["Fee", "Discount"]].mean()
print(result)
