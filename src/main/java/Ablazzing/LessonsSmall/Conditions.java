package Ablazzing.LessonsSmall;

public class Conditions {
    public static void main(String[] args) {
//        int ageIlya = 20;
//        int ageKatya = 24;
//
//        if (ageIlya == 20 && ageKatya == 24) {
//            System.out.println("У нас есть шанс на свидание");
//        } else if(ageIlya >= 20 && ageKatya ==26) {
//            System.out.println("Шанс довольно мал");
//        } else {
//            System.out.println("ниче не совпало, гуляй ");
//        }

        // есть && - выискивает хоть один false а есть || - выискивает хоть одно true

        boolean isBoughtCandy = false;

        if(!isBoughtCandy) {
            System.out.println("Сынок молодец, вот тебе награда");
        } else {
            System.out.println("Ну и баклан ты канеш бляяяя");
        }


        int money = 100;
        int breadPrice = 60;
        int moneyAfterSHopping = money - breadPrice;
        int childMoney = moneyAfterSHopping >= 50 ? 10 : 5;
        moneyAfterSHopping -= moneyAfterSHopping >= 50 ? 10 : 5;

        System.out.println(childMoney);
        System.out.println(moneyAfterSHopping);


        int numberDay = 2;

        switch (numberDay) {
            case 1 -> System.out.println("Понедельник день бездельник");
            case 2 -> System.out.println("Вторник повторник");
            case 3 -> System.out.println("Среда тамода");
            case 4 -> System.out.println("Четверг все заботы я отверг");
            case 5 -> System.out.println("Пятница развратница");
            case 6 -> System.out.println("Суббота блядота");
            case 7 -> System.out.println("Восскресенье выходнооой");
            default -> System.out.println("бро такого дня нет, попробуй заново");
        }


        //Practice

        boolean isWorkEngine = true;
        boolean isWorkTransmission = true;
        boolean isFineWheel1 = true;
        boolean isFineWheel2 = false;
        boolean isFineWheel3 = false;
        boolean isFineWheel4 = true;

        int countWheel = 0;
       countWheel += isFineWheel1 ? 1 : 0;
       countWheel += isFineWheel1 ? 2 : 0;
       countWheel += isFineWheel1 ? 3 : 0;
       countWheel += isFineWheel1 ? 4 : 0;

        if(countWheel >= 3 && isWorkEngine && isWorkTransmission) {
            System.out.println("Можем ехать, машина более менее впорядке");
        } else {
            System.out.println("Передвигать мы не можем, надо починить сначала машину");
        }




    }
}
