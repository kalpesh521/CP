package DSA.Recursion;

public class functionCall {
    public static void main(String[] args) {
        print1(1);
        System.out.println();
        print(8);
    }

    // Function call using recursion
    static  void print(int n){
        if(n==14){
            return;
        }
        System.out.println(n);
        print(n+1);
    }

    //Function call using brute force approach
    static void print1(int n) {
        System.out.println(n);
        print2(2);
    }

    static void print2(int n) {
        System.out.println(n);
        print3(3);
    }

    static void print3(int n) {
        System.out.println(n);
        print4(4);
    }

    static void print4(int n) {
        System.out.println(n);

    }
}
