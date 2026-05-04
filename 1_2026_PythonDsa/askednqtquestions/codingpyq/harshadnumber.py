#Harshad number
n=int(input())

sumofdigits=0
n2=n
while (n!=0):
  temp=n%10
  sumofdigits+=temp
  n=n//10
if(n2%sumofdigits ==0):
  print("Yes")
else:
  print("No")
  
  