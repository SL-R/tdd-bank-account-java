package org.xpdojo.bank;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MoneyTest {

    @Test
//	@Disabled
    public void zeroMoney() {
        // arrange
        Money money = new Money();

        //assert (check)
        assertEquals(money.amount, 0);

    }

    @Test
//	@Disabled
    public void createMoney() {
        // arrange
        Money money = new Money(100);

        //assert (check)
        assertEquals(money.amount, 100);

    }



    @Test
//	@Disabled
    public void createMoneyFromMoney() {
        // arrange
        Money moneyA = new Money(100);
        Money moneyB = new Money(moneyA);

        //assert (check)
        assertEquals(moneyB.amount, 100);

    }

    @Test
//	@Disabled
    public void AddMoney() {
        // arrange
        Money moneyA = new Money(100);
        Money moneyB = new Money(150);

        Money moneyC = moneyA.add(moneyB);
        //assert (check)
        assertEquals(moneyC.amount, 250);

    }


}
