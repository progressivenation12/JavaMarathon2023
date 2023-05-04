package day14.Task3;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        System.out.println(parseFileToStringList(new File("Day14People")));
    }

    public static List<Human> parseFileToStringList(File file) {
        File file1 = new File(String.valueOf(file));
        List<Human> peopleList = new ArrayList<>();

        try {
            Scanner scanner = new Scanner(file1);
            while (scanner.hasNext()) {
                String line = scanner.nextLine();
                String[] person = line.split(" ");
                if (Integer.parseInt(person[1]) < 0) {
                    throw new IllegalArgumentException();
                }
                Human currentPerson = new Human(person[0], Integer.parseInt(person[1]));
                peopleList.add(currentPerson);
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