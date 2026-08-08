import java.util.ArrayList;
import java.util.Scanner;

public class GiftCardManager {

    ArrayList<GiftCard> giftCards = new ArrayList<>();

    // Create Gift Card
    public void createGiftCard(Scanner sc) {

        System.out.print("Enter Gift Card ID: ");
        int id = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter Gift Card Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Amount: ");
        double amount = sc.nextDouble();

        GiftCard card = new GiftCard(id, name, amount);
        giftCards.add(card);

        System.out.println("Gift Card Created Successfully!");
    }

    // View All Gift Cards
    public void viewGiftCards() {

        if (giftCards.isEmpty()) {
            System.out.println("No Gift Cards Available.");
            return;
        }

        System.out.println("\n===== Gift Card List =====");

        for (GiftCard card : giftCards) {
            card.display();
        }
    }

    // Search Gift Card
    public void searchGiftCard(Scanner sc) {

        System.out.print("Enter Gift Card ID: ");
        int id = sc.nextInt();

        for (GiftCard card : giftCards) {
            if (card.getGiftCardId() == id) {
                System.out.println("Gift Card Found!");
                card.display();
                return;
            }
        }

        System.out.println("Gift Card Not Found.");
    }

    // Delete Gift Card
    public void deleteGiftCard(Scanner sc) {

        System.out.print("Enter Gift Card ID to Delete: ");
        int id = sc.nextInt();

        for (int i = 0; i < giftCards.size(); i++) {
            if (giftCards.get(i).getGiftCardId() == id) {
                giftCards.remove(i);
                System.out.println("Gift Card Deleted Successfully!");
                return;
            }
        }

        System.out.println("Gift Card Not Found.");
    }
}