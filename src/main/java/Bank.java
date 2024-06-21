
public class Bank {

    private String name;
    private int accountNumber;
    private String accountType;
    private double balance;

    public Bank(String name, int accountNumber, String accountType, double balance) {
        this.name = name;
        this.accountNumber = accountNumber;
        this.accountType = accountType;
        this.balance = balance;
    }

    public String getName() {
        return this.name;
    }

    public int getAccountNumber() {
        return this.accountNumber;
    }

    public String getAccountType() {
        return this.accountType;
    }

    public double getBalance() {
        return this.balance;
    }
    public void setBalance(double balance){
        this.balance = balance;
    }
  @Override
  public String toString(){
      return "name of Account holder: " + this.name + "\n" + "Account Number: " + this.accountNumber + "\n" + "Account Type: " + this.accountType + "\n" + "Balance: " + this.balance + "\n"; }
}
