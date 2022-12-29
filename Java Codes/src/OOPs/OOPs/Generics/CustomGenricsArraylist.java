package OOPs.OOPs.Generics;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Objects;

public class CustomGenricsArraylist<T> {
    private Objects[] data;
    private static int DEFAULT_SIZE = 10;
    private int size = 0;

    public CustomGenricsArraylist() {
        data = new Objects[DEFAULT_SIZE];
    }

    public void add(T num) {
        if (isFull()) {
            resize();
        }
        data[size++] = (Objects) num;
    }

    public boolean isFull() {
        return size == data.length;
    }

    //copy the current items in new array(temp)
    void resize() {
        Objects[] temp = new Objects[data.length * 2];


        for (int i = 0; i < data.length; i++) {
            temp[i] = data[i];

        }
        data = temp;

    }

    public T removed() {
        T removed = (T) data[size--];
        return removed();
    }

    public int size() {
        return size;
    }

    public T get(int index) {
        return (T) data[index];
    }

    public void set(int index, Objects value) {
        data[index] = value;
    }

    @Override
    public String toString() {
        return "CustomArraylist{" +
                "data=" + Arrays.toString(data) +
                ", size=" + size +
                '}';
    }

    public static void main(String[] args) {
        ArrayList<Integer> list2 = new ArrayList<>();

        CustomArraylist list = new CustomArraylist();
        CustomGenricsArraylist<Integer> list3 = new CustomGenricsArraylist<>();
        list3.add(6);
        System.out.println(list3);
    }
}
