hours = int(input())
fine =0
if(hours<=2):
    fine=100
elif(hours>2 and hours<=5):
    fine=50
elif(hours>5):
    fine=20
print(fine)
