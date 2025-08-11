package Ablazzing.LessonsSmall;

import java.util.Arrays;

public class MyString {
    public static void main(String[] args) {
        String text = new String("Ilya");
        String text2 = new String("Hello Ilya!!");
        System.out.println(text.equals(text2));

        String textUpper = text.toUpperCase();
        System.out.println(textUpper);

        String lowerText = text.toLowerCase();
        System.out.println(lowerText);

        System.out.println(text.length());

        //
        System.out.println(text2.contains("Hello"));

        //
        String text2Replace = text2.replaceAll("l", "r");
        System.out.println(text2Replace);

        //
        String repeatedText = text.repeat(5);
        System.out.println(repeatedText);

        //
        String names = "Ilya;Kappa;Sveta;Dasha";
        String[] splitNamesArray = names.split(";");
        System.out.println(Arrays.toString(splitNamesArray));

        //
        String word1 = "America ";
        String word2 = "Sosat";
        String sumWords = word1 + word2;
        System.out.println(sumWords);

        //
        boolean startWithHel = text2.startsWith("Hel");
        System.out.println(startWithHel);

        //
        boolean endWithWorld = text2.endsWith("world");
        System.out.println(endWithWorld);

        //Обрезка строки
        String firstFiveLetters = text2.substring(3, 8);
        System.out.println(firstFiveLetters);


        //Practice

        String program = "my name is ilya and i love what i study";
        String[] programMethods = program.substring(11).toUpperCase().split(" ");
        System.out.println(Arrays.toString(programMethods));

//        for(String prog: programMethods) {
//            System.out.println(prog);
//            System.out.println(prog.length());
//        }

        String name = "Ilya";
        int age = 20;
        String phrase = String.format("Меня зовут %s, мне %d лет", name, age);
        System.out.println(phrase);
        System.out.printf("Меня зовут %s, мне %d лет", name, age);


        System.out.println("--------------------------------------");

        String nameCar = "BMW";
        String modelCar = "M5 F90";
        int priceCar = 15_000_000;
        boolean bestCarForWorld = true;
        String formatted = """
                Привет, я менеджер салона %s!
                У нас есть модель %s %s ее цена %d!
                Лучшая ли это машина в мире?
                Конечно %s!!!!
                """.formatted(nameCar, nameCar, modelCar, priceCar, bestCarForWorld ? "дааааа " : "нееееет");

        System.out.println(formatted);


    }
}
//lesson 41