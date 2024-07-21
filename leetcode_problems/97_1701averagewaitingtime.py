customers = [[1,2],[2,5],[4,3]]
time=0
waiting=0
for  i , j in customers:
    time+=i
    waiting=time-j
    