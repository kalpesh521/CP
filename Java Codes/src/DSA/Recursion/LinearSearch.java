package DSA.Recursion;

public class LinearSearch {

    static  boolean search(int arr [],int target ,int i){
        if(i == arr.length){
            return  false;
        }
        return  target == arr[i] ||  search(arr,target,i+1);
    }

    public static void main(String[] args) {
        int arr[]={ 2,3,4,5,1};
        System.out.println(search(arr,7,0));
    }
}
