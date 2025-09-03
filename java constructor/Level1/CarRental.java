public class CarRental {
    private String customerName;
    private String carModel;
    private int rentalDays;
    private double dailyRate = 50.0; // Example rate

    
    public CarRental() {
        this.customerName = "Unknown";
        this.carModel = "Standard";
        this.rentalDays = 1;
    }

    
    public CarRental(String customerName, String carModel, int rentalDays) {
        this.customerName = customerName;
        this.carModel = carModel;
        this.rentalDays = rentalDays;
    }

    public double calculateTotalCost() {
        return rentalDays * dailyRate;
    }

    public String getCustomerName() { return customerName; }
    public String getCarModel() { return carModel; }
    public int getRentalDays() { return rentalDays; }
    public void setCustomerName(String customerName) { this.customerName = customerName; }
    public void setCarModel(String carModel) { this.carModel = carModel; }
    public void setRentalDays(int rentalDays) { this.rentalDays = rentalDays; }
}
