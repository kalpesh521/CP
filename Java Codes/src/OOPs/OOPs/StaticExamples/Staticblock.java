package OOPs.OOPs.StaticExamples;

public class Staticblock {
// Static Variable
    static  int a=5;
    static int b;
  //Static will execute only once ,when first class created
    static {
        System.out.println("Static block running");
        b=a*5;
    }
        public static void main(String[] args) {

            Staticblock obj1 =new Staticblock();
            System.out.println(Staticblock.a + " " + Staticblock.b);

            Staticblock.b+=3;
            System.out.println(Staticblock.a+" "+Staticblock.b);

        }
}
