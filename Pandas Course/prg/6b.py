import pandas as pd

# Sample employee data
data = {
    "Name": ["Armin", "Kenny", "Levi", "Muzan", "Amen"],
    "Salary": [25000, 40000, 35000, 50000, 30000],
}
# Create DataFrame
df = pd.DataFrame(data)
# Get range from user
low = int(input("Enter minimum salary: "))
high = int(input("Enter maximum salary: "))
# Filter using query
result = df.query("Salary >= @low and Salary <= @high")
print(result)
