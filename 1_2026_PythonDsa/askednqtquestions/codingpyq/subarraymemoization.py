import sys

# Increase recursion depth for larger arrays
sys.setrecursionlimit(2000)

arr = list(map(int, input().replace(',', ' ').split()))
total = sum(arr)

if total % 2 != 0:
    print("false")
    exit()

target = total // 2
memo = {}

def can_partition(i, current_sum):
    # Check if we already calculated this state
    state = (i, current_sum)
    if state in memo:
        return memo[state]
    
    if current_sum == target:
        return True
    if i >= len(arr) or current_sum > target:
        return False

    # Store the result in memo before returning
    res = can_partition(i + 1, current_sum + arr[i]) or can_partition(i + 1, current_sum)
    memo[state] = res
    return res

if can_partition(0, 0):
    print("true")
else:
    print("false")