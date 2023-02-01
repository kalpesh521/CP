package Java_Problem_Set.Array;

//sliding Window Approach
//
public class MaxSubarraySizeK {
    public static  int getMNax(int[]arr,int k){
        int start=0;
        int sum=0;
        int Maxsum=0;

        for(int end=0; end<arr.length;end++){
            sum+=arr[end];
            if(end>=k-1){
                Maxsum=Math.max(sum,Maxsum);
                sum-=arr[start];
                start++;
            }
        }
        return Maxsum;
    }

    public static void main(String[] args) {
        //       start then ++
        //        |
        int[]arr={2,1,5,1,3,2};
        //        |
        //       end upto k-1
        /*
        Add from end and subtract from front side
        (2,1,3) -> (1,5,1)
        Add 1 and Subtract 2
        */
        int result=getMNax(arr,3);
        System.out.println(result);
    }
}
