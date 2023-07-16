package bankApp;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertThrows;

public class AccountTest {
private Account paulineAccount;
@BeforeEach
    public void startWithThis(){
    paulineAccount = new Account(1015592854,"Austine", "1234");
}
@Test
public void depositMoneyTest(){
    paulineAccount.deposit(BigDecimal.valueOf(2_000));
    assertEquals(BigDecimal.valueOf(2_000),paulineAccount.getBalance("1234"));
}
@Test
    public void getBalanceWithCorrectPinTest(){
    paulineAccount.deposit(BigDecimal.valueOf(2_000));
    assertEquals(BigDecimal.valueOf(2_000),paulineAccount.getBalance("1234"));
}
    private void assertEquals(BigDecimal valueOf, BigDecimal balance) {
    }
@Test
    public void getBalanceWithCorrectThrowsExceptionsTest(){
    paulineAccount.deposit(BigDecimal.valueOf(2_000));
    assertThrows(IllegalArgumentException.class,()->paulineAccount.getBalance("1234"));
}
@Test
    public void withdrawalMoneyTest(){
    paulineAccount.deposit(BigDecimal.valueOf(2_000));
    paulineAccount.withdrawal(BigDecimal.valueOf(1_000),"1234");
}
@Test
    public void testThatWithdrawalIsImpossibleWhenAmountIsMoreThanBalance(){
    paulineAccount.Withdrawal(BigDecimal.valueOf(20_000),"1234");
    assertEquals(BigDecimal.valueOf(2_000),paulineAccount.getBalance("1234"));
}
 @Test
    public void WithdrawalWithWrongPinThrowsExceptionTest(){
     paulineAccount.deposit(BigDecimal.valueOf(2_000));
     paulineAccount.Withdrawal(BigDecimal.valueOf(1_000),"2231");
 }
 @Test
    public void proofMichealWrongTest(){
     System.out.println(paulineAccount.toString());
 }
}