//58. Create a Book class for a library system.
//• Instance variables: title, author, isbn.
//• Static variable: totalBooks, a counter for the total number of book instances.
//• Instance methods: borrowBook(), returnBook().
//• Static method: getTotalBooks(), to get the total number of books in the library.

class Book {
    String title, author, isbn;
    static int totalBooks = 0;

    public Book(String title, String author, String isbn) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
        totalBooks++;
    }

    public void borrowBook() {
        System.out.println(title + " borrowed.");
    }

    public void returnBook() {
        System.out.println(title + " returned.");
    }

    public static int getTotalBooks() {
        return totalBooks;
    }

    public static void main(String[] args) {
        Book b1 = new Book("Gita", "Vyasa", "12345");
        Book b2 = new Book("Ramayana", "Valmiki", "54321");
        b1.borrowBook();
        b2.returnBook();
        System.out.println("Total Books: " + Book.getTotalBooks());
    }
}

