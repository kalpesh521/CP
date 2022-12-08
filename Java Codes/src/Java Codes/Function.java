public class Function {

    static int fun_sum(int a,int b) {
        return a+b;
    }

    static String mygreet(String name){
        return "Hello" + name;
    }

    public static void main(String[] args) {
        
    System.out.println(fun_sum(5, 19));
    System.out.println(mygreet( " Kalpesh"));
    int a= 5;
    String name="Ram";
 
    //Block Scope
    {
         a= 100;
         name ="Ram";
         System.out.println(a);
         System.out.println(name);
    }
    System.out.println(a);
    System.out.println(name);

    }
}
