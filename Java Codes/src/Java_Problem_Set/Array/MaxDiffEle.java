package Java_Problem_Set.Array;
//Find Max difference between elements such that no larger number should be after smaller number
public class MaxDiffEle {
    public  static  int MaxDiff(int arr[]){
        int MaxDiff=arr[1]-arr[0];
        int minele=arr[0];

        for (int i=1;i<arr.length;i++){
            if((arr[i]-minele)>MaxDiff){
                MaxDiff=(arr[i]-minele);
            }
            if(arr[i]<minele){
                minele=arr[i];
            }
        }
        return MaxDiff;
    }

    public static void main(String[] args) {
        int arr[] ={2,7,4,1,20,12,23};//23-1=22
        System.out.println(MaxDiff(arr));
    }
}
