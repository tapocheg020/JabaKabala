package oop.Interfaces.functional_interfaces;

public class Runner {
    public static void main(String[] args) {
        Study ilya = new Ilya();
        Study katya = () -> System.out.println("НУ и ну вот я и создал класс метод хуй пойми");
        ilya.studyJava();
        ilya.studyLanguage();
        katya.studyJava();
    }
}
