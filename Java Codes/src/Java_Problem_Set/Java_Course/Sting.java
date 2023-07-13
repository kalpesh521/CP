package Java_Problem_Set.Java_Course;

public class Sting {
    public static void main(String[] args) {
        char c[] ={'K','A','L','P','E','S','H'};
        byte b[]={65,66,67,68};

        String str1= new String(c,2,3); //char
        String str2= new String(b,1,2); //byte
        String str3= new String(str2);  //string

        System.out.println(str1);
        System.out.println(str2);
        System.out.println(str3);
    }
}
