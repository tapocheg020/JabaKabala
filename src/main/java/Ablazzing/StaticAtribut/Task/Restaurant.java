package Ablazzing.StaticAtribut.Task;

public class Restaurant {
    private static int sausageCount = 0;
    private static int breadCount = 0;

    public void cookHotDog() {
        if(sausageCount > 0 && breadCount > 1) {
            sausageCount -= 1;
            breadCount -= 2;
            System.out.println("Держите ваш хот дог");
        } else {
            System.out.println("Интгридиентов нет, простите хот дога не будет ");
        }
    }

    public void addProducts() {
        sausageCount += 100;
        breadCount += 200;
        System.out.println("Произошла поставка товаров");
    }


}
