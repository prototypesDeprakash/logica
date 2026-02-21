grades = {'Alice': 95, 'Bob': 87, 'Charlie': 92}


for key in grades.keys():
    print(key)

for values in grades.values():
    print(values)

for key,values in grades.items():
    print(f"{key}-{values}")

# sort by keys
print(dict(sorted(grades.items())))

# sort by values
print(sorted(grades.items() , key=lambda x: x[1] , reverse=True))


add = lambda a,b : a+b
print(add(2,4))

greet  = lambda : "hi"
print(greet())