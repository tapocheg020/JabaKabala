package Ablazzing.oppLessons.firstLesson.recursions;

public class Recursion {

    public int sum(int number){
        if(number < 0){
            return 0;
        }
        return number + sum(number - 1);
    }
}
