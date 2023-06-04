package day18;

public class Task1 {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, -5, 6, 7, 8, 9, 10, 11};
        System.out.println(recursionSum(numbers, 0));
    }

    public static int recursionSum(int[] numbers, int i) {
        if (i == numbers.length) {
            return 0;
        }
        return numbers[i] + recursionSum(numbers, i + 1);
    }
}