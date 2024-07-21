#include <iostream>
#include <vector>

using namespace std;

// Merge function to merge two halves of the array
void merge(vector<int>& array, int left, int middle, int right) {
    int leftSize = middle - left + 1;
    int rightSize = right - middle;

    // Create temporary arrays
    vector<int> leftArray(leftSize), rightArray(rightSize);

    // Copy data to temporary arrays leftArray[] and rightArray[]
    for (int i = 0; i < leftSize; i++)
        leftArray[i] = array[left + i];
    for (int j = 0; j < rightSize; j++)
        rightArray[j] = array[middle + 1 + j];

    // Merge the temporary arrays back into array[left..right]
    int i = 0; // Initial index for leftArray[]
    int j = 0; // Initial index for rightArray[]
    int k = left; // Initial index for merged subarray
    while (i < leftSize && j < rightSize) {
        if (leftArray[i] <= rightArray[j]) {
            array[k] = leftArray[i];
            i++;
        } else {
            array[k] = rightArray[j];
            j++;
        }
        k++;
    }

    // Copy the remaining elements of leftArray[], if any
    while (i < leftSize) {
        array[k] = leftArray[i];
        i++;
        k++;
    }

    // Copy the remaining elements of rightArray[], if any
    while (j < rightSize) {
        array[k] = rightArray[j];
        j++;
        k++;
    }
}

// Merge sort function
void mergeSort(vector<int>& array, int left, int right) {
    if (left < right) {
        // Find the middle point
        int middle = left + (right - left) / 2;

        // Sort first and second halves
        mergeSort(array, left, middle);
        mergeSort(array, middle + 1, right);

        // Merge the sorted halves
        merge(array, left, middle, right);
    }
}

// Utility function to print an array
void printArray(const vector<int>& array) {
    for (int num : array)
        cout << num << " ";
    cout << endl;
}

// Main function
int main() {
    vector<int> array = {12, 11, 13, 5, 6, 7};
    int size = array.size();

    cout << "Given array is \n";
    printArray(array);

    mergeSort(array, 0, size - 1);

    cout << "\nSorted array is \n";
    printArray(array);

    return 0;
}
