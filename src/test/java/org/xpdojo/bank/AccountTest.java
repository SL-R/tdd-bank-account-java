package org.xpdojo.bank;

import static org.hamcrest.Matchers.is;
//import static org.junit.;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class AccountTest {

    @Test
//	@Disabled
    public void initAmount() {
        // arrange
        Account account = new Account(100);

        //assert (check)
        assertEquals(account.balance.intValue(), 100);
    }

    @Test
//	@Disabled
    public void depositAnAmountToIncreaseTheBalance() {
        // arrange
        Account account = new Account();

        // act (add money
        account.deposit(100);

        //assert (check)
        assertEquals(account.balance.intValue(), 100);

    }

    @Test
//	@Disabled
    public void withdrawAnAmountToDecreaseTheBalance() {
        // arrange
        Account account = new Account(100);

        // act (add money
        account.withdraw(60);

        //assert (check)
        assertEquals(account.balance.intValue(), 40);

    }

}
