package ifelse;

public class If {
    public static void main(String[] args) {
        int score = 3;
        if (score == 5) {
            System.out.println("Молодец, ты можешь пойти в кино");
        } else if (score == 4) {
            System.out.println("Ты получил 4, и поэтому можешь пойти погулять");
        } else {
            System.out.println("Сиди дома и учи уроки!");
        }
    }
}
