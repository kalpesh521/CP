package CollectionFramework;

import java.io.*;

public class BufferReaderDemo {
    public static void main(String[] args) throws IOException {


        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter First number");
        int num1= Integer.parseInt(bf.readLine());
        System.out.println("Enter Second number");
        int num2= Integer.parseInt(bf.readLine());

        int res =num1 + num2;
        System.out.println(res);
    }
}