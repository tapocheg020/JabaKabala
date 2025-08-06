public class Application {

    public static void main(String[] args) {
        System.out.println("Hello world last language ");

        byte footSize = 43;
        System.out.println(footSize);

        footSize = 42;

        short age = 20;
        System.out.println("Мне " + age + " лет" );

        int salaryProger = 1_000_000;
        System.out.println(salaryProger);

        long salaryTopProger = 5_323_000_000l;
        System.out.println(salaryTopProger);

        float temperature = 363000.63f;
        System.out.println(temperature);

        double temperatureDouble = 363000.63;
        System.out.println(temperatureDouble);

        boolean isWorkHard = true;
        System.out.println(isWorkHard);
        System.out.println(footSize);



    }

    String name;
    int age;

    void setName(String name, int age) {
        this.name = name;
        this.age = age;
    }

    String getName() {
        return this.name + this.age;
    }


}

