package day16;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) throws IOException {
        printResult(new File("resources/Day14File"));
    }

    public static void printResult(File file) throws IOException {
        FileReader reader = new FileReader(file);
        Scanner scanner = new Scanner(reader);

        String[] numbers = scanner.nextLine().split(" ");

        int sum = 0;
        double average;

        for (String number : numbers) {
            sum += Integer.parseInt(number);
        }

        average = sum / (double) numbers.length;

        System.out.printf(average + " --> %.3f ", average);

        reader.close();
        scanner.close();
    }
}