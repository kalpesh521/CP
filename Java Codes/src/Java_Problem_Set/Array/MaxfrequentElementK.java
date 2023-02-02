package Java_Problem_Set.Array;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MaxfrequentElementK {
    public static List<Integer> getMax(int []arr , int k){
        int maxfreq =0;
        Map<Integer,Integer> countmap= new HashMap<>();
        for(int i=0;i<arr.length;i++){
            int freq =countmap.getOrDefault(arr[i],0)+1;
            countmap.put(arr[i],freq);
            maxfreq= Math.max(maxfreq,freq);
        }

        List<Integer>  [] bucket = new List[maxfreq+1];
        for(int n: countmap.keySet()){
            int freq = countmap.get(n);
            if(bucket[freq]==null){
                bucket[freq] = new ArrayList<>();
            }
            bucket[freq].add(n);
        }

        List<Integer> res = new ArrayList<>();
        for(int i=bucket.length-1; i>=0 && k>0;i++){
            if(bucket[i]!=null){
                List<Integer> list=bucket[i];
                res.addAll(list);
                k-=list.size();
            }
        }
        return res;
    }

    public static void main(String[] args) {
        int [] arr= {1,1,1,2,2,3,3,3};
        List<Integer> result= getMax(arr,2);
        for(int element : result){
            System.out.print(element +" ");
        }
    }
}
