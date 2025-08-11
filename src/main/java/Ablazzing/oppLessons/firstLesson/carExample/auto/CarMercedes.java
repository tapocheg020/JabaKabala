package Ablazzing.oppLessons.firstLesson.carExample.auto;

import Ablazzing.oppLessons.firstLesson.carExample.Car;

public class CarMercedes {
    public static void main(String[] args) {
        Car mercedes = new Car("mercedes c63", 2_000_000, 3.4);
        System.out.println(mercedes.name);
    }
}
