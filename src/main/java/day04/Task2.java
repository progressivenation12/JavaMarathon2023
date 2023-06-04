package day04;

import java.util.Random;

public class Task2 {
    public static void main(String[] args) {
        int[] array = new int[100];
        Random random = new Random();

        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(10000);
        }

        int max = 0;
        int min = 10000;
        int count0 = 0;
        int count0Sum = 0;

        for (int element : array) {
            if (element > max) {
                max = element;
            }
            if (element < min) {
                min = element;
            }
            if (element % 10 == 0) {
                count0Sum += element;
                count0++;
            }
        }

        System.out.println("Наибольший элемент массива: " + max);
        System.out.println("Наименьший элемент массива: " + min);
        System.out.println("Количество элементов массива, оканчивающихся на 0: " + count0);
        System.out.println("Сумма элементов массива, оканчивающихся на 0: " + count0Sum);
    }
}