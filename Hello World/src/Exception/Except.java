package Exception;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Except {
    public static void main(String[] args) {
        File file = new File("file.txt");
        try {
            Scanner scanner = new Scanner(file);
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("100%");
        }
    }
}
