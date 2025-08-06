public class StackTraceExample {
    public static void main(String[] args) {
        first();
        oneNumber();
    }

    static void first(){
        second();
    }
    static void second(){
        third();
    }
    static void third(){
        fourth();
    }
    static void fourth(){
        int number = 5;
        for (int i = 0; i < number; i++) {
            System.out.println("Типа понял stack");
        }
    }

    public static void oneNumber(){
        int a = 10;
        int b = 15;
        System.out.printf("one: a = %d, b = %d%n", a, b);

        twoNumber();

        a = 25;
        b = 35;
        System.out.println("one: a + b = " + (a + b));
    }

    public static void twoNumber(){
        int c = 10;
        int e = 15;
        System.out.printf("two: c = %d, e = %d%n", c, e);

        thirdNumber();

        c = 20;
        e = 30;
        System.out.println("two: c + e = "+ (c + e));
    }

    public static void thirdNumber(){
        int i = 10;
        int h = 15;
        System.out.printf("three: i = %d, h = %d%n", i, h);
    }



}
