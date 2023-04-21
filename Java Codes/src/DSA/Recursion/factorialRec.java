package DSA.Recursion;

public class factorialRec {
    public static void main(String[] args) {
       int res= factorial(5);
        System.out.println(res);
    }
    static  int factorial(int n){
        if(n==1) return  1;
        return n*factorial(n-1);
    }
}
