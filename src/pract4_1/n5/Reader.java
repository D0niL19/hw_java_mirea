package pract4_1.n5;

public class Reader {
    String name, id, fac, number, date;

    public Reader(String name, String id, String fac, String number, String date) {
        this.name = name;
        this.id = id;
        this.fac = fac;
        this.number = number;
        this.date = date;
    }

    public void takeBook(int cnt){
        System.out.println(name + " took " + cnt + " books");

    }

   public void takeBook(String... names){
        System.out.println(name + " took books:");
        for (String name_book : names){
            System.out.println(name_book + " ");
        }
   }

   public void takeBook(Book... books){
        System.out.println(name + " took " + books.length + " books");
        for (Book book : books){
            System.out.println(book.getTitle());
        }
   }

   public void returnBook(int cnt){
        System.out.println(name + " returned " + cnt + " books");
   }

    public void returnBook(String... names){
        System.out.println(name + " returned books:");
        for (String name_book : names){
            System.out.println(name_book + " ");
        }
    }

    public void returnBook(Book... books){
        System.out.println(name + " returned " + books.length + " books");
        for (Book book : books){
            System.out.println(book.getTitle());
        }
    }

}
