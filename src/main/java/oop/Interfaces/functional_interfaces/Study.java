package oop.Interfaces.functional_interfaces;

@FunctionalInterface
public interface Study {
    void studyJava();
    default void studyLanguage(){
        System.out.println("Учу английский язык, на русском вроде как разговариваю");
    }
}
