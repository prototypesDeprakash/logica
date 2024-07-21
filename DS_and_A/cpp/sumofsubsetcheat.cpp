#include <iostream>
#include <vector>
using namespace std;

void findSubset(vector<int>& arr, int key, vector<pair<int, int>>& result) {
    for (int i = 0; i < arr.size(); i++) {
        for (int j = i + 1; j < arr.size(); j++) {
            if (arr[i] + arr[j] == key) {
                result.push_back({arr[i], arr[j]});
            }
        }
    }
}

int main() {
    vector<int> arr;
    int n;

    cout << "Enter the number of elements to add: " << endl;
    cin >> n;

    int x;
    for (int i = 0; i < n; i++) {
        cout << "Enter the element: ";
        cin >> x;
        arr.push_back(x);
    }

    cout << "Enter the value of m: ";
    int key;
    cin >> key;

    vector<pair<int, int>> result;
    findSubset(arr, key, result);

    cout << "The sum of the subset is: " << endl;
    for (const auto& c : result) {
        cout << "[" << c.first << ", " << c.second << "]" << endl;
    }

    return 0;
}
