package Java_Problem_Set.Array;

public class MinElement {

    public static int minelem(int [] arr){

        int min=arr[0];
        for (int i=0;i<arr.length;i++){
            if(arr[i]<min){
                min=arr[i];
            }
        }
        return  min;
    }
    public static void main(String[] args) {
        int[]arr={2,4,-1,7,-3,4};
        int result=minelem(arr);
        System.out.println(result);
    }
}
