package week12.project;

import java.util.Scanner;

public class CheckBalance {

    public static void main(String args[]) {
        // display a welcome message
        System.out.println("Welcome to the banking app");
        System.out.println();

        // perform 1 or more selections
        Scanner sc = new Scanner(System.in);
        String choice = "y";
        while (choice.equalsIgnoreCase("y")) {
            System.out.print("Enter bank code: ");
            String BankCode = sc.nextLine();


            Balance yourBalance = BalanceOptions.getBalance(BankCode);

            // display the output
            System.out.println();
            if (yourBalance != null) {
                System.out.println("your balance: " + yourBalance.toString());
                System.out.println("your balance: " + yourBalance.getBalanceFormatted());
            }

            // see if the user wants to continue
            System.out.print("Continue? (y/n): ");
            choice = sc.nextLine();
            System.out.println();
        }
        sc.close();
    }
}

