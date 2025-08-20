package Ablazzing.Abstract.Practice;

public class Runner {
    public static void main(String[] args) {

        Secretary secretary = new Secretary();
        secretary.drinkCoffee();
        secretary.receiveSalary(false, 40_000);

        System.out.println("===================================");

        Accountant accountant = new Accountant();
        accountant.drinkCoffee();
        accountant.receiveSalary(false, 55_000);

        System.out.println("===================================");


        SecurityGuard securityGuard = new SecurityGuard();
        securityGuard.receiveSalary(true, 25_000);

        System.out.println("===================================");

    }
}
