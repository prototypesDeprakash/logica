import pyautogui
import time
import random

text = '''
 Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();

        HashMap<Character, Integer> freqMap = new HashMap<>(); // To store frequency of characters

        // Count the frequency of each character
        for (char ch : s.toCharArray()) {
            freqMap.put(ch, freqMap.getOrDefault(ch, 0) + 1);
        }

        // Print characters that repeat
        for (Map.Entry<Character, Integer> entry : freqMap.entrySet()) {
            if (entry.getValue() > 1) { // If frequency > 1, it is repeating
                System.out.print(entry.getKey() + " ");
            }
        } 
        '''
time.sleep(1)     if (entry.get)
for char in text:
    
    pyautogui.typewrite(char)
    time.sleep(random.uniform(0.009,0.02))  # Random delay between keystrokes sc