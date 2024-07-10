package Package1;
import Package.Person;

import java.util.Scanner;

public class AccessToPerson1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        Person person = new Person();
        Person person1 = new Person();
        person1.setName(name);
        System.out.println(person1.getName());
        System.out.println(person1.gender);
        System.out.println(Person.count);
    }
}
