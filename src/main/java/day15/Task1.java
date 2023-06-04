package day15;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) throws FileNotFoundException {
        File fileRead = new File("resources/shoes.csv");
        Scanner scanner = new Scanner(fileRead);

        File fileWrite = new File("resources/missing_shoes.txt");
        PrintWriter printWriter = new PrintWriter(fileWrite);

        while (scanner.hasNextLine()) {
            String[] line = scanner.nextLine().split(";");
            if (Integer.parseInt(line[2]) == 0) {
                printWriter.printf("%-40s %3s р-р., %sшт.\n", line[0], line[1], line[2]);
            }
        }
        printWriter.close();
        scanner.close();
    }
}