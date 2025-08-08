package Ablazzing.oppLessons.firstLesson.PracticeOop;

public class Result {
    public static void main(String[] args) {
        Book book = new Book("Grokking Algorithms", "Aditya ", 200,  false);
        System.out.println(book);

        book.lineQuantity();
        System.out.println(book.lineQuantity(164));
        System.out.println(book.aboutBook("Grokking Algorithms", "Aditya ",   false));
    }
}

//java lesson 50 was 42