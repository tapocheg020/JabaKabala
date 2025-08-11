package Ablazzing.oppLessons.firstLesson.carExample;

public class CarBmw {
    public static void main(String[] args) {
        Car bmw = new Car("BMW M5F90", 14_000_000, 1.3);

//        System.out.println(bmw.name);
//        System.out.println(bmw.price);
//        System.out.println(bmw.acceleration);
//
//        bmw.firstRace("BMW M5 F90", 1.1);
//
//        System.out.println(bmw.newMethod(250));
//        System.out.println(bmw.newMethod(220, true));
//        bmw.newMethod("Hello");

//        bmw.fullUpCar("дизелем",98, 100, 95);

        DieselCar dieselCar = new DieselCar("Bmw 340d", -2_400_000, 5.6);
        System.out.println(dieselCar);
//        dieselCar.price //can not to get this method hahah

        dieselCar.setPrice(1_000_000);
        System.out.println(dieselCar);

        System.out.println(dieselCar.getName());

        DieselCar audiCar = new DieselCar();
        System.out.println(audiCar);
    }
}
