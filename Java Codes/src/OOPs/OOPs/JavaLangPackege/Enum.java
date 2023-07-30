package OOPs.OOPs.JavaLangPackege;

public class Enum
{
    enum dept{
        CS("lp","A"),IT("kp","B"),MECH("Sp","C"),CIVIL("cp","D");

        String head;
        String location;
        dept(String head,String location){
            this.head= head;
            this.location = location;
        }
        public void display(){
            System.out.println(this.name()+" "+this.ordinal());
        }

        public  String getHead(){
            return head;
        }
        public  String getLocation(){
            return  location;
        }
    }

    public static void main(String[] args) {
        dept list[] = dept.values();
        for(dept x:list){
            System.out.println(x);
        }
        System.out.println();
        dept d= dept.IT;
        d.display();

        System.out.println();
        System.out.println(d.getHead());
        System.out.println(d.getLocation());
    }
}
