import requests

# Replace with your YouTube Data API key and video ID
API_KEY = 'AIzaSyAO_FJ2SlqU8Q4STEHLGCilw_Y9_11qcW8'
VIDEO_ID = 'I_NBnMztCsI'

# YouTube Data API endpoint for videos
api_url = f'https://www.googleapis.com/youtube/v3/videos?id={VIDEO_ID}&key={API_KEY}&part=snippet,contentDetails,statistics'

try:
    # Make a GET request to retrieve video details
    response = requests.get(api_url)

    # Check if the request was successful (status code 200)
    if response.status_code == 200:
        video_data = response.json()

        # Example: Print some details of the video
        title = video_data['items'][0]['snippet']['title']
        views = video_data['items'][0]['statistics']['viewCount']
        likes = video_data['items'][0]['statistics']['likeCount']
        description = video_data['items'][0]['snippet']['description']

        print(f"Title: {title}")
        print(f"Views: {views}")
        print(f"Likes: {likes}")
        print(f"Description: {description}")

    else:
        print(f"Error: {response.status_code} - {response.text}")

except requests.exceptions.RequestException as e:
    print(f"Error: {e}")
