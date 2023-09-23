package pract2.Bookshelf;

public class BookTest {
    public static void main(String[] args)
    {
        Book book1 = new Book("name1", "T_T", 1941);
        Book book2 = new Book("name2", "T_T", 1942);
        Book book3 = new Book("name3", "T_T", 1943);
        System.out.println(book1.toString());

        Book[] books = new Book[]{book3, book2, book1};

        Bookshelf bookshelf = new Bookshelf(books, books.length);
        System.out.println(bookshelf.toString());
        System.out.println(bookshelf.last().toString());
        bookshelf.Sort();
        System.out.println(bookshelf.toString());

    }
}
