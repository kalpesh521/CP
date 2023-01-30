package Java_Problem_Set.Array.Array;

public class MaxProfit {
    public static int getProfit(int [] arr){
        int min =Integer.MAX_VALUE;
        int Max = 0;

        for (int i=0;i<arr.length;i++){
            if(arr[i]<min){
                min=arr[i];
            }
            if(arr[i]-min > Max)
            {
                Max=arr[i]-min;
            }
        }
        return  Max;
    }

    public static void main(String[] args) {

        int[] arr= {3,8,1,5,6,2,7};//min =1 (buy)  Max=7(sell)   Profit =7-1 =6
        int result=getProfit(arr);
        System.out.println(result);
    }
}
