#include<iostream>
#include<climits>
using namespace std;
int main(){
	int n;
	cin>>n;
	int arr[n];
	for(int i=0;i<n;i++){
			cin>>arr[i];
		}
	int maxsum=INT_MIN;
	for(int i=0;i<n;i++){
		int sum=0;
	for(int j=i;j<n;j++){
		sum=sum+arr[j];
		maxsum=max(sum,maxsum);
	}
	}
	cout<<maxsum;
	return 0;
}
