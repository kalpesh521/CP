package OOPs.OOPs.ExceptionHndling;

class LowBalanceException extends Exception {
    public String toString() {
        return "Balance should noe be less than 500";
    }
}

public class UserDefinedException {
    static void fun1() {
        try {
            throw new LowBalanceException();
        } catch (LowBalanceException e) {
            System.out.println(e);
        }
    }

    public static void main(String[] args) {
     fun1();
    }
}
