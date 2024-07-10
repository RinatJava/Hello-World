package For;

public class ForMultiArray {
    public static void main(String[] args) {
        int[][] array = {{165, 201, 156},{176, 185, 163}};
        mainFor:
        for (int[] mainArray : array) {
            for (int value : mainArray) {
                if (value == 176) {
                    System.out.println("Найден искомый рост " + value);
                    break mainFor;
                } else {
                    System.out.println("Найден неподходящий рост " + value);
                }

            }
        }
    }
}
