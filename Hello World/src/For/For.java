package For;

public class For {
    public static void main(String[] args) {
        int[] numbers = {3,5,6,45,78,4,3};
        for (int i = 0; i < 7; i++) {
            if (numbers[i] % 2 ==0) {
                System.out.println(numbers[i]);
            }
        }
        for (int i = 0; i < 7; i++) {
            if (i % 2 ==0) {
                System.out.println(i);
            }
        }
    }
}
