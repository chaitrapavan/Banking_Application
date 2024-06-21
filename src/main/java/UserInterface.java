
import java.util.Scanner;

public class UserInterface {

    private BankApp bankApp;
    private Scanner scanner;

    public UserInterface(BankApp bankApp, Scanner scanner) {
        this.bankApp = bankApp;
        this.scanner = scanner;
    }

    public void start() {
        System.out.println("How many number of customers do you want to enter?");
        int number = Integer.valueOf(scanner.nextLine());
        for (int i = 0; i < number; i++) {
            System.out.println("Enter Name:");
            String name = scanner.nextLine();
            System.out.println("Enter Account number:");
            int accNumber = Integer.valueOf(scanner.nextLine());
            System.out.println("Enter Account type:");
            String accType = scanner.nextLine();
            System.out.println("Enter Balance:");
            double balance = Double.valueOf(scanner.nextLine());
            this.bankApp.addDetails(name, accNumber, accType, balance);
        }

        System.out.println("---Banking Application---");
        System.out.println("1. Display all account details");
        System.out.println("2. Search by account number");
        System.out.println("3. Deposit the amount");
        System.out.println("4. Withdraw the amount");
        System.out.println("5. Exit");

        while (true) {
            System.out.print("Enter your choice:");
            int command = Integer.valueOf(scanner.nextLine());
            if (command == 5) {
                break;
            } else if (command == 1) {
                this.bankApp.printList();
            } else if (command == 2) {
                System.out.print("Enter account number, you want to search:");
                int accNumber = Integer.valueOf(scanner.nextLine());
                this.bankApp.searchByAccountNo(accNumber);
            } else if (command == 3) {
                System.out.print("Enter the account number, to which you want to deposit:");
                int accNumber = Integer.valueOf(scanner.nextLine());
                System.out.print("Enter the amount yuu want to deposit:");
                double amount = Double.valueOf(scanner.nextLine());
                this.bankApp.depositAmount(accNumber, amount);
            } else if (command == 4) {
                System.out.print("Enter the account number, from which you want to withdraw:");
                int accNumber = Integer.valueOf(scanner.nextLine());
                System.out.print("Enter the amount you want to withdraw:");
                double amount = Double.valueOf(scanner.nextLine());
                this.bankApp.withDrawAmount(accNumber, amount);
            }
        }
    }
}
