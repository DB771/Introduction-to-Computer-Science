public class Commission extends Hourly {
    private double totalSales;
    private double commissionRate;

    // Constructor
    public Commission(String name, String address, String phone, String ssn, double rate, double commissionRate) {
        super(name, address, phone, ssn, rate);
        this.commissionRate = commissionRate;
    }
    // Method to add sales
    public void addSales(double totalSales) {
        this.totalSales += totalSales;
    }
    // Override pay method
    @Override
    public double pay() {
        double payPerHour = super.pay();
        double commissionPay = totalSales*commissionRate;
        totalSales = 0;
        return payPerHour + commissionPay;
    }
    // Override toString method
    @Override
    public String toString() {
        String result = super.toString();
        result += "\nTotal Sales: $" + totalSales;
        return result;
    }
}