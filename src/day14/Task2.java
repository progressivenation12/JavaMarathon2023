package day14;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class Task2 {
    public static void main(String[] args) {
        System.out.println(parseFileToStringList(new File("Day14People")));
    }

    public static List<String> parseFileToStringList(File file) {
        File file1 = new File(String.valueOf(file));
        List<String> peopleList = new ArrayList<>();

        try {
            Scanner scanner = new Scanner(file1);
            while (scanner.hasNext()) {
                String line = scanner.nextLine();
                String[] person = line.split(" ");
                if (Integer.parseInt(person[1]) < 0) {
                    throw new IllegalArgumentException();
                }
                peopleList.add(line);
            }

            return peopleList;
        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден!");
        } catch (IllegalArgumentException e) {
            System.out.println("Некорректный входной файл.");
        }
        return null;
    }
}