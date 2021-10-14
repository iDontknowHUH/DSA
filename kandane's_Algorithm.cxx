#include<iostream>
#include<climits>
using namespace std;

int negative(int arr[],int n){
	int max=arr[0];
	for(int i=1;i<n;i++){
		if(arr[i]>max){
			max=arr[i];
		}
		}
	return max;
	}
int main(){

int n,flag=0;
cin>>n;
int arr[n];
for(int i=0;i<n;i++){
	cin>>arr[i];
	if(arr[i]<0){
		flag++;
	}
}
if(flag==n){
	cout<<negative(arr,n);
	return 0;
}

int sum=0,maxsum=INT_MIN;
for(int i=0;i<n;i++){
		sum+=arr[i];
		if(sum<0){
			sum=0;
		}
		maxsum=max(sum,maxsum);
	}
	
	cout<<maxsum;
	return 0;
	
}