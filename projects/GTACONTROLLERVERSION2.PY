import mediapipe as mp
import cv2
import pydirectinput
import numpy as np

def calculate_centroid(hand_landmarks):
    landmark_points = np.array([[lm.x, lm.y] for lm in hand_landmarks.landmark])
    centroid = np.mean(landmark_points, axis=0)
    return centroid[0]  # Return only the x-coordinate for simplicity

def detect_hand_gestures():
    cap = cv2.VideoCapture(0)
    mp_hands = mp.solutions.hands
    hands = mp_hands.Hands(static_image_mode=False, max_num_hands=1, min_detection_confidence=0.5)
    mp_drawing = mp.solutions.drawing_utils

    prev_orientation = None
    prev_finger_status = None
    avg_y = 0

    while cap.isOpened():
        ret, frame = cap.read()

        frame = cv2.flip(frame, 1)
        frame_rgb = cv2.cvtColor(frame, cv2.COLOR_BGR2RGB)
        results = hands.process(frame_rgb)

        if results.multi_hand_landmarks:
            for hand_landmarks in results.multi_hand_landmarks:
                palm_x = calculate_centroid(hand_landmarks)

                # Draw lines on the hand
                mp_drawing.draw_landmarks(frame, hand_landmarks, mp_hands.HAND_CONNECTIONS)

                # Determine hand orientation (left or right) based on palm position
                if palm_x < 0.33:  # If palm is in left section
                    orientation = "Left"
                    if prev_orientation != "Left":
                        pydirectinput.keyDown("a")
                    elif prev_orientation == "Right":
                        pydirectinput.keyUp("d")
                elif palm_x > 0.67:  # If palm is in right section
                    orientation = "Right"
                    if prev_orientation != "Right":
                        pydirectinput.keyDown("d")
                    elif prev_orientation == "Left":
                        pydirectinput.keyUp("a")
                else:
                    orientation = None
                    if prev_orientation == "Left":
                        pydirectinput.keyUp("a")
                    elif prev_orientation == "Right":
                        pydirectinput.keyUp("d")

                # Print hand orientation if it has changed
                if orientation and orientation != prev_orientation:
                    print(orientation)
                    prev_orientation = orientation

                # Calculate the average y-coordinate of all landmarks
                avg_y = np.mean([lm.y for lm in hand_landmarks.landmark])

            # Determine finger status (open or closed)
            if avg_y < 0.5:
                finger_status = "Start"
                if prev_finger_status != "Start":
                    pydirectinput.keyDown("w")
                    pydirectinput.keyUp("s")
            else:
                finger_status = "Stop"
                if prev_finger_status != "Stop":
                    pydirectinput.keyDown("s")
                    pydirectinput.keyUp("w")

            # Print finger status if it has changed
            if finger_status and finger_status != prev_finger_status:
                print(finger_status)
                prev_finger_status = finger_status

        cv2.imshow('Hand Gestures', frame)

        if cv2.waitKey(1) & 0xFF == ord('q'):
            break

    cap.release()
    cv2.destroyAllWindows()

detect_hand_gestures()
