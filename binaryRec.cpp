#include <iostream>
using namespace std;
int binary(int arr[],int low,int high){
    int key=7;
    int mid=(low+high)/2;
    if(arr[mid]==key){
        return mid;
    }
    else if(arr[mid]<key){
        
       return binary(arr,mid,high);
    } 
    else{
       return binary(arr,low,mid);
    }
    
    return -1;
}
int main() {
    int arr[]={1,2,3,4,5,6,7,8,9,10};
    cout<<binary(arr,0,10);
    return 0;
}
