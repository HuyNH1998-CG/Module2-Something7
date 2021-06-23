import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class QLKH {
    static ArrayList<KhachHang> list = new ArrayList<>();
    static Scanner input = new Scanner(System.in);

    public static final String changeID = "1";
    public static final String changeName = "2";
    public static final String changeBillDate = "3";
    public static final String changeAmount = "4";
    public static final String changeBill = "5";
    public static final String changeOther = "6";

    public static void add() {
        System.out.println("1. Add Vietnamese");
        System.out.println("2. Add Foreigner");
        String choice = input.nextLine();
        switch (choice) {
            case "1" -> list.add(addVietnamese());
            case "2" -> list.add(addForeigner());

        }
    }

    public static KhachHangVietNam addVietnamese() {
        String id = getCustomerID();
        String name = getCustomerName();
        String billDate = getBillDate();
        int amount = getAmount();
        int bill = getBill();
        int upperLimit = getUpperLimit();
        return new KhachHangVietNam(id, name, billDate, amount, bill, upperLimit);
    }

    public static KhachHangNuocNgoai addForeigner() {
        String id = getCustomerID();
        String name = getCustomerName();
        String billDate = getBillDate();
        int amount = getAmount();
        int bill = getBill();
        String nationality = getNationality();
        return new KhachHangNuocNgoai(id, name, billDate, amount, bill, nationality);
    }

    public static void editCustomer() {
        String id = getCustomerID();
        for (KhachHang K : list) {
            if (K.getCustomerID().equals(id)) {
                while (true) {
                    editChoices();
                    String choice = input.nextLine();
                    switch (choice) {
                        case changeID -> K.setCustomerID(getCustomerID());
                        case changeName -> K.setName(getCustomerName());
                        case changeBillDate -> K.setBillDate(getBillDate());
                        case changeAmount -> K.setAmount(getAmount());
                        case changeBill -> K.setBill(getBill());
                        case changeOther -> {
                            if (K instanceof KhachHangVietNam) {
                                ((KhachHangVietNam) K).setUpperLimit(getUpperLimit());
                            } else if (K instanceof KhachHangNuocNgoai) {
                                ((KhachHangNuocNgoai) K).setNationality(getNationality());
                            }
                        }
                        default -> {
                            return;
                        }
                    }
                }
            }
        }
    }

    public static void editChoices() {
        System.out.println("What to change?");
        System.out.println("1. ID");
        System.out.println("2. Name");
        System.out.println("3. Bill Date");
        System.out.println("4. Amount");
        System.out.println("5. Bill");
        System.out.println("6. Other");
    }

    public static void showAll() {
        for (KhachHang K : list) {
            System.out.println(K);
        }
    }

    public static void deleteCustomer() {
        String id = getCustomerID();
        for (KhachHang K : list) {
            if (K.getCustomerID().equals(id)) {
                list.remove(K);
                return;
            }
        }
    }

    public static void searchName() {
        String name = getCustomerName();
        for (KhachHang K : list) {
            if (K.getName().equals(name)) {
                if (K instanceof KhachHangVietNam k) {
                    System.out.println(k);
                } else if (K instanceof KhachHangNuocNgoai k) {
                    System.out.println(k);
                }
            }
        }
    }

    public static void searchCustomerByID() {
        IDSorter sorter = new IDSorter();
        list.sort(sorter);
        String id = getCustomerID();
        int index = Collections.binarySearch(list, new KhachHang(id, null, null), sorter);
        System.out.println(list.get(index));
    }


    public static void sortByID() {
        IDSorter sorter = new IDSorter();
        list.sort(sorter);
    }

    public static void getToCash() {
        String id = getCustomerID();
        for (KhachHang K : list) {
            if (K.getCustomerID().equals(id)) {
                if (K instanceof KhachHangVietNam k) {
                    toCash(k);
                } else if (K instanceof KhachHangNuocNgoai k) {
                    System.out.println("Khách hàng " + k.getName() + " Thành tiền: " + (k.getAmount() * k.getBill() + "VNĐ"));
                }
            }
        }
    }

    private static void toCash(KhachHangVietNam k) {
        if (k.getAmount() <= k.getUpperLimit()) {
            System.out.println("Khách hàng " + k.getName() + " Thành tiền: " + (k.getAmount() * k.getBill()) + "VNĐ");
        } else {
            System.out.println("Khách hàng " + k.getName() + " Thành tiền: " + (k.getAmount() * k.getBill() * k.getUpperLimit() + ((k.getAmount() - k.getUpperLimit()) * k.getBill() * 2.5)) + "VNĐ");
        }
    }

    private static String getNationality() {
        System.out.println("Quốc tịch");
        return input.nextLine();
    }

    private static int getUpperLimit() {
        System.out.println("Định mức");
        return Integer.parseInt(input.nextLine());
    }

    private static int getBill() {
        System.out.println("Đơn giá");
        return Integer.parseInt(input.nextLine());
    }

    private static int getAmount() {
        System.out.println("Số lượng");
        return Integer.parseInt(input.nextLine());
    }

    private static String getBillDate() {
        System.out.println("Ngày ra hóa đơn");
        return input.nextLine();
    }

    private static String getCustomerName() {
        System.out.println("Tên");
        return input.nextLine();
    }

    private static String getCustomerID() {
        System.out.println("Mã Khách Hàng");
        return input.nextLine();
    }
}
