class Vehicle {
    private static double registrationFee = 5000.0;
    private final String registrationNumber;
    private String ownerName;
    private String vehicleType;

    public Vehicle(String ownerName, String vehicleType, String registrationNumber) {
        this.ownerName = ownerName;
        this.vehicleType = vehicleType;
        this.registrationNumber = registrationNumber;
    }

    public static void updateRegistrationFee(double newFee) {
        registrationFee = newFee;
        System.out.println("Registration fee updated to: $" + registrationFee);
    }

    public void displayVehicleDetails() {
        if (this instanceof Vehicle) {
            System.out.println("Owner Name: " + this.ownerName);
            System.out.println("Vehicle Type: " + this.vehicleType);
            System.out.println("Registration Number: " + this.registrationNumber);
            System.out.println("Registration Fee: $" + registrationFee);
        } else {
            System.out.println("Invalid Vehicle Object");
        }
    }

    public static void main(String[] args) {
        Vehicle vehicle1 = new Vehicle("Priya", "Car", "ABC123");
        Vehicle vehicle2 = new Vehicle("Shreya", "Motorcycle", "XYZ789");

        //System.out.println("----------------------");
        vehicle1.displayVehicleDetails();
        //System.out.println("----------------------");
        vehicle2.displayVehicleDetails();

        Vehicle.updateRegistrationFee(6000.0);

        System.out.println("\nAfter Updating Registration Fee:");
        //System.out.println("----------------------");
        vehicle1.displayVehicleDetails();
        //System.out.println("----------------------");
        vehicle2.displayVehicleDetails();
    }
}

