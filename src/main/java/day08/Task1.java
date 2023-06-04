package day08;

public class Task1 {
    public static void main(String[] args) {
        String numbers = "";

        long beforeTimeString = System.currentTimeMillis();

        for (int i = 0; i <= 20000; i++) {
            numbers += i + " ";
        }

        long afterTimeString = System.currentTimeMillis();

        System.out.println("Время выполнения цикла с классом String: " + (afterTimeString - beforeTimeString));
        System.out.println(numbers);

        StringBuilder stringBuilder = new StringBuilder();

        long beforeTimeSB = System.currentTimeMillis();

        for (int i = 0; i <= 20000; i++) {
            stringBuilder.append(i).append(" ");
        }

        long afterTimeSB = System.currentTimeMillis();

        System.out.println("Время выполнения цикла с классом stringBuilder: " + (afterTimeSB - beforeTimeSB));
        System.out.println(stringBuilder);
    }
}