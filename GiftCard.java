public class GiftCard {

    private int giftCardId;
    private String giftCardName;
    private double amount;

    // Default Constructor
    public GiftCard() {
    }

    // Parameterized Constructor
    public GiftCard(int giftCardId, String giftCardName, double amount) {
        this.giftCardId = giftCardId;
        this.giftCardName = giftCardName;
        this.amount = amount;
    }

    // Getters
    public int getGiftCardId() {
        return giftCardId;
    }

    public String getGiftCardName() {
        return giftCardName;
    }

    public double getAmount() {
        return amount;
    }

    // Setters
    public void setGiftCardId(int giftCardId) {
        this.giftCardId = giftCardId;
    }

    public void setGiftCardName(String giftCardName) {
        this.giftCardName = giftCardName;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    // Display Gift Card Details
    public void display() {
        System.out.println("----------------------------");
        System.out.println("Gift Card ID   : " + giftCardId);
        System.out.println("Gift Card Name : " + giftCardName);
        System.out.println("Amount         : ₹" + amount);
    }
}