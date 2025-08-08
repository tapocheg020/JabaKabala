package Ablazzing.oppLessons.firstLesson.PracticeOop;

public class Book {
    public String name;
    public String owner;
    public int pageQuantity;
    public boolean documentary;

    public Book(String nameBook, String ownerBook, int pageQuantityBook, boolean documentaryBook) {
        this.name = nameBook;
        this.owner = ownerBook;
        this.pageQuantity = pageQuantityBook;
        this.documentary = documentaryBook;
    }

    public void lineQuantity(){
        System.out.println("Общее кол-во строк в книге расчитывается по формуле: кол-во страниц *40");
    }

    public int lineQuantity(int pageQuantity){
        return pageQuantity * 40;
    }

    public String aboutBook(String nameBook, String ownerBook, boolean documentaryBook){
        if(!documentaryBook) {
            return "Grokking Algorithms - имя книги, Aditya - автор книги, книга недокументальная";
        } return "\"Grokking Algorithms - имя книги, Aditya - автор книги, книга недокументальная\"";
    }



    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                ", owner='" + owner + '\'' +
                ", pageQuantity=" + pageQuantity +
                ", documentary=" + documentary +
                '}';
    }
}
