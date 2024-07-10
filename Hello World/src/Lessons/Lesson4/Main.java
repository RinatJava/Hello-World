package Lessons.Lesson4;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int num1 = 100;
        short num2 = 25;
        byte carCount = 8;
        long catCount = 876;
        int totalCount = 65433;
        String name = "Rinat";
        char symbol1 = '3';
        char symbol2 = 'r';
        int num3 = 10;
        double num4 = 4.555;

//        System.out.println(num1);
//        System.out.println(num2);
//        System.out.println(catCount);
//        System.out.println(carCount);
//        System.out.println(totalCount);
//        System.out.println(name);
//        System.out.println(symbol1);
//        System.out.println(symbol2);
//        System.out.println(num3);
//        System.out.println(num4);

        System.out.println("\t\t\t******Калькулятор******");
        System.out.println("Введите первое число:");
        double a = new Scanner(System.in).nextDouble();
        System.out.println("Введите второе число:");
        double b = new Scanner(System.in).nextDouble();
        System.out.println(a + " " + "+" + " " + b + " = " + (a+b));
        System.out.println(a + " " + "-" + " " + b + " = " + (a-b));
        System.out.println(a + " " + "*" + " " + b + " = " + (a*b));
        System.out.println(a + " " + "/" + " " + b + " = " + (a/b));

    }
}
