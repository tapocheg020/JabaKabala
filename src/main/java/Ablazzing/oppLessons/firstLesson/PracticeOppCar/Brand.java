package Ablazzing.oppLessons.firstLesson.PracticeOppCar;

public class Brand {
    private String brand;
    private int maxSpeed = 220;

    public Brand(String brand, int maxSpeed) {
        this.brand = brand;
        this.maxSpeed = maxSpeed;
    }

    public void runToHundred() {
        System.out.println("Скорость разгона автомобиля до 100 км/ч: " + 110/(this.maxSpeed / 20));
    }


}

