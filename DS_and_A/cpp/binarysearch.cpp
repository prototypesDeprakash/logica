#include<iostream>
using namespace std;
#include<cmath>

int main(){
    int arr[]={1,2,3,4,5,6,7,8,9};
    int l=0;
    int h=sizeof(arr)/sizeof(arr[0]);
    int mid;
    int key=8;
    while (l<=h)
    {
       mid=l+(h-l)/2;
       if(arr[mid]>key){
        h=mid-1;
       }
       if(arr[mid]<key){
        l=mid+1;
       }
       else{
        cout<<"target found at"<< mid ;
        break;
       }
    }
    
}