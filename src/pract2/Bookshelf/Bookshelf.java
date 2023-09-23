package pract2.Bookshelf;

import java.util.Arrays;
import java.util.Comparator;

public class Bookshelf {
    Book[] books;
    int size;

    public Bookshelf(Book[] books, int size) {
        this.books = books;
        this.size = size;
    }

    public Book last(){
        Book book = books[0];
        for (int i = 1; i < size; i++)
        {
            if (book.year < books[i].year){
                book = books[i];
            }
        }
        return book;
    }

    public Book first(){
        Book book = books[0];
        for (int i = 1; i < size; i++)
        {
            if (book.getYear() > books[i].getYear()){
                book = books[i];
            }
        }
        return book;
    }

    public void Sort(){
        Arrays.sort(books, new Comparator<Book>() {
            @Override
            public int compare(Book o1, Book o2) {
                return o1.getYear() - o2.getYear();
            }
        });
    }

    @Override
    public String toString() {
        return "Bookshelf_7.pract1.Bookshelf{" +
                "books=" + Arrays.toString(books) +
                ", size=" + size +
                '}';
    }
}
