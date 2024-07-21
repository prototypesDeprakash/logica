#include<iostream>
using namespace std;
#include <vector>
#include<algorithm>
//return type is pair 
pair<int,int> findminmax(const vector<int> & arr , int low, int high){
if(low==high){
    return {arr[low],arr[high]};
}
if(high==low+1){
    if (arr[low]<arr[high])
    {
        return {arr[low],arr[high]};
    }
    else{
        return {arr[high],arr[low]};
    }    
}
int mid= low+(high-low)/2;
pair<int,int> left = findminmax(arr,low,mid);
pair<int,int> right = findminmax(arr,mid+1,high);
int minval= min(left.first,right.first);
int maxval=max(left.second,right.second);
return {minval,maxval};
}
int mai(vector<int> & arr){
    auto mini = min_element(arr.begin(),arr.end());
    auto maxi = max_element(arr.begin(),arr.end());
    cout<<"Maximum element is  : "<<*mini;
    cout<<endl;
    cout<<"Minimum element is : "<<*maxi;
}
int main(){
    vector <int> arr= {1,2,3,4,5,6,77,9};
   pair <int,int> result =  findminmax(arr,0,arr.size()-1);
   
mai(arr);
   

    }