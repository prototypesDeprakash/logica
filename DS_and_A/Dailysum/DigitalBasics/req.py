import requests

url = "https://2factor.in/API/V1/2cc822c8-dbe3-11ef-8b17-0200cd936042/SMS/+91/AUTOGEN/OTP1"
response = requests.get(url)  # Use 'get' method instead of 'request'

print(response.status_code)  # Print the response status
print(response.text)  # Print the response content
