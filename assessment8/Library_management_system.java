class Book {
    private static String libraryName = "City Library";
    private final String isbn;
    private String title;
    private String author;

    public Book(String title, String author, String isbn) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
    }
    public static void displayLibraryName() {
        System.out.println("Library Name: " + libraryName);
    }
    public void displayBookDetails() {
        if (this instanceof Book) {
            System.out.println("Library: " + libraryName);
            System.out.println("Title: " + this.title);
            System.out.println("Author: " + this.author);
            System.out.println("ISBN: " + this.isbn);
        } else {
            System.out.println("Invalid Book Object");
        }
    }
    public static void main(String[] args) {
        Book.displayLibraryName();
        Book book1 = new Book("The three mistakes of my life", "Chetan Bhagat", "987-6543467");
        Book book2 = new Book("Too Good To Be", "Prajakta Koli", "952-6486867");

        System.out.println("----------------------");
        book1.displayBookDetails();
        System.out.println("----------------------");
        book2.displayBookDetails();
    }
}
