package Ablazzing.oppLessons.firstLesson.PracticeOppCar;

public class Runner {
    public static void main(String[] args) {
        Car bmw = new Car("BMW");
        Car mercedes = new Car("Mercedes", 400);
        bmw.runToHundred();
        mercedes.runToHundred();

        Garage garage = new Garage();

        garage.setCar1(bmw);
        garage.setCar2(mercedes);
        garage.getInfoAboutCars();
    }
}
