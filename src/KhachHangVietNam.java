public class KhachHangVietNam extends KhachHang {
    private int upperLimit;

    public KhachHangVietNam(int upperLimit) {
        this.upperLimit = upperLimit;
    }

    public KhachHangVietNam(String customerID, String name, String billDate, int upperLimit) {
        super(customerID, name, billDate);
        this.upperLimit = upperLimit;
    }

    public KhachHangVietNam(String customerID, String name, String billDate, double amount, double bill, int upperLimit) {
        super(customerID, name, billDate, amount, bill);
        this.upperLimit = upperLimit;
    }

    public int getUpperLimit() {
        return upperLimit;
    }

    public void setUpperLimit(int upperLimit) {
        this.upperLimit = upperLimit;
    }

    @Override
    public String toString() {
        return "KhachHang{" +
                "customerID='" + getCustomerID() + '\'' +
                ", name='" + getName() + '\'' +
                ", billDate='" + getBillDate() + '\'' +
                "amount=" + getAmount() +
                ", bill=" + getBill() +
                ", upperLimit=" + getUpperLimit() +
                '}';
    }
}
