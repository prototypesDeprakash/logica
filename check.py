# Simple Google Gemini Chatbot in Python
# Install dependency first:
# pip install google-generativeai

import google.generativeai as genai

# =========================
# CONFIGURE YOUR API KEY
# =========================
API_KEY = ""

genai.configure(api_key=API_KEY)

# Load Gemini model
model = genai.GenerativeModel("gemini-1.5-flash")

print("Simple Gemini Chatbot")
print("Type 'exit' to quit.\n")

# Start chat session
chat = model.start_chat(history=[])

while True:
    user_input = input("You: ")

    if user_input.lower() == "exit":
        print("Bot: Goodbye!")
        break

    try:
        response = chat.send_message(user_input)

        print("Bot:", response.text)
        print()

    except Exception as e:
        print("Error:", e)