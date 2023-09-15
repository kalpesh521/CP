package Java_Problem_Set.Array;

public class SegregateNumbers {

    public static  int[] sort(int [] arr){
        int zerocnt=0;
        int onecnt=0;

        for(int i=0;i<arr.length;i++){
            if(arr[i]==0){
                zerocnt++;
            }
            if(arr[i]==1){
                onecnt++;
            }
        }

        for(int i=0;i<zerocnt;i++){
            arr[i]=0;
        }

        for(int i=zerocnt;i<(zerocnt+onecnt);i++){
            arr[i]=1;
        }
        for(int i=(zerocnt+onecnt);i<arr.length;i++){
            arr[i]=2;
        }
        return arr;
    }
    public static void main(String[] args) {
        int [] arr ={0,1,2,1,0,1,2,0};
        int [] result=sort(arr);
        for (int k=0;k<result.length;k++){
            System.out.println(result[k]+" ");
        }

    }
}
