package Ablazzing.Abstract.Practice;

public abstract class Human {
    private boolean isMan;
    private int salary;


    public void receiveSalary(boolean isMan, int salary){
       if(isMan) {
           System.out.println("Этот человек мужчина");
       } else {
           System.out.println("Этот человек женщина");
       }

       if(salary > 0) {
           System.out.println("Зарплата начислена");
       } else {
           System.out.println("Зарлплата не начисленна");
       }

    }

}
