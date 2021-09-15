package org.xpdojo.bank;

public class Transfer {

    public static void transfer (Account accountA, Account accountB, int amount) {
        accountA.withdraw(amount);
        accountB.deposit (amount);
    }
}
