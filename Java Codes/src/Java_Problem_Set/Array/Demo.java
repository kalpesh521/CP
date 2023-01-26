package Java_Problem_Set.Array;

public class Demo {
    public static void main(String[] args) {
        int i,  m =0,n ;
        n =4;
        int flag =0;
        m=n/2;

        if (n==0 || n==1){
            System.out.println("Number is not prime ");

        }
        else {
            for (i =2;i<=m;i++){
                if(n % i==0){
                    System.out.println("Number is not prime");
                    flag =1;
                    break;
                }
            }
            if(flag==0){
                System.out.println(n+" Number is prime");
            }
        }



    }
}
