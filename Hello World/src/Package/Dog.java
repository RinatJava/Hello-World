package Package;

public class Dog extends Animal implements Movable{
    protected String color;

    public Dog(int age, String name, String color) {
        super(age, name);
        this.color = color;
    }

    @Override
    public void makeMove() {
        System.out.println("Dog move");
    }

    public void whatDogEat() {
        System.out.println("Dog don't eat");
    }
    public void whatDogEat(String food) {
        System.out.println("Dog eat " + food);
    }

    @Override
    public void move() {
        System.out.println("Собака двигается");
    }
}
