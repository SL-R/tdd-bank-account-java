package org.xpdojo.bank;

public class Transfer {

    public static boolean transfer (Account accountA, Account accountB, Money money) {
        if (accountA.withdraw(money)) {
            accountB.deposit (money);
            return true;
        }
        return false;
    }
}
