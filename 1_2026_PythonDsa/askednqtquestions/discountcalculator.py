amount = int(input())
if(amount<1000):
    discount = amount *(5/100)
    amount-=discount
elif(amount>=1000 and amount < 5000):
    discount = amount *(10/100)
    amount-=discount
else:
    discount = amount*(15/100)
    amount-=discount

print(f"{amount:.2f}")
