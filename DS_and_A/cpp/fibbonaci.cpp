#include <iostream>

using namespace std;

// Global variables to store previous Fibonacci numbers
int a = 0;
int b = 1;

// Function to print Fibonacci sequence up to nth term using recursion
void fibbo(int n) {
    if (n > 0) {
        cout << a << " ";
        int c = a + b;
        a = b;
        b = c;
        //backtracking
        fibbo(n - 1);
    }
}

int main() {
    int count = 10; // Number of Fibonacci numbers to print

    // Print Fibonacci sequence up to count terms
    fibbo(count);

    cout << endl;

    return 0;
}
