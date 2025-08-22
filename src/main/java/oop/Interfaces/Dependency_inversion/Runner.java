package oop.Interfaces.Dependency_inversion;

public class Runner {
    public static void main(String[] args) {
        Bmw bmwM5 = new Bmw();
        Mercedes mercedesMybah = new Mercedes();
        Audi audiRs6 = new Audi();

        AutoPark fastCar = new AutoPark(audiRs6, bmwM5);
        AutoPark fipeCar = new AutoPark(bmwM5, mercedesMybah);

        System.out.println("---------------------------------");
        bmwM5.carIsMoving();
        mercedesMybah.carIsMoving();
        audiRs6.carIsMoving();



    }
}
