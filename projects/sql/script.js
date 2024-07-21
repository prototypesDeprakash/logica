function generate() {
    
    
    const query = document.getElementById('inputquerry').value;
    const apiKey = "AIzaSyA6iDzTMBC2L_BsV90bNYCico71OSXpNTw";
    const url = `https://generativelanguage.googleapis.com/v1beta/models/gemini-1.5-flash:generateContent?key=${apiKey}`;
    const headers = {
        'Content-Type': 'application/json',
    };

    const payload = {
        contents: [
            {
                role: "user",
                parts: [
                    {
                        text: query
                    }
                ]
            }
        ]
    };

    fetch(url, {
        method: 'POST',
        headers: headers,
        body: JSON.stringify(payload)
    })
    .then(response => response.json())
    .then(data => {
        console.log(data); // Log the entire response to inspect its structure
        const resultDiv = document.getElementById('resultsHolder');
        resultDiv.innerHTML = ''; // Clear previous results

        // Check if the candidates array and its first element exist in the response
        if (data.candidates && data.candidates.length > 0 && data.candidates[0].content && data.candidates[0].content.parts && data.candidates[0].content.parts.length > 0) {
            // Extract the text content from the response
            const text = data.candidates[0].content.parts[0].text;

            // Create a paragraph element to display the text
            const paragraph = document.createElement('p');
            paragraph.innerHTML = text.replace(/\n/g, '<br>'); // Replace newline characters with <br> for HTML
            resultDiv.appendChild(paragraph);
        } else {
            resultDiv.textContent = 'No content generated. Response: ' + JSON.stringify(data);
        }
    })
    .catch(error => {
        const resultDiv = document.getElementById('resultsHolder');
        resultDiv.textContent = 'Error: ' + error.message;
    });
};
