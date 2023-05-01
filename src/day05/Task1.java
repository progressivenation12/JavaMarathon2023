package day05;

public class Task1 {
    public static void main(String[] args) {
        Car car = new Car();
        car.setColor("Black");
        car.setYear(2000);
        car.setModel("Audi");

        System.out.println("Our car: model " + car.getModel()
                + ", color " + car.getColor()
                + ", year " + car.getYear() + ".");
    }
}