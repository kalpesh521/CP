package OOPs.Design_Pattern.Singleton;

public class Samosa {

    private static  Samosa samosa;
    // field
    // method
    // Constructor


    // Constructor call while creating second object
    private Samosa(){
        if(samosa!=null){
            throw new RuntimeException("You are trying to break singleton pattern");
        }
    }
    public static Samosa getsamosa(){
        if(samosa ==null){
            samosa = new Samosa();
        }
        return  samosa;
    }

    private  static Samosa jalebi;
    public  static  Samosa getjalebi(){
        if(jalebi ==null){
            synchronized (Samosa.class){
                jalebi = new Samosa();
            }
        }
        return  jalebi;
    }
}
