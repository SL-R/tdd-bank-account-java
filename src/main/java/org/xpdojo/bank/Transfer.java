package org.xpdojo.bank;

public class Transfer {

    public static void transfer (Account accountA, Account accountB, Money money) {
        accountA.withdraw(money);
        accountB.deposit (money);
    }
}
