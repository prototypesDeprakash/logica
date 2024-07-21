#include<iostream>
using namespace std;
#include<vector>
#include<string>

void swap(string &str,int i , int j){
    char temp=str[i];
    str[i]=str[j];
    str[j]=temp;
}

void generatepermutation(string & str,int start , vector<string>&result){
if(start==str.length()-1){
    result.push_back(str);
    return;
}
for(int i=start;i<str.length() ;i++){
    swap(str,start,i);
    generatepermutation(str,start+1,result);
    swap(str,start,i);
}
}
void printPermutations(const vector<string>& permutations) {
    for (const string& perm : permutations) {
        cout << perm << endl;
    }
}
int main(){
    vector<string> result;
    string a="abc";
    generatepermutation(a,0,result);
    printPermutations(result);

}