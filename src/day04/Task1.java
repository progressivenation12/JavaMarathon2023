package day04;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        System.out.print("Введите число n - размер массива: ");
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int arrayLength = scanner.nextInt();
        int[] array = new int[arrayLength];
        int counter8 = 0;
        int counter1 = 0;
        int counterEven = 0;
        int counterOdd = 0;
        int sumNumberArray = 0;

        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(10);
        }

        for (int i = 0; i < array.length; i++) {
            if (array[i] > 8) counter8++;
            if (array[i] == 1) counter1++;
            if (array[i] % 2 == 0) counterEven++;
            if (array[i] % 2 != 0) counterOdd++;
            sumNumberArray += array[i];
        }

        System.out.println(Arrays.toString(array));
        System.out.println("Длина массива: " + array.length);
        System.out.println("Количество чисел больше 8: " + counter8);
        System.out.println("Количество чисел равных 1: " + counter1);
        System.out.println("Количество четных чисел: " + counterEven);
        System.out.println("Количество нечетных чисел: " + counterOdd);
        System.out.println("Сумма всех элементов массива: " + sumNumberArray);
    }
}