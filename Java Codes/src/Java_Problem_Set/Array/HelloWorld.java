package Java_Problem_Set.Array;

public class HelloWorld {
    public static void main(String[] args) {
       if(System.out.printf("Helloworld")== null){
       }

       demo();
    }

    static void demo(){
        int i =0;
        while(i<5){
            if(i==2){
                i++;
                continue;
            }
            else {
                System.out.println(i);
                i++;
            }
        }
    }
}

