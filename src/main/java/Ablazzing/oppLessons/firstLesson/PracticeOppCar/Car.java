package Ablazzing.oppLessons.firstLesson.PracticeOppCar;

public class Car {
    private String brand;
    private int maxSpeed = 220;

    public Car(String brand) {
        this.brand = brand;
    }

    public Car(String brand, int maxSpeed) {
        this.brand = brand;
        this.maxSpeed = maxSpeed;
    }

    public void runToHundred() {
        double speed = 110d /(this.maxSpeed / 20d);
        System.out.printf("Скорость разгона автомобиля до 100 км/ч: %s\n", speed );
    }

    public String getBrand() {
        return brand;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }
}

