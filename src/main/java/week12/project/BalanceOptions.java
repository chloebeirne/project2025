package week12.project;

public class BalanceOptions {

    public static Balance getBalance(String productCode) {


        Balance myBalance = null;
        if (productCode.equalsIgnoreCase("Revolut")) {
            myBalance = new Balance();
            myBalance.setBalance(57.86);

        } else if (productCode.equalsIgnoreCase("Bank of ireland")) {
            myBalance = new Balance();
            myBalance.setBalance(400.12);
        }

        return myBalance;

        return myBalance;
    }
}
}

