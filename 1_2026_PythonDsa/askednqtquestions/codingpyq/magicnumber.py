#magicnumber
n=int(input())
res=0
for i in range(1,n):
  if(n%i==0):
    res+=i
if(res==n):
  print(f"{n} is a perfect number")
else:
  print("Not a perfect number")