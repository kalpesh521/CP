package OOPs.OOPs.StaticExamples;

public class Singleton {
   private int qtymilk;
   private  int qtycoffe;
    private Singleton(){
       qtymilk =1;
       qtycoffe =1;
    }
    private  static  Singleton instance;
    public static Singleton getInstance(){
        if (instance ==null){
            instance =new Singleton();
        }
    return  instance;
    }
}
