import java.util.Scanner;

public class Admin {

    GiftCardManager giftManager = new GiftCardManager();
    VoucherManager voucherManager = new VoucherManager();

    public void adminLogin(Scanner sc) {

        System.out.print("Enter Admin Username: ");
        String username = sc.next();

        System.out.print("Enter Admin Password: ");
        String password = sc.next();

        if (username.equals("admin") && password.equals("admin123")) {

            System.out.println("\nLogin Successful!");

            int choice;

            do {
                System.out.println("\n====== ADMIN MENU ======");
                System.out.println("1. Create Gift Card");
                System.out.println("2. View Gift Cards");
                System.out.println("3. Create Voucher");
                System.out.println("4. View Vouchers");
                System.out.println("5. Logout");
                System.out.print("Enter your choice: ");

                choice = sc.nextInt();

                switch (choice) {

                    case 1:
                        giftManager.createGiftCard(sc);
                        break;

                    case 2:
                        giftManager.viewGiftCards();
                        break;

                    case 3:
                        voucherManager.createVoucher(sc);
                        break;

                    case 4:
                        voucherManager.viewVouchers();
                        break;

                    case 5:
                        System.out.println("Logged Out Successfully.");
                        break;

                    default:
                        System.out.println("Invalid Choice!");
                }

            } while (choice != 5);

        } else {
            System.out.println("Invalid Username or Password!");
        }
    }
}