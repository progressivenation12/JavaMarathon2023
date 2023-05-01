package day03;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("Введите 2 числа: ");
            double a = scanner.nextDouble();
            double b = scanner.nextDouble();

            if (b == 0) {
                break;
            }

            System.out.println("Ответ: " + a / b);
        }
    }
}