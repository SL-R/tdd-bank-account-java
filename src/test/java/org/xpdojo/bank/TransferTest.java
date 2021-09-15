package org.xpdojo.bank;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TransferTest {

    @Test
//	@Disabled
    public void transferDepositFromOneAccountToAnother() {
        // arrange
        Account accountA = new Account( new Money (100));
        Account accountB = new Account(new Money(200));

        // act (add money
        Transfer.transfer(accountA, accountB, new Money(50));

        //assert (check)
        assertEquals(accountA.balance, new Money(50));
        assertEquals(accountB.balance, new Money(250));

    }


}
