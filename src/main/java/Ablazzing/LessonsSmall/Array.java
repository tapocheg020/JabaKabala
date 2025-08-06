package Ablazzing.LessonsSmall;

import java.util.Arrays;

public class Array {
    public static void main(String[] args) {
        String name1 = "Ilya";
        String name2 = "Kappa";
//        String [] array = new String[]{name1, name2};
        String [] array = {name1, name2};

        String [] array2 = new String[2];
        array2[0] = array[0];
        array2[1] = array[1];
        array2[1] = "Katya";

//        System.out.println(Arrays.toString(array));
//        System.out.println(Arrays.toString(array2));
//        System.out.println(array[1]);
//        System.out.println(array2[1]);

        char [] arrayKatana = {'D', 'o', 'h', 'a'};
//        System.out.println(Arrays.toString(arrayKatana));

        //for each
        String[] myLoves = {"Kappa", "Katya", "Natasha", "Alena", "Nastya"};
//        for(String loves : myLoves) {
//            System.out.println(loves);
//        }

        //for i
//        for (int i = 0; i < myLoves.length; i++) {
////            System.out.printf("это индекс -> %d", i);
//            if(i < 3){
//                System.out.println(myLoves[i]);
//            }
//        }

        int[] numbers = {3, 2, 10, 5, 8};
//        for(int number : numbers) {
//            if(number % 2 == 0) {
//                System.out.println(number);
//            }
//        }

//        for (int i = 0; i < numbers.length ; i++) {
//            if(i % 2 == 0) {
//                System.out.println(numbers[i]);
//            }
//        }


        int count = 10;
//        while ( count < 20) {
//            System.out.println(count+1);
//            count++;
//        }

//        while(true){
//            count++;
//            System.out.println(count);
//            if(count == 50) {
//                break;
//            }
//        }

//        do {
//            System.out.println(count);
//            count++;
//        } while (count < 40);


//        int[] group1 = {180, 178, 185};
//        int[] group2 = {190, 198, 166};
//        int[][] multiArray = {group1, group2};
//
//        upperFor:
//        for(int[] arrayGroup : multiArray) {
//            for(int number : arrayGroup ) {
//               if(number == 198 ) {
//                   System.out.println("Нашли вора");
//                   break upperFor;
//               } else {
//                   System.out.println("Мимо");
//               }
//            }
//        }


        int[] results = {1, 4, 5, 7, 9, 6};
        for(int result: results) {
            System.out.println(result);
            if(result ==5) {
                System.out.println("Спортсмен адыхает");
                continue;
            }
            System.out.println("Спортсмен пашет бляха");
        }


    }
}

//34 lesson