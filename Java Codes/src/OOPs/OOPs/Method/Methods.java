package OOPs.OOPs.Method;
//Variable length argument
public class Methods {

    static void get(int start,String...S){
        for (int i=0;i<S.length;i++){
            System.out.println(start+" "+S[i]);
            start++;
        }
    }
    public static void main(String[] args) {

        get(5,"kp","sp","pp");
    }
}
