package oop.FirstExample;

public class Application {
    private int count;
    private static final int MAX_COUNT = 10;


    public static class InnerStaticClass {
        void printMaxCount() {
            for(int i = 0; i < MAX_COUNT; i++){
                System.out.println(MAX_COUNT + 1);
            }
        }
    }
}
//Классы - 13:43