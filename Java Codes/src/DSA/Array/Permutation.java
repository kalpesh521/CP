package DSA.Array;
//
public class Permutation {
    static int permute(int n , int r){
        int res=1;
        for (int i = 0;i<r;i++){
            res=res*(n-i);
            res=res/(i+1);
        }
        return  res;
    }

    public static void main(String[] args) {
        System.out.println(permute(7,2));
    }
}
