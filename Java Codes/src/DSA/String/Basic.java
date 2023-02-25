package DSA.String;

public class Basic {
    public static void main(String[] args) {
        String a= "Kalpesh";
        String b = "Kalpesh";
        System.out.println(a==b);//true Pointing to same object

        String x =new String("Kalpesh");
        String y =new String("Kalpesh");
        System.out.println(x==y);//False not pointing to same object

        System.out.println(x.equals(y)); // Consider only  values , equal or not

        //Arrays.toString() Method contain , [] ,print array while toString default method ,don't print this format ,
        // it prints random address value

        float c =123.432232f;
        float d =123.437232f;
        System.out.printf("Formatted string is  %.2f \n",c);
        System.out.printf("Formatted string is  %.2f \n",d);
        System.out.printf("value of pie is  %.3f \n",Math.PI);
        System.out.printf("Hello %s  Where are  you %s ?","Kalpesh","from");
    }
}
