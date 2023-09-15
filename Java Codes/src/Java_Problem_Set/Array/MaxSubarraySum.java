package Java_Problem_Set.Array;

// Kaden's Theorem -> To find Maximum sum of array
public class MaxSubarraySum {
    public static int MaxSubarray(int[] arr) {
        int Maxsum = arr[0];
        int sum = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (sum < 0) {
                sum = arr[i];
            } else {
                sum = sum + arr[i];
            }
            Maxsum = Math.max(sum, Maxsum);
        }
        return Maxsum;
    }
/*

// Maximum Sum SubArray of size k
#include<bits/stdc++.h>
using namespace std;
int maxsubarray(int *arr,int size,int k){
    int i=0,j=0, sum=0;
    int maxsum=INT_MIN;
    while(j<size){
        sum=sum+arr[j];
        if(j-i+1<k){
            j++;
        }else if(j-i+1==k){
            maxsum=max(maxsum,sum);
            sum=sum-arr[i];
            i++;
            j++;
        }
    }
    return maxsum;
}
int main()
{
    int n,k;
    cin>>n>>k;
    int *arr=new int[n];
    for(int i=0;i<n;i++){
        cin>>arr[i];
    }
    cout<<maxsubarray(arr,n,k);
    delete[]arr;
    return 0;
}*/
    public static void main(String[] args) {
        int[] arr = {1, 2, -5, 4, 3, 8, 5};//{4,3,8,5} Subarray =20
        int[] arr1 = {1,8,6,2,5,4,8,3,7};
        int result = MaxSubarray(arr1);
        System.out.println(result);
    }


}

