package Ablazzing.StaticAtribut;

import java.util.Arrays;

public class Runner {
    public static void main(String[] args) {
        Car bmw = new Car("Bmw");
        System.out.println(bmw.getCountCars());
        Car mercedes = new Car("Mercedes");
        System.out.println(mercedes.getCountCars());

        Car.printBrand();

        for(String cars : Car.BRAND_CARS){
            System.out.println(cars);
        }

    }
}

//65 lesson