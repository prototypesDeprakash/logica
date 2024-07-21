import cv2
import pyautogui
import mediapipe as mp

pyautogui.FAILSAFE = False
screen_width,screen_height=pyautogui.size()
hand_detector=mp.solutions.hands.Hands()
drawing_utils=mp.solutions.drawing_utils
cap =cv2.VideoCapture(0)
index1_y=0
click_held = False
while True:
    _,frame = cap.read()#here _ is used to discard the boolean value given by the cap.read()
    #we only need the frame so _ is just a placeholder to discard bool value
    frame = cv2.flip(frame, 1) #flipping frame
    frame_height,frame_width,_=frame.shape
    #converting test
    rgb_frame=cv2.cvtColor(frame,cv2.COLOR_BGR2RGB)
    output=hand_detector.process(rgb_frame)
    hands=output.multi_hand_landmarks
    if hands:
        for hand_landmarks in hands:
            drawing_utils.draw_landmarks(frame, hand_landmarks, mp.solutions.hands.HAND_CONNECTIONS)
            landmarks=hand_landmarks.landmark
            for id,landmark in enumerate(landmarks):
                x=int(landmark.x*frame_width)
                y=int(landmark.y*frame_height)
                #print(x,y)
                if(id==8):
                    cv2.circle(img=frame,center=(x,y),radius=15,color=(0,255,255))
                    index_x=screen_width/frame_width*x
                    index_y=screen_height/frame_height*y
                    index1_y=index_y
                    pyautogui.moveTo(index_x,index_y)
                if(id==4):
                    cv2.circle(img=frame,center=(x,y),radius=15,color=(0,255,255))
                    thumb_x=screen_width/frame_width*x
                    thumb_y=screen_height/frame_height*y
                    if(abs(index1_y-thumb_y)<20):
                        print("click")
                        if not click_held:
                            print("click held")
                            # Press and hold the mouse button
                            pyautogui.mouseDown(index_x, index_y)
                            click_held = True
                    else:
                        if click_held:
                            print("click released")
                            # Release the mouse button
                            pyautogui.mouseUp()
                            click_held = False
                        
                        
                        



    

    cv2.imshow('Virtual mouse ',frame) # naming my frame
    cv2.waitKey(1) 
#-----


    
