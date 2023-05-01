package day02;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        System.out.print("Введите 2 числа: ");
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int b = scanner.nextInt();

        int count = a + 1;
        while (count < b) {
            if (count % 5 == 0 && count % 10 != 0) {
                System.out.print(count + " ");
            }
            count++;
        }
    }
}