public class Voucher {

    private int voucherId;
    private String voucherCode;
    private double discount;
    private boolean redeemed;

    // Default Constructor
    public Voucher() {
    }

    // Parameterized Constructor
    public Voucher(int voucherId, String voucherCode, double discount) {
        this.voucherId = voucherId;
        this.voucherCode = voucherCode;
        this.discount = discount;
        this.redeemed = false;
    }

    // Getters
    public int getVoucherId() {
        return voucherId;
    }

    public String getVoucherCode() {
        return voucherCode;
    }

    public double getDiscount() {
        return discount;
    }

    public boolean isRedeemed() {
        return redeemed;
    }

    // Setters
    public void setVoucherId(int voucherId) {
        this.voucherId = voucherId;
    }

    public void setVoucherCode(String voucherCode) {
        this.voucherCode = voucherCode;
    }

    public void setDiscount(double discount) {
        this.discount = discount;
    }

    public void setRedeemed(boolean redeemed) {
        this.redeemed = redeemed;
    }

    // Display Voucher Details
    public void display() {
        System.out.println("----------------------------");
        System.out.println("Voucher ID   : " + voucherId);
        System.out.println("Voucher Code : " + voucherCode);
        System.out.println("Discount     : " + discount + "%");
        System.out.println("Status       : " + (redeemed ? "Redeemed" : "Available"));
    }
}