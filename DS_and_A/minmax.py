def findmaxmin(arr, low, high):
    if low == high:
        return low, high  # Base case: Only one element
    elif high - low == 1:
        if arr[low] < arr[high]:
            return low, high
        else:
            return high, low  # Base case: Two elements
    else:
        midi = (low + high) // 2
        
        # Recursively find min and max in left and right halves
        leftmin, leftmax = findmaxmin(arr, low, midi)
        rightmin, rightmax = findmaxmin(arr, midi + 1, high)
        
        # Determine overall min and max indices
        overall_min = leftmin if arr[leftmin] < arr[rightmin] else rightmin
        overall_max = leftmax if arr[leftmax] > arr[rightmax] else rightmax
        
        return overall_min, overall_max

# Example usage:
arr = [5, 4, 7, 8, 9, 0, 1]
n = len(arr) - 1

min_index, max_index = findmaxmin(arr, 0, n)

print("Minimum element:", arr[min_index])
print("Maximum element:", arr[max_index])
