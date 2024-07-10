package Package;

public class Animal implements Movable {
    protected String name;
    protected int age;

    public Animal(int age, String name) {
        this.age = age;
        this.name = name;
    }
    public void makeMove() {
        System.out.println("Animal move");
    }

    @Override
    public void move() {
        System.out.println("Животное двигается");
    }
}
