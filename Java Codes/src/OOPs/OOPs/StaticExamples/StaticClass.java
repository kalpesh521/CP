package OOPs.OOPs.StaticExamples;

// static block
class Test{
    static  {
        System.out.println("Block 1");
    }
    static  {
        System.out.println("Block 2");
    }
}
public class StaticClass {
    public static void main(String[] args) {
        Test  tst = new Test();// Load all the blocks in class
        System.out.println("Main");
    }
}
