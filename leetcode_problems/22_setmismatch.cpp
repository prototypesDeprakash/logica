#include<iostream>
#include<stdlib.h>
#include <vector>
using namespace std;
int main(){
    vector<int> myVector;
    int nums[] = {1,1};
    for(int i=0;i<2;i++){
        if(nums[i]==nums[i+1]){
            myVector.push_back(nums[i]);
            myVector.push_back(nums[i]+1);
            
        }
    }
    for (int i : myVector) {
        std::cout << i << " ";
    }
}