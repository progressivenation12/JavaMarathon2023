package day7;

public class Airplane {
    private String producer;
    private int year;
    private double length;
    private double weight;
    private double fuel;

    public Airplane(String producer, int year, int length, int weight) {
        this.producer = producer;
        this.year = year;
        this.length = length;
        this.weight = weight;
        this.fuel = 0;
    }

    public String getProducer() {
        return producer;
    }

    public int getYear() {
        return year;
    }

    public double getLength() {
        return length;
    }

    public double getWeight() {
        return weight;
    }

    public double getFuel() {
        return fuel;
    }

    public void setProducer(String producer) {
        this.producer = producer;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public void setFuel(double fuel) {
        this.fuel = fuel;
    }

    public void fillUp(double fuelQty) {
        fuel += fuelQty;
    }

    public void info() {
        System.out.println("Изготовитель: " + producer
                + ", год выпуска: " + year + " год"
                + ", длина: " + length + " метров"
                + ", вес: " + weight + " тонн"
                + ", количество топлива в баке: " + fuel + " литров.");
    }

    public static void compareAirplanes(Airplane airplane1, Airplane airplane2) {
        if (airplane1.getLength() > airplane2.getLength()) {
            System.out.println("Первый самолет длинее.");
        } else if (airplane1.getLength() < airplane2.getLength()) {
            System.out.println("Второй самолет длинее.");
        } else {
            System.out.println("Длины самолетов равны.");
        }
    }
}
