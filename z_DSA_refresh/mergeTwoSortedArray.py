arr1 = [1, 3, 5, 5,7]
arr2 = [2, 3, 4, 8]

def merge():
    mergedArray = arr1+arr2
    mergedArray.sort()
    return mergedArray

def mergeSortedArray():
    result =[]
    i=0
    j=0
    while(i<len(arr1) and j<len(arr2)):
        # sorting the elements by ascending order 
        if(arr1[i]<arr2[j]):
            result.append(arr1[i]) # if arr1's ith element is smaller then add it first
            i+=1 #increment the i pointer
        else:
            result.append(arr2[j])  # if arr2's ith element is smaller then add it first
            j+=1 #increment the j pointer
        # adding the remaining elements
        while i<len(arr1):
            result.append(arr1[i]) # since the original array is sorted it will add the remaining
                                   # element in correct order
            i+=1
        while j<len(arr2):
            result.append(arr2[j])
            j+=1
    return result
print(mergeSortedArray())