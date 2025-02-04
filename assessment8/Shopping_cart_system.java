class Product {
    private static double discount = 10.0;
    private final int productID;
    private String productName;
    private double price;
    private int quantity;

    public Product(int productID, String productName, double price, int quantity) {
        this.productID = productID;
        this.productName = productName;
        this.price = price;
        this.quantity = quantity;
    }

    public static void updateDiscount(double newDiscount) {
        discount = newDiscount;
        System.out.println("Discount updated to: " + discount + "%");
    }

    public void displayProductDetails() {
        if (this instanceof Product) {
            double discountedPrice = price - (price * discount / 100);
            System.out.println("Product ID: " + this.productID);
            System.out.println("Product Name: " + this.productName);
            System.out.println("Original Price: $" + this.price);
            System.out.println("Discounted Price: $" + discountedPrice);
            System.out.println("Quantity Available: " + this.quantity);
        } else {
            System.out.println("Invalid Product Object");
        }
    }
    public static void main(String[] args) {
        Product prod1 = new Product(101, "Dyson", 40000.0, 1);
        Product prod2 = new Product(102, "MK watch", 25000.0, 1);

        System.out.println("----------------------");
        prod1.displayProductDetails();
        System.out.println("----------------------");
        prod2.displayProductDetails();

        Product.updateDiscount(15.0);

        System.out.println("\nAfter Updating Discount:");
        System.out.println("----------------------");
        prod1.displayProductDetails();
        System.out.println("----------------------");
        prod2.displayProductDetails();
    }
}
