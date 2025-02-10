import java.util.ArrayList;
import java.util.List;

abstract class FoodItem {
    private String itemName;
    private double price;
    private int quantity;

    public FoodItem(String itemName, double price, int quantity) {
        this.itemName = itemName;
        this.price = price;
        this.quantity = quantity;
    }

    public String getItemDetails() {
        return "Item: " + itemName + ", Price: " + price + ", Quantity: " + quantity;
    }

    // Getter methods for encapsulation
    public double getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }

    public abstract double calculateTotalPrice();
}

interface Discountable {
    void applyDiscount(double percentage);
    String getDiscountDetails();
}

class VegItem extends FoodItem implements Discountable {
    public VegItem(String itemName, double price, int quantity) {
        super(itemName, price, quantity);
    }

    @Override
    public double calculateTotalPrice() {
        return getPrice() * getQuantity();  // Using getter methods instead of direct access
    }

    @Override
    public void applyDiscount(double percentage) {
        System.out.println("Discount applied to Veg Item: " + percentage + "%");
    }

    @Override
    public String getDiscountDetails() {
        return "Veg items have seasonal discounts.";
    }
}

class NonVegItem extends FoodItem implements Discountable {
    private static final double NON_VEG_SURCHARGE = 1.10;

    public NonVegItem(String itemName, double price, int quantity) {
        super(itemName, price, quantity);
    }

    @Override
    public double calculateTotalPrice() {
        return getPrice() * getQuantity() * NON_VEG_SURCHARGE;
    }

    @Override
    public void applyDiscount(double percentage) {
        System.out.println("Discount applied to Non-Veg Item: " + percentage + "%");
    }

    @Override
    public String getDiscountDetails() {
        return "Non-Veg items have a fixed surcharge of 10%.";
    }
}

public class OnlineFoodDeliverySystem {
    public static void main(String[] args) {
        List<FoodItem> order = new ArrayList<>();
        order.add(new VegItem("Paneer Tikka", 200, 2));
        order.add(new NonVegItem("Chicken Biryani", 300, 1));

        for (FoodItem item : order) {
            System.out.println(item.getItemDetails());
            System.out.println("Total Price: " + item.calculateTotalPrice());

            if (item instanceof Discountable) {
                ((Discountable) item).applyDiscount(10);
                System.out.println(((Discountable) item).getDiscountDetails());
            }
            System.out.println();
        }
    }
}

