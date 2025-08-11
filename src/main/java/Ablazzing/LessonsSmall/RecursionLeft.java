package Ablazzing.LessonsSmall;

import java.util.Arrays;

public class RecursionLeft {
    public static void main(String[] args) {
        int[] array = new int[2000];
        Arrays.setAll(array, i -> (int) (Math.random() * 255));

        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        System.out.println(sum);
        System.out.println(sumRec(0, 0 ,array));
    }

    static int sumRec(int i, int sum, int[] array){
        if(i == array.length){
            return sum;
        }
        return sumRec(i + 1, sum + array[i], array);
    }
}
