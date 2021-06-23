import java.util.Scanner;

public class Menu {
    static Scanner input = new Scanner(System.in);
    public static final String add = "1";
    public static final String edit = "2";
    public static final String remove = "3";
    public static final String searchName = "4";
    public static final String searchID = "5";
    public static final String sort = "6";
    public static final String getMoney = "7";
    public static final String show = "8";
    public static final String exit = "9";
    public static void menu(){
        while (true){
            welcome();
            String choice = input.nextLine();
            switch (choice){
                case add -> QLKH.add();
                case edit -> QLKH.editCustomer();
                case remove -> QLKH.deleteCustomer();
                case searchName -> QLKH.searchName();
                case searchID -> QLKH.searchCustomerByID();
                case sort -> QLKH.sortByID();
                case getMoney -> QLKH.getToCash();
                case show -> QLKH.showAll();
                case exit -> System.exit(0);
                default -> System.out.println("invalid command, re input");
            }
        }
    }
    private static void welcome() {
        System.out.println("Welcome to Electric Bill Management System");
        System.out.println("1. Add");
        System.out.println("2. Edit");
        System.out.println("3. Remove");
        System.out.println("4. Search by Name");
        System.out.println("5. Search By ID");
        System.out.println("6. Sort");
        System.out.println("7. Get Total Money");
        System.out.println("8. Show All Record");
        System.out.println("9. Exit");
    }
}
