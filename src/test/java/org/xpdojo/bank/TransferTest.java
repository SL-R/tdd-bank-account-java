package org.xpdojo.bank;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TransferTest {

    @Test
//	@Disabled
    public void transferDepositFromOneAccountToAnother() {
        // arrange
        Account accountA = new Account(100);
        Account accountB = new Account(200);

        // act (add money
        Transfer.transfer(accountA, accountB, 50);

        //assert (check)
        assertEquals(accountA.balance.intValue(), 50);
        assertEquals(accountB.balance.intValue(), 250);

    }


}
