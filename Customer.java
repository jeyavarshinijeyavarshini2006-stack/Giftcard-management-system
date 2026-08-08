import java.util.Scanner;

public class Customer {

    GiftCardManager giftManager = new GiftCardManager();
    VoucherManager voucherManager = new VoucherManager();
    TransactionManager transactionManager = new TransactionManager();

    public void customerMenu(Scanner sc) {

        int choice;

        do {

            System.out.println("\n====== CUSTOMER MENU ======");
            System.out.println("1. View Gift Cards");
            System.out.println("2. Redeem Voucher");
            System.out.println("3. View Transactions");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");

            choice = sc.nextInt();

            switch (choice) {

                case 1:
                    giftManager.viewGiftCards();
                    break;

                case 2:
                    voucherManager.redeemVoucher(sc);
                    transactionManager.addTransaction("Voucher Redeemed");
                    break;

                case 3:
                    transactionManager.viewTransactions();
                    break;

                case 4:
                    System.out.println("Thank You!");
                    break;

                default:
                    System.out.println("Invalid Choice!");
            }

        } while (choice != 4);
    }
}