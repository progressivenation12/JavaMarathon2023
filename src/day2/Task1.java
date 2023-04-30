package day2;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        System.out.print("Введите число этажей в доме: ");
        Scanner scanner = new Scanner(System.in);

        int floorCount = scanner.nextInt();

        if (floorCount >= 1 && floorCount <= 4) {
            System.out.println("Малоэтажный дом");
        } else if (floorCount >= 5 && floorCount <= 8) {
            System.out.println("Среднеэтажный дом");
        } else if (floorCount >= 9) {
            System.out.println("Многоэтажный дом");
        } else {
            System.out.println("Некорректный воод");
        }
    }
}