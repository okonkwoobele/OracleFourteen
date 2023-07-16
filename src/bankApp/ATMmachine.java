package bankApp;

import java.util.Scanner;

public class ATMmachine {
    private static Scanner keyboardInputCollector =new Scanner(System.in);
    private static Bank gtbank = new Bank();

    public static void main(String[] args) {
        String mainMenu= """
                ===============================
                welcome to GTB Bank
                1 -> Create Account 
                2 -> Deposit
                3 ->Withdraw
                4 ->Transfer
                5 ->Check Balance 
                6 ->Exit""";

    }
}
