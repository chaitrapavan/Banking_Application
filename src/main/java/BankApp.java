
import java.util.ArrayList;

public class BankApp {

    private ArrayList<Bank> list;

    public BankApp() {
        this.list = new ArrayList<>();
    }

    public void addDetails(String name, int accNum, String accType, double balance) {
        this.list.add(new Bank(name, accNum, accType, balance));
    }

    public void printList() {
        for (Bank bank : this.list) {
            System.out.println(bank);
        }
    }

    public void searchByAccountNo(int number) {
        for (Bank bank : this.list) {
            if (bank.getAccountNumber() == number) {
                System.out.println(bank);
            } else {
                System.out.println("Account is not exist");
            }
        }
    }

    public void depositAmount(int accNum, double amount) {
        double balance = 0;
        for (Bank bank : this.list) {
            if (bank.getAccountNumber() == accNum) {
                balance = bank.getBalance();
                if (amount > 0) {
                    balance = balance + amount;
                } else {
                    System.out.println("Invalid amount");
                }
            }
            bank.setBalance(balance);
            System.out.println(bank);
        }
    }

    public void withDrawAmount(int accNum, double amount) {
        double balance = 0;
        for (Bank bank : this.list) {
            if (bank.getAccountNumber() == accNum) {
                balance = bank.getBalance();
                if (balance > 0) {
                    balance = balance - amount;
                    if (balance < 0) {
                        balance = balance + amount;
                        System.out.println("Not enough balance in your account");
                    }
                }

            }

            bank.setBalance(balance);
            System.out.println(bank);
        }
    }
}
