package Ablazzing.StaticAtribut;

public class Car {
    private String brand;
    private static int countCars = 0;

    public final static String BMW_INFO = "BMW - немецкая тачка и конкертно m5 стоит около 15 миллионов";
    public final static String MERCEDES_INFO = "Mercedes - немецкая тачка и конкертно cls стоит около 11 миллионов";
    public final static String AUDI_INFO = "BMW - немецкая тачка и конкертно rs6 стоит около 9 миллионов";

    public final static String[] BRAND_CARS = new String[3];

    static {
        BRAND_CARS[0] = BMW_INFO;
        BRAND_CARS[1] = MERCEDES_INFO;
        BRAND_CARS[2] = AUDI_INFO;
    }


    public Car(String brand) {
        this.brand = brand;
        countCars++;
    }

    public int getCountCars() {
        return countCars;
    }

    public static void printBrand(){
        System.out.println("Перечень доступных брендев: bmw, mercedes, audi");
    }


}
