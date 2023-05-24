package day16;

import java.io.*;
import java.util.Random;
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) throws IOException {
        Random random = new Random();

        File file1 = new File("resources/file1.txt");
        PrintWriter printWriter1 = new PrintWriter(file1);

        for (int i = 0; i < 1000; i++) {
            printWriter1.println(random.nextInt(100));
        }

        printWriter1.close();

        Scanner scanner = new Scanner(file1);
        File file2 = new File("resources/file2.txt");
        PrintWriter printWriter2 = new PrintWriter(file2);

        int counter = 0;
        int sum = 0;

        while (scanner.hasNextLine()) {
            sum += Integer.parseInt(scanner.nextLine());
            counter++;

            if (counter == 20) {
                printWriter2.println(sum / 20.0);
                    counter = 0;
                    sum = 0;
            }
        }

        printWriter2.close();
        scanner.close();

        printResult(file2);
    }

    public static void printResult(File file) throws IOException {
        FileReader reader = new FileReader(file);
        Scanner scanner = new Scanner(reader);

        double result = 0;

        while (scanner.hasNextLine()) {
            result += Double.parseDouble(scanner.nextLine());
        }

        scanner.close();

        System.out.println((int) result);
    }
}