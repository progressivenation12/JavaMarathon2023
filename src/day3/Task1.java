package day3;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("Введите название города: ");
            String city = scanner.nextLine();

            if (city.equals("Stop") || city.equals("Стоп")) {
                break;
            }

            switch (city) {
                case "Москва", "Владивосток", "Ростов на Дону" -> System.out.println("Россия");
                case "Рим", "Милан", "Турин" -> System.out.println("Италия");
                case "Ливерпуль", "Манчестер", "Лондон" -> System.out.println("Англия");
                case "Берлин", "Мюнхен", "Кёльн" -> System.out.println("Германия");
                default -> System.out.println("Неизвестная страна");
            }
        }
    }
}