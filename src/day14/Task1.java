package day14;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) throws FileNotFoundException {
        printSumDigits(new File("Day14File"));
    }

    static void printSumDigits(File file) {
        File file1 = new File(String.valueOf(file));
        try {
            Scanner scanner = new Scanner(file1);
            String line = scanner.nextLine();
            String[] numberSplit = line.split(" ");

            if (numberSplit.length != 10) {
                throw new IllegalArgumentException();
            }

            int numberSum = 0;
            for (String number : numberSplit) {
                numberSum += Integer.parseInt(number);
            }

            System.out.println("Сумма чисел в файле: " + numberSum);

            scanner.close();
        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден!");
        } catch (IllegalArgumentException e) {
            System.out.println("Некорректный входной файл.");
        }
    }
}