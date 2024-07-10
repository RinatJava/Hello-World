package Package;

public class Person {
    public static int count = 0;
    public String name;
    protected int age = 30;
    private Boolean isWork = false;
    int iq = 100;
    public final String gender = "MALE";
    public String getName() {
        return name;
    }
    public Person() {
        count++;
    }
    public void setName(String name) {
        this.name = name;
    }

    public void TestIsWork() {
        Person person = new Person();
        System.out.println(person.isWork);
    }
}
