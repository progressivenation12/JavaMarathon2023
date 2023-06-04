package day12;

import java.util.ArrayList;
import java.util.List;

public class Task1 {
    public static void main(String[] args) {
        List<String> carBrands = new ArrayList<>();

        carBrands.add("BMW");
        carBrands.add("Mercedes");
        carBrands.add("Bentley");
        carBrands.add("Nissan");
        carBrands.add("Honda");

        System.out.println(carBrands);

        carBrands.add(2,  "Chevrolet");

        System.out.println(carBrands);

        carBrands.remove(0);

        System.out.println(carBrands);
    }
}