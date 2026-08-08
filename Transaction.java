public class Transaction {

    private int transactionId;
    private String transactionType;

    // Constructor
    public Transaction(int transactionId, String transactionType) {
        this.transactionId = transactionId;
        this.transactionType = transactionType;
    }

    // Getters
    public int getTransactionId() {
        return transactionId;
    }

    public String getTransactionType() {
        return transactionType;
    }

    // Display Transaction
    public void display() {
        System.out.println("----------------------------");
        System.out.println("Transaction ID   : " + transactionId);
        System.out.println("Transaction Type : " + transactionType);
    }
}