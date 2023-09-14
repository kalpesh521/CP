package Java_Problem_Set.Array;

import java.util.*;

public class DuplicateUnsortedArray {
    public static void main(String[] args) {
      //===============================================
        System.out.println("Using Hashset");
        //Time Complexity : O(n)
        int[] arr ={3,2,1,4,2,5,3,5};
        int j =0;
        int len =arr.length;


        Set<Integer> st= new HashSet<>();
        for(int i = 0;i<len-1;i++){
            st.add(arr[i]);
        }

        st.forEach((ele) -> System.out.print(ele + " "));
        //==================================================

        System.out.println("\n using sorting then traverse");
        //Time complexity -> O[log(n)]
        Arrays.sort(arr);
        for (int i =0;i<len-1;i++){
            if(arr[i]!=arr[i+1]){
                arr[j++]=arr[i];
            }
        }
        arr[j++]=arr[len-1];
        for(int k=0;k<j;k++){
            System.out.print(arr[k]+" ");
        }
        //===================================================
        System.out.println("\nUsing Hashmap");
        //using Hashmap
        //Time Complexity -> O(n)
        Map<Integer,Integer> map =new HashMap<>();
        /*
        *(3,1) ;( 2,1) ;(1,1) ;(4,1) ; <<(2,2)>>
        *
       */
        for (int i = 0;i<len-1;i++){
            if(map.containsKey(arr[i])){
                map.put(arr[i],map.get(arr[i]+1));//(2,2)
            }else{
                map.put(arr[i],1);//(3,1)
            }
        }
        //To print key
        map.forEach((k,v) ->System.out.print(k+" "));
    }


}
