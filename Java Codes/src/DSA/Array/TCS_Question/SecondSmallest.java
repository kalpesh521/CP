package DSA.Array.TCS_Question;

public class SecondSmallest {
    public static void  getelements(int arr[],int n){

        if(n==0 || n==1){
            System.out.println(-1);
            System.out.println("");
        }
        int  large =Integer.MIN_VALUE;
        int second_large=Integer.MIN_VALUE;
        int  small =Integer.MAX_VALUE;
        int second_small =Integer.MAX_VALUE;

        for (int i=0;i<n;i++){
            small=Math.min(small,arr.length);
            large=Math.max(large,arr.length);
        }

        for (int i=0;i<n;i++){
            if(arr[i]<second_small && arr[i]!=small){
                second_small=arr[i];
            } if(arr[i]>second_large && arr[i]!=large){
                second_large=arr[i];
            }
        }

        System.out.println(second_small);
        System.out.println(second_large);
    }

    public static void main(String[] args) {
        int arr[]={4,7,2,1,9};
        int n=arr.length;
        getelements(arr,n);

    }
}
