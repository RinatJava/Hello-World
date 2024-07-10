package LinkedList;

import java.util.LinkedList;
import java.util.List;

public class LinkedList1 {
    public static void main(String[] args) {
        List<String> array = new LinkedList<>();
        array.add("One");
        array.add("Two");
        array.add("Three");

        System.out.println(array);

        array.add(1,"Four");
        System.out.println(array);

    }
}