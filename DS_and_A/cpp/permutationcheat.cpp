#include <iostream>
#include <algorithm>
#include <string>

using namespace std;

void next_permutation(){
}
int main() {
    string str = "abc";

    do {
        cout << str << endl;
    } while (next_permutation(str.begin(), str.end()));

    return 0;
}
