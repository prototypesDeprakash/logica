a=input()
digits = [char for char in a if char.isdigit()]
digits.sort()

res = '+'.join(digits)
print(res)
