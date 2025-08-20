package Ablazzing.Abstract.Practice;

public class SecurityGuard extends Human {

    @Override
    public void receiveSalary(boolean isMan, int salary) {
        super.receiveSalary(isMan, salary);
        System.out.println("Охранник получил зп - " + salary);
    }
}
