import requests
import json

# Set up your API key
API_KEY = "AIzaSyA6iDzTMBC2L_BsV90bNYCico71OSXpNTw"

# Define the endpoint and headers
url = "https://generativelanguage.googleapis.com/v1beta/models/gemini-1.5-flash:generateContent?key=" + API_KEY
headers = {
    'Content-Type': 'application/json',
}

# Define the payload with a safer prompt
print("Enter your querry: ")
query= input()
payload = {
    "contents": [
        {
            "role": "user",
            "parts": [
                {
                    "text": query
                }
            ]
        }
    ]
}

# Make the API request
response = requests.post(url, headers=headers, data=json.dumps(payload))

# Handle the response
if response.status_code == 200:
    response_data = response.json()
    if 'candidates' in response_data:
        for candidate in response_data['candidates']:
            print("Generated Content: ", candidate)
    else:
        print("No candidates generated. Response: ", response_data)
else:
    print("Error: ", response.status_code, response.text)