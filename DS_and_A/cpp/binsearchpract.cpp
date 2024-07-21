#include<iostream>
using namespace std;
int main(){
    int arr[]={1,2,3,4,5,6,7,8,9};
    int key = 8;
    int l=0;
    int h=sizeof(arr)/sizeof(arr[0]);
    while (l<=h)
    {
        int mid = l+(h-l)/2;
        if(arr[mid]<key){
            l=mid+1;
        }
        else if (arr[mid]>key)
        {
            h=mid-1;
        }
        else{
            cout<<mid;
            break;
        }
        
    }
    
}