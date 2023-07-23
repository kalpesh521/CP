package DSA.StackAndQueue;

public class StackMain {
    public static void main(String[] args) throws Exception {
        CustomStack cst = new CustomStack();
        cst.push(11);
        cst.push(14);
        cst.push(21);
        cst.push(71);
        cst.push(81);
        System.out.println(cst.peek());
        cst.pop();
        System.out.println(cst.peek());
     }
}
