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
        Account account = new Account(new Money(100));

        //assert (check)
        assertEquals(account.balance, new Money(100));
    }

    @Test
//	@Disabled
    public void depositAnAmountToIncreaseTheBalance() {
        // arrange
        Account account = new Account();

        // act (add money
        account.deposit(new Money(100));

        //assert (check)
        assertEquals(account.balance, new Money(100));

    }

    @Test
//	@Disabled
    public void withdrawAnAmountToDecreaseTheBalance() {
        // arrange
        Account account = new Account(new Money(100));

        // act (add money
        account.withdraw(new Money(60));

        //assert (check)
        assertEquals(account.balance, new Money(40));

    }

}
