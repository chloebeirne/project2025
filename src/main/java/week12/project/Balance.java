package week12.project;

import java.text.NumberFormat;

public class Balance {

    private double Balance;
    private Double Balance;
    String Code;


    @@ -22,19 +22,17 @@
            return Code;
}



public void setBalance(double price) {
    this.Balance = Balance;
}

public double getBalance() {
    return Balance;
}

public String getBalanceFormatted() {
    NumberFormat currency = NumberFormat.getCurrencyInstance();
    return currency.format(Balance);
}
}

