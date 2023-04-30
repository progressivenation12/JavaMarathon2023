package day6;

public class Task1 {
    public static void main(String[] args) {
        Car car = new Car();
        car.setModel("Lada");
        car.setColor("Black");
        car.setYear(1999);

        Motorbike motorbike = new Motorbike("Kawasaki", "Red", 2010);

        car.info();
        System.out.println("Модель: " + car.getModel()
                + ", цвет: " + car.getColor() + ", год выпуска: " + car.getYear());
        System.out.println("Возраст автомобиля: " + car.yearDifference(2023));

        motorbike.info();
        System.out.println("Модель: " + motorbike.getModel()
                + ", цвет: " + motorbike.getColor() + ", год выпуска: " + motorbike.getYear());
        System.out.println("Возраст мотоцикла: " + motorbike.yearDifference(2023));
    }
}