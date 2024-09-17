import random
import string
import time

target = "Hello word !"
letters = string.ascii_letters+" "+"!"
result=""
for letter in target:
    while True:
        L=random.choice(letters)
        print(result+L)
        if(L==letter):
            result+=L
            break
        time.sleep(0.01)