public class KhachHangNuocNgoai extends KhachHang{
    private String nationality;

    public KhachHangNuocNgoai(String nationality) {
        this.nationality = nationality;
    }

    public KhachHangNuocNgoai(String customerID, String name, String billDate, String nationality) {
        super(customerID, name, billDate);
        this.nationality = nationality;
    }

    public KhachHangNuocNgoai(String customerID, String name, String billDate, double amount, double bill, String nationality) {
        super(customerID, name, billDate, amount, bill);
        this.nationality = nationality;
    }

    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    @Override
    public String toString() {
        return "KhachHang{" +
                "customerID='" + getCustomerID() + '\'' +
                ", name='" + getName() + '\'' +
                ", billDate='" + getBillDate() + '\'' +
                "nationality='" + getNationality() + '\'' +
                ", amount=" + getAmount() +
                ", bill=" + getBill() +
                '}';
    }
}
