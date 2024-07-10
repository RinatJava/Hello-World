package Exception;

import java.util.Scanner;

public class UncheckedException {
    public static void main(String[] args) {
        int i = 1;
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        System.out.println(i/number);
    }
}
