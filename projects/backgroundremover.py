import cv2
import fitz  # PyMuPDF
import numpy as np
from moviepy  import VideoFileClip, ImageClip, CompositeVideoClip
import os

# File paths
pdf_path = "C:/Users/prave/OneDrive/Desktop/logica/projects/rishabpdf.pdf"  # PDF file
video_path ="C:/Users/prave/OneDrive/Desktop/logica/projects/rishabhVideo.mp4"  # Video file
output_video_path = "C:/Users/prave/OneDrive/Desktop/logica/projects/output_video.mp4"  # Output video file
pdf_image_path = "C:/Users/prave/OneDrive/Desktop/logica/projects/pdf_bg.jpg"  # Background image file

# Ensure files exist
if not os.path.exists(pdf_path):
    raise FileNotFoundError(f"PDF file not found: {pdf_path}")
if not os.path.exists(video_path):
    raise FileNotFoundError(f"Video file not found: {video_path}")

# Extract first page of PDF as an image
doc = fitz.open(pdf_path)
pix = doc[0].get_pixmap()
pdf_image = np.frombuffer(pix.samples, dtype=np.uint8).reshape(pix.h, pix.w, pix.n)

# Convert to BGR format if necessary (from RGB)
if pix.n == 3:
    pdf_image = cv2.cvtColor(pdf_image, cv2.COLOR_RGB2BGR)
elif pix.n == 4:
    pdf_image = cv2.cvtColor(pdf_image, cv2.COLOR_RGBA2BGR)

# Save PDF background as an image file
cv2.imwrite(pdf_image_path, pdf_image)

# Ensure the background image file is created
if not os.path.exists(pdf_image_path):
    raise FileNotFoundError(f"Failed to create background image: {pdf_image_path}")

# Load the video
video = VideoFileClip(video_path)

# Resize the background image to match the video size
pdf_clip = ImageClip(pdf_image_path).resized(width=video.w, height=video.h).set_duration(video.duration)

# Overlay the video on top of the background
final_video = CompositeVideoClip([pdf_clip, video.set_position("center")])

# Export the final video
final_video.write_videofile(output_video_path, codec="libx264", fps=video.fps)

print(f"Video saved as {output_video_path}")
