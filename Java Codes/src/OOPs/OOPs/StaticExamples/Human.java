package OOPs.OOPs.StaticExamples;

public class Human {

    int age;
    int salary;
    String name;
    static int population;

    public Human(int age,String name ,int salary ){
        this.age=age;
        this.name =name;
        this.salary=salary;
        this.population+=1;
    }
    public static void main(String[] args) {
        
    }
}

