
import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        BankApp bank = new BankApp();
        Scanner scanner = new Scanner(System.in);
        UserInterface ui = new UserInterface(bank, scanner);
        ui.start();
    }
}
