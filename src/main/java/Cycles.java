public class Cycles {

    static int count = 0;

    public static void main(String[] args) {
        int number = 13;
        for(int i = 0; i < number; i++ ) {
            if(i %2 == 0) {
                System.out.println(i);
                count++;
            } else {
                System.out.println("А это уже идут нечетные числа: " + i);
            }

        }
        System.out.println("Количество четных числе: " + count);


        int number2 = 120;

        switch(number2) {
            case 2 -> System.out.println("Неверно, попробуй еще");
            case 3 -> System.out.println("Неверно, попробуй еще");
            case 4 -> System.out.println("Неверно, попробуй еще");
            case 5 -> System.out.println("В точку братан, ты красаучек");
            default -> System.out.println("Ну не получилось у тебя ваще, дальше точно не то, попробуй еще");
        }
    }
}
