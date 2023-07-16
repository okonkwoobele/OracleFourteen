
package bankApp;

import java.math.BigDecimal;

public class Account{
    private BigDecimal balance= BigDecimal.ZERO;
    private final String pin;
    private int accountNumber;
    private String accountName;
    public Account(int accountNumber,String accountName,String accountPin){
        this.pin = accountPin;
    }
    public void deposit(BigDecimal amount){
        balance=balance.add(amount);
    }

    public BigDecimal getBalance(String pin ){
        if(!pin.equals(this.pin))throw new IllegalArgumentException("invalid Pin");
        return balance;
    }
    public void withdrawal(BigDecimal amount,String pin){
        if(balance.compareTo(amount)>-1){
            validate(pin);
            if(!pin.equals(this.pin)) throw new IllegalArgumentException("invalid pin");
            balance= balance.subtract(amount);
        }
    }
    public void validate(String pin){
        if(!pin.equals(this.pin))throw new IllegalArgumentException("invalid pin");
    }
    @Override
    public String toString(){
        return String.format("""
                =============================
                Account Name: %s
                Account Number: %s
                Account Balance: %s 
                ==============================
                """,accountName,accountNumber,balance.toPlainString());
    }

    public void Withdrawal(BigDecimal valueOf, String s) {
    }
}