package Java_Problem_Set.Array.Array;

public class SecondSmallest {

    public static int getSecondSmallest(int arr[]){
        int smallest =Integer.MAX_VALUE;
        int SecondSmallest =Integer.MAX_VALUE;

        for(int i=0;i<arr.length;i++){
            if(arr[i]<smallest){
                SecondSmallest =smallest;
                smallest=arr[i];
            }
            if(arr[i]>smallest && arr[i]<SecondSmallest){
                SecondSmallest=arr[i];
            }
        }
        return SecondSmallest;
    }

    public static void main(String[] args) {
        int arr[] ={2,1,3,13,9,-1};
        System.out.println(getSecondSmallest(arr));
    }
}
