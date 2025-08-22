package oop.Interfaces.Dependency_inversion;

public class AutoPark {
    private Car car1;
    private Car car2;

    public AutoPark(Car car1, Car car2) {
        System.out.println("Самые быстрые, шустрые и чоткие тачилы");
        this.car1 = car1;
        this.car2 = car2;
    }

    public AutoPark(Bmw bmw, Mercedes mercedes){
        System.out.println("Самые хайповые машины езже");
        this.car1 = bmw;
        this.car2 = mercedes;
    }
}
