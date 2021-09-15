package org.xpdojo.bank;

import static org.hamcrest.Matchers.is;
//import static org.junit.;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class AccountTest {

    @Test
//	@Disabled
    public void depositAnAmountToIncreaseTheBalance() {
        // assertThat("your first test").isBlank();

        // arrange
        Account account = new Account();

        // act (add money
        account.deposit(100);

        //assert (check)
        assertEquals(account.balance.intValue(), 100);

    }
}
