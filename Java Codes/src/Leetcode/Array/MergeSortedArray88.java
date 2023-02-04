package Leetcode.Array;
//Two pointer approach
public class MergeSortedArray88 {
    public static void  getarray(int[] num1,int m,int [] num2,int n){
        int p1=m-1,p2=n-1,i=m+n-1;
        while(p2>=0)
        {
            if(p1>=0 && num1[p1]>num2[p2]){
                num1[i--]=num2[p1--];
            }else{
                num1[i--]=num2[p2--];
            }
        }
    }

    public static void main(String[] args) {
        int[] num1={2,3,4,0,0,0};
        int[] num2={5,3,4};
        getarray(num1,6,num2,3);
    }
}
