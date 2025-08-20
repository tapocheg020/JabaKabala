package Ablazzing.Abstract.Practice;

public class Secretary extends OfficeHero {

    @Override
    public void drinkCoffee(){
        System.out.println("Секретарь все время пьет кофе, ну уж очень ей нравится");
    }

    @Override
    public void receiveSalary(boolean isMan, int salary) {
        super.receiveSalary(isMan, salary);
        System.out.println("Секретарь получил зарплату - " + salary);
    }

}
