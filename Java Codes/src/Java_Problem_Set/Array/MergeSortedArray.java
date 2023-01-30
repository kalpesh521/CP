package Java_Problem_Set.Array.Array;

public class MergeSortedArray {

    public static int[] Merge(int[] arr1, int[] arr2){
        int len1=arr1.length;
        int len2=arr2.length;

        int[] result=new int [len1+len2];
        int i=0 ,j=0,k=0;

        while(i<len1 && j<len2){
            if(arr1[i]<arr2[j]){
                result[k++] =arr1[i++];
            }else{
                result[k++] =arr2[j++];
            }
        }
        if(i<len1){
            result[k++] =arr1[i++];
        }
        if(j<len2){
            result[k++]=arr2[j++];
        }

          return  result;
    }
    public static void main(String[] args) {
   int[] arr1={2,3,6,7,8};
   int[] arr2={1,4,6,7,9};
   int [] result= Merge(arr1,arr2);
   for(int k=0;k<result.length;k++){
       System.out.print(result[k]+ " ");
   }
    }
}
