package Ablazzing.oppLessons.firstLesson.carExample.auto;

import Ablazzing.oppLessons.firstLesson.carExample.Car;
import Ablazzing.oppLessons.firstLesson.carExample.DieselCar;

public class CarMercedes {
    private Car car;
    private DieselCar diesel;

    public CarMercedes(Car car, DieselCar diesel) {
        if(car == null || diesel == null) {
            this.car = car;
            this.diesel = diesel;
        }


    }

    public void pourIn() {
        car.pourIn("Ilya", "Бензином");
        car.pourIn("Ivan", "Дизелем");
    }
}
