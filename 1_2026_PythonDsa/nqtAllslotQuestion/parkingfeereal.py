hours = int(input())
fee = 0
if hours<=2:
    fee = hours*100
elif hours <=5:
    fee = 2*100+(hours-2)*50
else:
    fee = 2*100+3*50+(hours-5)*20
    
print(fee)