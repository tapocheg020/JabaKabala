import org.apache.commons.lang3.RandomStringUtils;

public class SetAndGet {
    boolean v8 = true ;

    void engine() {
        boolean v8 = false;
        System.out.printf("Сначала идет локальная переменная %s%n", this.v8);
        System.out.printf("Сначала идет локальная переменная %s%n", v8);

    }

    public static void main(String[] args) {
        SetAndGet obj = new SetAndGet();
        obj.generateName();       // ➜ 4 символа
        obj.generateName(10);     // ➜ 10 символов
    }

    static final int DEFAULT_NAME_LENGTH = 4;

    void generateName(int length) {
        String name = RandomStringUtils.randomAlphabetic(length);
        System.out.println("Generated name: " + name);
    }

    void generateName(){
         this.generateName(DEFAULT_NAME_LENGTH);
    }



}


