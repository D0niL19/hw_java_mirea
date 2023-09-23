package pract4_1.n5;

public class n5 {
    public static void main(String[] args){
        Reader reader = new Reader("Петров В.В.", "12345", "Исторический", "01.01.1990", "123-456-7890");
        Book book1 = new Book("Приключения", "Автор1");
        Book book2 = new Book("Словарь", "Автор2");
        Book book3 = new Book("Энциклопедия", "Автор3");

        reader.takeBook("Harry Potter");
        reader.takeBook(book1, book2, book3);
        reader.takeBook(5);
        System.out.println();
        reader.returnBook(3);
        reader.returnBook("Harry Potter", "Invisible man");
        reader.returnBook(book2, book3);
    }
}
