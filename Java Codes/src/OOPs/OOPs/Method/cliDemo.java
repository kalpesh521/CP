package OOPs.OOPs.Method;
//Command line Arguments
public class cliDemo {
    public static void main(String[] args) {
        //For String
        for(String S :args){
            System.out.println(S);
        }

        //Alternative valid for all data type
        for(int i=0;i<args.length;i++){
            System.out.println(args[i]);
        }
    }
}
