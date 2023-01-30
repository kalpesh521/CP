package Java_Problem_Set.Array;


//XOR Operation
//2 ^ 2 = 0
//2 ^ 3 = 1
public class OnceInArray {
    public static int OnceElement(int[] arr){
        int res=0;
        for(int i:arr){
            res^=i;
        }
        return  res;
    };


    public static void main(String[] args) {
        int[] arr ={1,1,2,2,3,4,4,5,5};
        System.out.println(OnceElement(arr));
    }
}
