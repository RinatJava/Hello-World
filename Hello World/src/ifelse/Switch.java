package ifelse;

public class Switch {
    public static void main(String[] args) {
        int score = 4;
        System.out.println(switch(score) {
            case 5 -> "Молодец, ты получил 5!";
            case 4 -> "Оценка 4";
            default -> "Ты получил другую оценку.";
        });
    }
}
