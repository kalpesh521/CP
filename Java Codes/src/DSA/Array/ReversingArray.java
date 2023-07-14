package DSA.Array;

public class ReversingArray {
    public static void main(String[] args) {
        int A[]={1,2,4,5,7,8};
        int B[]=new int[6];

        for(int i=A.length-1,j=0;i>=0;i--,j++) {
            B[j] = A[i];
        }
        for (int arr: B){
            System.out.print(arr +" ");
        }
    }
}
