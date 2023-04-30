package day6;

public class Task2 {
    public static void main(String[] args) {
        Airplane airplane = new Airplane("Airbus", 2010, 73, 560);

        airplane.setYear(2009);
        airplane.setLength(72.75);

        airplane.fillUp(1500);
        airplane.fillUp(1250);

        airplane.info();
    }
}