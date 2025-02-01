public class book{
    private String title;
    private String author;
    private double price;

    //default
    public book(){
        this.title = "song";
        this.author = "gian";
        this.price = 10.00;
    }
    //parameterized C.
    public book(String title,String author , double price){
        this.title = title;
        this.author = author;
        this.price = price;
    }
    public static void main(String[] args) {
        book b1 = new book();
        book b2 = new book("Aa","dd",100);
    }
}
