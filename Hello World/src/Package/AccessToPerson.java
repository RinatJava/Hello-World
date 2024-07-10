package Package;

public class AccessToPerson {
    public static void main(String[] args) {
        Person person = new Person();
        System.out.println(person.age);
        System.out.println(person.iq);
        System.out.println(person.name);

        Dog sharik = new Dog(3,"Sharik", "white");
        System.out.println(sharik.name);
        System.out.println(sharik.age);
        System.out.println(sharik.color);
        sharik.makeMove();
        sharik.whatDogEat();
        sharik.whatDogEat("Potato");
        Animal animal = new Animal(2,"animal");
        animal.move();
        sharik.move();

    }
}
