import java.util.ArrayList;
import java.util.List;

abstract class Product<T> {
    private String name;
    private double price;
    private T category;

    public Product(String name, double price, T category) {
        this.name = name;
        this.price = price;
        this.category = category;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public T getCategory() {
        return category;
    }

    public void applyDiscount(double percentage) {
        price -= price * (percentage / 100);
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + " {" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", category=" + category +
                '}';
    }
}

class Book extends Product<BookCategory> {
    public Book(String name, double price, BookCategory category) {
        super(name, price, category);
    }
}

class Clothing extends Product<ClothingCategory> {
    public Clothing(String name, double price, ClothingCategory category) {
        super(name, price, category);
    }
}

class Gadget extends Product<GadgetCategory> {
    public Gadget(String name, double price, GadgetCategory category) {
        super(name, price, category);
    }
}

enum BookCategory { FICTION, NON_FICTION, SCIENCE, HISTORY }
enum ClothingCategory { MEN, WOMEN, KIDS }
enum GadgetCategory { MOBILE, LAPTOP, ACCESSORY }

class Catalog<T extends Product<?>> {
    private List<T> products = new ArrayList<>();

    public void addProduct(T product) {
        products.add(product);
    }

    public void applyDiscountToAll(double percentage) {
        for (T product : products) {
            product.applyDiscount(percentage);
        }
    }

    public List<T> getProducts() {
        return products;
    }
}

public class DynamicMarketplace {
    public static void main(String[] args) {
        Catalog<Book> bookCatalog = new Catalog<>();
        Catalog<Clothing> clothingCatalog = new Catalog<>();
        Catalog<Gadget> gadgetCatalog = new Catalog<>();

        bookCatalog.addProduct(new Book("The Alchemist", 20.00, BookCategory.FICTION));
        clothingCatalog.addProduct(new Clothing("T-Shirt", 15.00, ClothingCategory.MEN));
        gadgetCatalog.addProduct(new Gadget("Smartphone", 500.00, GadgetCategory.MOBILE));

        System.out.println("Before Discount:");
        System.out.println(bookCatalog.getProducts());
        System.out.println(clothingCatalog.getProducts());
        System.out.println(gadgetCatalog.getProducts());

        bookCatalog.applyDiscountToAll(10);
        clothingCatalog.applyDiscountToAll(15);
        gadgetCatalog.applyDiscountToAll(5);

        System.out.println("\nAfter Discount:");
        System.out.println(bookCatalog.getProducts());
        System.out.println(clothingCatalog.getProducts());
        System.out.println(gadgetCatalog.getProducts());
    }
}
