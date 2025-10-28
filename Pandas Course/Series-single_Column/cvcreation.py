import pandas as pd
import os

# Define sample telecommunication data
data = [
    ["Airtel", "Prepaid", "Individual", "Delhi", 200, 120],
    ["Airtel", "Postpaid", "Business", "Mumbai", 350, 250],
    ["Jio", "Prepaid", "Individual", "Chennai", 180, 100],
    ["Jio", "Postpaid", "Business", "Bangalore", 400, 320],
    ["Vi", "Prepaid", "Individual", "Hyderabad", 210, 150],
    ["Vi", "Postpaid", "Business", "Pune", 300, 230],
    ["BSNL", "Prepaid", "Individual", "Kolkata", 170, 90],
    ["BSNL", "Postpaid", "Business", "Delhi", 280, 200],
    ["Airtel", "Prepaid", "Business", "Chennai", 250, 180],
    ["Jio", "Postpaid", "Individual", "Mumbai", 320, 260]
]

# Define column names
columns = ["Network", "Service", "CustomerSegment", "City", "Data_Usage_GB", "Call_Minutes"]

# Create DataFrame
df = pd.DataFrame(data, columns=columns)

# Get the current working directory
current_dir = os.getcwd()

# File path for saving
file_path = os.path.join(current_dir, "telecom_data.csv")

# Save the DataFrame to CSV
df.to_csv(file_path, index=False)

print(f"✅ CSV file 'telecom_data.csv' created successfully at:\n{file_path}")
