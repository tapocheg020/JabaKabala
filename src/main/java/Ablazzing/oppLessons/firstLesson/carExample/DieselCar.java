package Ablazzing.oppLessons.firstLesson.carExample;

public class DieselCar {
    private String name = "Audi rs6";
    private int price = 2_400_000;
    private double acceleration = 3.4;

    {
        System.out.println("New Diesel Car ");
    }

    public DieselCar() {
    }

    public DieselCar(String name, int price, double acceleration) {
        if(price < 0) {
            this.price = 1_700_000;
        } else {
            this.price = price;
        }

        this.name = name;
        this.acceleration = acceleration;
    }

    public void setPrice(int price) {
        if(price < 0) {
            this.price = 1_700_000;
        } else {
            this.price = price;
        }
    }

    public String getName(){
        return DieselCar.this.name;
    }

    public void pourIn(String owner, String fuel ) {
        System.out.printf("Человек по имени %s, залил свою дизельную машину - %s\n", owner, fuel);
    }


    @Override
    public String toString() {
        return "DieselCar{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", acceleration=" + acceleration +
                '}';
    }
}

//58 lesson