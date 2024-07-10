package Generic;

public class Generic {
    public static void main(String[] args) {
        Box<Integer> boxInteger = new Box<Integer>();
        Box<String> boxString = new Box<String>();
        boxInteger.setT(123);
        boxString.setT("Test");
        System.out.println(boxString.getT());
        System.out.println(boxInteger.getT());

    }
}

// Через <> мы передаем в класс ссылочный тип, например String. Integer и т.д.

class Box<T> {
    private T t;

    public T getT() {
        return t;
    }

    public void setT(T t) {
        this.t = t;
    }
}