a="7L 7R 7L 8L 6R 7R 8R 6R"
shoes=list(a.split())

left ={}
right ={}

for shoe in shoes:
    size=shoe[:-1]
    foot=shoe[-1]
    if foot =='L':
        left[size] =left.get(size,0)+1
    else:
        right[size]=right.get(size,0)+1
pairs=0
for size in left:
    if size in right:
        pairs+=min(left[size],right[size])
print(pairs)