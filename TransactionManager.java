import java.util.ArrayList;

public class TransactionManager {

    static ArrayList<Transaction> transactions = new ArrayList<>();
    static int transactionCounter = 1;

    // Add Transaction
    public void addTransaction(String type) {

        Transaction transaction =
                new Transaction(transactionCounter++, type);

        transactions.add(transaction);
    }

    // View Transactions
    public void viewTransactions() {

        if (transactions.isEmpty()) {
            System.out.println("No Transactions Available.");
            return;
        }

        System.out.println("\n===== TRANSACTION HISTORY =====");

        for (Transaction transaction : transactions) {
            transaction.display();
        }
    }
}