import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Admin admin = new Admin();
        Customer customer = new Customer();

        while (true) {

            System.out.println("\n==================================");
            System.out.println(" Gift Card & Voucher Management ");
            System.out.println("==================================");
            System.out.println("1. Admin Login");
            System.out.println("2. Customer");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");

            int choice = sc.nextInt();

            switch (choice) {

                case 1:
                    admin.adminLogin(sc);
                    break;

                case 2:
                    customer.customerMenu(sc);
                    break;

                case 3:
                    System.out.println("Thank You!");
                    System.exit(0);

                default:
                    System.out.println("Invalid Choice!");
            }
        }
    }
}