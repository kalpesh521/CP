package OOPs.OOPs.ExceptionHndling;

public class Demo {
    public static void main(String[] args) {
        int a= 10 ,b=0;

        try{
            int c= a/b;
            System.out.println(c);
        }catch (ArithmeticException e){
            System.out.println("Demominator should not be zero");
            System.out.println(e);
        }
        System.out.println("Bye");
    }
}
