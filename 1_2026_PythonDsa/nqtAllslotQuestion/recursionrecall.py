#recursion basics
def oneton(i):
    if(i==10):
        return
    
    print(i)
    oneton(i+1)
def solve(arr, maxSum):
    def dfs(i, curr_sum):
        print("Enter -> index:", i, "sum:", curr_sum)

        if curr_sum > maxSum:
            print("  Too big → return")
            return

        if i == len(arr):
            print("  End reached → return")
            return

        # take
        dfs(i + 1, curr_sum + arr[i])

        # don't take
        dfs(i + 1, curr_sum)

        print("Backtrack <- index:", i, "sum:", curr_sum)

    dfs(0, 0)


arr = [3, 5]
maxSum = 5
solve(arr, maxSum)
