package Ablazzing.oppLessons.firstLesson.carExample;

import java.util.Arrays;

public class Car extends DieselCar {
    public String name;
    public int price;
    public double acceleration;

    public Car(String nameCar, int priceCar, double accelerationCar ) {
        this.name = nameCar;
        this.price = priceCar;
        this.acceleration = accelerationCar;
    }

    public void firstRace(String nameCar, double accelerationCar){
        System.out.printf("В первый же заезд %s доехала первый и разгонг у ее был %f %n", nameCar, accelerationCar);
    }

    public String newMethod(int run) {
        if(run >= 230) {
            return "Бмв молодец оч быстрая";
        }
        return "Ну стандартная 1.5 литражка епта паль нахуй копейка бля";

    }

    public String newMethod(int run, boolean success) {
        if(success) {
            if (run >= 230) {
                return "Бмв молодец оч быстрая";
            }
            return "Ну стандартная 1.5 литражка епта паль нахуй копейка бля";
        }
        return "Ничего не выводится епта бля";
    }

    public void newMethod(String timesOfDay) {
        if(timesOfDay.equals("Hello")) {
            System.out.println("huinya kakayato");
        } else {
            System.out.println("Комарчик");
        }
    }

    public void fullUpCar(String diseal, int ...petrol){
        for(int petrolCar: petrol){
            System.out.printf("МОя машина и я ее заправил %s бензином\n", petrolCar);
        }
        System.out.printf("У меня еще есть и дизельная бэха я ее заправил %s", diseal);
    }

    public void pourIn(String owner, String fuel ) {
        System.out.printf("Человек по имени %s, залил свою бензиновою машину - %s\n", owner, fuel);
    }




    @Override
    public String toString() {
        return "Car{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", acceleration=" + acceleration +
                '}';
    }
}
//49 lesson