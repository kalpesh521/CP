package OOPs.OOPs.StaticExamples;

public class Main {
    public static void main(String[] args) {
        Human kp = new Human(12, "kp", 3232);
        Human sp = new Human(12, "ekp", 3232);
        Human psp = new Human(12, "skp", 3232);
        System.out.println(Human.population);

        // Main is static method,we can't access non-static context
      //  greetings();//Non-static method cannot access from static method
    }

   /*
    static void fun1() {
        greetings(); //Non-static can't access without instance
    }
    */
    static void fun2() {//Static won't require any instance
    //We can access non-static stuff by creating object
        Main obj = new Main();
        obj.greetings();
    }



   //Static Member inside non-static stuff

    // We have to make this function as static ,then you can access through function
    void greetings() {
      //  fun1();
        System.out.println("Kalpesh");
    }

}
