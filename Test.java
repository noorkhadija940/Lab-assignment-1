import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Person owner = new Person("Khadija Noor", "03237763062");
        Address address = new Address("Askari", "Lahore", "54000");
        PharmacyShop pharmacyShop = new PharmacyShop(owner, address);

        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("Menu");
            System.out.println("1. Display menu");
            System.out.println("2. Search medicine");
            System.out.println("3. Sell");
            System.out.println("4. Update");
            System.out.println("5. Display total revenue");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    pharmacyShop.displayAllMedicines();
                    break;
                case 2:
                    System.out.print("Search by medicine ID");
                    String searchId = scanner.nextLine();
                    pharmacyShop.searchMedicine(searchId);
                    break;
                case 3:
                    System.out.print("Sell by ID");
                    String sellId = scanner.nextLine();
                    System.out.print("Quanity to sell:");
                    int quantitySold = scanner.nextInt();
                    pharmacyShop.sellMedicine(sellId, quantitySold);
                    break;

                case 4:
                    System.out.print("Enter Medicine ID to update: ");
                    String updateId = scanner.nextLine();
                    System.out.print("Enter new quantity: ");
                    int newQuantity = scanner.nextInt();
                    System.out.print("Enter new price: ");
                    double newPrice = scanner.nextDouble();
                    pharmacyShop.updateMedicine(updateId, newQuantity, newPrice);
                    break;

                case 5:
                    pharmacyShop.printTotalProfit();
                    break;
                case 6:
                    System.out.println("Exit");
                    break;
                default:
                    System.out.println("Invalid");
            }
        } while (choice != 7);

        scanner.close();
    }
}
