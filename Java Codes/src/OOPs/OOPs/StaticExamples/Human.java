package OOPs.OOPs.StaticExamples;

/*
Static Variable are not dependent on object ,we can access without creating object
* */
public class Human {

    int age;
    int salary;
    String name;
    static int population;

    public Human(int age, String name, int salary) {
        this.age = age;
        this.name = name;
        this.salary = salary;
        this.population += 1;
    }
  
    static void message(){
        System. out.println("Hello");
        //System.out.println(this.age);//We can't use this keyword in static method because non-static context
    }
    public static void main(String[] args) {
   // Static in static
    message();

    }

}


