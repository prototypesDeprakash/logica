import mediapipe as mp
import cv2

def detect_hand_gestures():
    cap = cv2.VideoCapture(0)
    mp_hands = mp.solutions.hands
    hands = mp_hands.Hands(static_image_mode=False, max_num_hands=1, min_detection_confidence=0.5)
    mp_drawing = mp.solutions.drawing_utils

    while cap.isOpened():
        ret, frame = cap.read()

        frame = cv2.flip(frame, 1)
        frame_height, frame_width, _ = frame.shape
        third_width = frame_width // 3

        # Draw vertical dividing lines
        cv2.line(frame, (third_width, 0), (third_width, frame_height), (255, 255, 255), 1)
        cv2.line(frame, (2 * third_width, 0), (2 * third_width, frame_height), (255, 255, 255), 1)

        # Add text annotations
        cv2.putText(frame, "Left", (20, 50), cv2.FONT_HERSHEY_SIMPLEX, 1, (255, 255, 255), 2)
        cv2.putText(frame, "Center", (third_width + 20, 50), cv2.FONT_HERSHEY_SIMPLEX, 1, (255, 255, 255), 2)
        cv2.putText(frame, "Right", (2 * third_width + 20, 50), cv2.FONT_HERSHEY_SIMPLEX, 1, (255, 255, 255), 2)

        cv2.imshow('Hand Gestures', frame)

        if cv2.waitKey(1) & 0xFF == ord('q'):
            break

    cap.release()
    cv2.destroyAllWindows()

detect_hand_gestures()
