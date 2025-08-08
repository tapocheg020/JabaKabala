package Ablazzing.oppLessons.firstLesson.carExample;

public class CarBmw {
    public static void main(String[] args) {
        Car bmw = new Car("BMW M5F90", 14_000_000, 1.3);

        System.out.println(bmw.name);
        System.out.println(bmw.price);
        System.out.println(bmw.acceleration);

        bmw.firstRace("BMW M5 F90", 1.1);

        System.out.println(bmw.newMethod(250));
        System.out.println(bmw.newMethod(220, true));
        bmw.newMethod("Hello");
    }
}
