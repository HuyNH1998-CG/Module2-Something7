import java.util.Comparator;

public class IDSorter implements Comparator<KhachHang> {
    @Override
    public int compare(KhachHang o1, KhachHang o2) {
        return o1.getCustomerID().compareTo(o2.getCustomerID());
    }
}
