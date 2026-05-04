n=int(input())
arr=list(map(int,input().split()))
k=int(input())

no_of_rotations=arr.index(min(arr))

k_pos_in_org_arr=(arr.index(k)-no_of_rotations+n)%n

print(no_of_rotations)
print(k_pos_in_org_arr)
