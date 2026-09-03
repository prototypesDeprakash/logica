import requests


number = input("Enter Indian mobile number: ").strip()

# Add +91 if the user enters a 10-digit Indian number
if number.isdigit() and len(number) == 10:
    number = "+91" + number

url = "http://apilayer.net/api/validate"

params = {
    "access_key": API_KEY,
    "number": number,
    "country_code": "IN",
    "format": 1
}

response = requests.get(url, params=params)

if response.status_code != 200:
    print("HTTP Error:", response.status_code)
    exit()

data = response.json()

if not data.get("valid"):
    print("Invalid phone number.")
    exit()

print("\n--- Phone Details ---")
print("Number       :", data.get("international_format"))
print("Local format :", data.get("local_format"))
print("Country      :", data.get("country_name"))
print("Country code :", data.get("country_code"))
print("Location     :", data.get("location"))
print("Carrier      :", data.get("carrier"))
print("Line type    :", data.get("line_type"))