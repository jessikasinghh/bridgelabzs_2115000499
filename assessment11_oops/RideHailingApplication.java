import java.util.ArrayList;
import java.util.List;

abstract class Vehicle {
    private String vehicleId;
    private String driverName;
    private double ratePerKm;

    public Vehicle(String vehicleId, String driverName, double ratePerKm) {
        this.vehicleId = vehicleId;
        this.driverName = driverName;
        this.ratePerKm = ratePerKm;
    }

    public String getVehicleDetails() {
        return "Vehicle ID: " + vehicleId + ", Driver: " + driverName + ", Rate per Km: " + ratePerKm;
    }

    // Getter method for encapsulation
    public double getRatePerKm() {
        return ratePerKm;
    }

    public abstract double calculateFare(double distance);
}

interface GPS {
    String getCurrentLocation();
    void updateLocation(String newLocation);
}

class Car extends Vehicle implements GPS {
    private String location;

    public Car(String vehicleId, String driverName, double ratePerKm) {
        super(vehicleId, driverName, ratePerKm);
        this.location = "Unknown";
    }

    @Override
    public double calculateFare(double distance) {
        return distance * getRatePerKm(); // Using getter method
    }

    @Override
    public String getCurrentLocation() {
        return location;
    }

    @Override
    public void updateLocation(String newLocation) {
        this.location = newLocation;
    }
}

class Bike extends Vehicle implements GPS {
    private String location;

    public Bike(String vehicleId, String driverName, double ratePerKm) {
        super(vehicleId, driverName, ratePerKm);
        this.location = "Unknown";
    }

    @Override
    public double calculateFare(double distance) {
        return distance * getRatePerKm() * 0.9; // 10% discount for bikes
    }

    @Override
    public String getCurrentLocation() {
        return location;
    }

    @Override
    public void updateLocation(String newLocation) {
        this.location = newLocation;
    }
}

class Auto extends Vehicle implements GPS {
    private String location;

    public Auto(String vehicleId, String driverName, double ratePerKm) {
        super(vehicleId, driverName, ratePerKm);
        this.location = "Unknown";
    }

    @Override
    public double calculateFare(double distance) {
        return distance * getRatePerKm() * 1.05; // 5% surcharge for autos
    }

    @Override
    public String getCurrentLocation() {
        return location;
    }

    @Override
    public void updateLocation(String newLocation) {
        this.location = newLocation;
    }
}

public class RideHailingApplication {
    public static void main(String[] args) {
        List<Vehicle> rides = new ArrayList<>();
        rides.add(new Car("C101", "Sam", 15));
        rides.add(new Bike("B202", "Anu", 10));
        rides.add(new Auto("A303", "Sam", 12));

        double distance = 10; // Example distance in km
        for (Vehicle ride : rides) {
            System.out.println(ride.getVehicleDetails());
            System.out.println("Fare for " + distance + " km: " + ride.calculateFare(distance));

            if (ride instanceof GPS) {
                ((GPS) ride).updateLocation("Downtown");
                System.out.println("Updated Location: " + ((GPS) ride).getCurrentLocation());
            }
            System.out.println();
        }
    }
}

