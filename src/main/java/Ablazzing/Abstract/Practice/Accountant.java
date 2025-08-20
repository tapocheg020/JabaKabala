package Ablazzing.Abstract.Practice;

public class Accountant extends OfficeHero {

    @Override
    public void drinkCoffee(){
        System.out.println("Бухгалтери пьет кофе часто, так еще и заедает чем нибудь вкусным");
    }

    @Override
    public void receiveSalary(boolean isMan, int salary) {
        super.receiveSalary(isMan, salary);
        System.out.println("Бухгалтер получил зарплату - " + salary);
    }
}
