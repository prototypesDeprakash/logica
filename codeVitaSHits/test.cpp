#include <iostream>
#include <vector>
#include <string>
#include <map>
using namespace std;

map<string, char> patterns = {
    {"_ | ||_|", '0'}, {"    | |", '1'}, {"_ _||_ ", '2'},
    {"_ _| _|", '3'}, {"  |_| |", '4'}, {"_|_  _|", '5'},
    {"_|_ |_|", '6'}, {"_  | |", '7'}, {"_|_||_|", '8'},
    {"_|_| _|", '9'}, {"      ", '='}, {"  _ _  ", '+'},
    {"       ", '-'}, {"_ |_ |", '*'}, {"_ |_| |", '%'}
};

int evaluate(vector<char> &eq) {
    int lhs = 0, num = 0, op = '+';
    for (char c : eq) {
        if (isdigit(c)) num = num * 10 + (c - '0');
        else {
            if (op == '+') lhs += num;
            if (op == '-') lhs -= num;
            if (op == '*') lhs *= num;
            if (op == '%') lhs %= num;
            num = 0, op = c;
        }
    }
    lhs += num;
    return lhs;
}

int main() {
    vector<string> digits = {"_ | ||_|", "    | |", "_ _||_ ", "_ _| _|", "  |_| |", 
                           "_|_  _|", "_|_ |_|", "_  | |", "_|_||_|", "_|_| _|"};
    int n;
    cin >> n;
    vector<string> display(3);
    cin.ignore();
    for (int i = 0; i < 3; i++) getline(cin, display[i]);

    vector<string> characters(n);
    for (int i = 0; i < n; i++) {
        string ch = "";
        for (int j = 0; j < 3; j++)
            ch += display[j].substr(i * 3, 3);
        characters[i] = ch;
    }

    vector<char> eq;
    for (string ch : characters) eq.push_back(patterns[ch]);

    int rhs = eq.back() - '0';
    eq.pop_back();
    eq.pop_back();
    int result = evaluate(eq);

    for (int i = 0; i < n; i++) {
        string original = characters[i];
        for (string d : digits) {
            if (d == original) continue;
            characters[i] = d;
            vector<char> temp;
            for (string ch : characters) temp.push_back(patterns[ch]);
            if (evaluate(temp) == rhs) {
                cout << i + 1 << endl;
                return 0;
            }
        }
        characters[i] = original;
    }
    return 0;
}