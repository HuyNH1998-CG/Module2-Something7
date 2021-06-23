public class KhachHang {
    private String customerID;
    private String name;
    private String billDate;
    private double amount;
    private double bill;

    public KhachHang() {
    }

    public KhachHang(String customerID, String name, String billDate) {
        this.customerID = customerID;
        this.name = name;
        this.billDate = billDate;
    }

    public KhachHang(String customerID, String name, String billDate, double amount, double bill) {
        this.customerID = customerID;
        this.name = name;
        this.billDate = billDate;
        this.amount = amount;
        this.bill = bill;
    }

    public String getCustomerID() {
        return customerID;
    }

    public void setCustomerID(String customerID) {
        this.customerID = customerID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBillDate() {
        return billDate;
    }

    public void setBillDate(String billDate) {
        this.billDate = billDate;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public double getBill() {
        return bill;
    }

    public void setBill(double bill) {
        this.bill = bill;
    }

    @Override
    public String toString() {
        return "KhachHang{" +
                "customerID='" + customerID + '\'' +
                ", name='" + name + '\'' +
                ", billDate='" + billDate + '\'' +
                ", amount=" + amount +
                ", bill=" + bill +
                '}';
    }
}
