x=12345
res=0
while(x!=0):
    x=x//10
    res+=1
print(res)


# count trailing zeros
def trailingZeroes(n):
    count = 0

    while n > 0:
        n //= 5
        count += n

    return count
print(trailingZeroes(99))