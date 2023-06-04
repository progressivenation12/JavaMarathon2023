package day05;

public class Task2 {
    public static void main(String[] args) {
        Motorbike motorbike = new Motorbike("Kawasaki", "Red", 2010);

        System.out.println(motorbike.getModel() + "\n"
                + motorbike.getColor() + "\n"
                + motorbike.getYear());
    }
}
