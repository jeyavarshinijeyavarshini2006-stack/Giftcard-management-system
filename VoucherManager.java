import java.util.ArrayList;
import java.util.Scanner;

public class VoucherManager {

    // Shared list of vouchers
    static ArrayList<Voucher> vouchers = new ArrayList<>();

    // Create Voucher
    public void createVoucher(Scanner sc) {

        System.out.print("Enter Voucher ID: ");
        int id = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter Voucher Code: ");
        String code = sc.nextLine();

        System.out.print("Enter Discount (%): ");
        double discount = sc.nextDouble();

        Voucher voucher = new Voucher(id, code, discount);
        vouchers.add(voucher);

        System.out.println("Voucher Created Successfully!");
    }

    // View All Vouchers
    public void viewVouchers() {

        if (vouchers.isEmpty()) {
            System.out.println("No Vouchers Available.");
            return;
        }

        System.out.println("\n===== Voucher List =====");

        for (Voucher voucher : vouchers) {
            voucher.display();
        }
    }

    // Redeem Voucher
    public void redeemVoucher(Scanner sc) {

        System.out.print("Enter Voucher Code: ");
        String code = sc.next();

        for (Voucher voucher : vouchers) {

            if (voucher.getVoucherCode().equalsIgnoreCase(code)) {

                if (!voucher.isRedeemed()) {
                    voucher.setRedeemed(true);
                    System.out.println("Voucher Redeemed Successfully!");
                    System.out.println("Discount: " + voucher.getDiscount() + "%");
                } else {
                    System.out.println("Voucher Already Redeemed.");
                }
                return;
            }
        }

        System.out.println("Invalid Voucher Code.");
    }

    // Delete Voucher
    public void deleteVoucher(Scanner sc) {

        System.out.print("Enter Voucher ID to Delete: ");
        int id = sc.nextInt();

        for (int i = 0; i < vouchers.size(); i++) {

            if (vouchers.get(i).getVoucherId() == id) {
                vouchers.remove(i);
                System.out.println("Voucher Deleted Successfully!");
                return;
            }
        }

        System.out.println("Voucher Not Found.");
    }
}