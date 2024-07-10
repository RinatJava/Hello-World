package Exception;

public class Error {
    public static void main(String[] args) {
        stackOverflowGenerator(1);
    }

    public static int stackOverflowGenerator(int i) {
        return stackOverflowGenerator(i);
    }
}
