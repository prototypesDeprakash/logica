import mediapipe as mp
import cv2
import pyautogui
import pydirectinput

pyautogui.click(291,486)
def detect_hand_gestures():
    cap = cv2.VideoCapture(0)
    mp_hands = mp.solutions.hands
    hands = mp_hands.Hands(static_image_mode=False, max_num_hands=1, min_detection_confidence=0.5)
    mp_drawing = mp.solutions.drawing_utils

    prev_orientation = None
    prev_finger_status = None

    while cap.isOpened():
        ret, frame = cap.read()

        frame = cv2.flip(frame, 1)
        frame_rgb = cv2.cvtColor(frame, cv2.COLOR_BGR2RGB)
        results = hands.process(frame_rgb)

        if results.multi_hand_landmarks:
            for hand_landmarks in results.multi_hand_landmarks:
                thumb_tip = hand_landmarks.landmark[mp_hands.HandLandmark.THUMB_TIP]
                index_tip = hand_landmarks.landmark[mp_hands.HandLandmark.INDEX_FINGER_TIP]

                # Draw lines on the hand
                mp_drawing.draw_landmarks(frame, hand_landmarks, mp_hands.HAND_CONNECTIONS)

                # Determine hand orientation (left or right) based on thumb and index finger position
                if thumb_tip.x < index_tip.x :
                    orientation = "Left"
                    
                    

                  
                    
                else:
                    orientation = "Right"
                    #pydirectinput.press("d")
                    
                    

                # Print hand orientation if it has changed
                if orientation != prev_orientation:
                    if orientation:
                        print(orientation)
                    prev_orientation = orientation

                # Calculate the average y-coordinate of all landmarks
                avg_y = sum([lm.y for lm in hand_landmarks.landmark]) / len(hand_landmarks.landmark)

                # Determine finger status (open or closed)
                if avg_y < 0.5:
                    finger_status = "Start"
                    #pyautogui.press("w")
                    pydirectinput.keyDown("w")
                    pydirectinput.keyUp("s")
                   
                    
                    
                else:
                    finger_status = "Stop"
                    pydirectinput.keyDown("s")
                    pydirectinput.keyUp("w")
                   

                # Print finger status if it has changed
                if finger_status != prev_finger_status:
                    print(finger_status)
                    prev_finger_status = finger_status

        cv2.imshow('Hand Gestures', frame)

        if cv2.waitKey(1) & 0xFF == ord('q'):
            break

    cap.release()
    cv2.destroyAllWindows()
detect_hand_gestures()
