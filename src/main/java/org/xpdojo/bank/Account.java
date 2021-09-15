package org.xpdojo.bank;

public class Account {

    public Money balance;

    public Account () {
        balance = new Money();
    }

    public Account (Money money) {
        balance = money;
    }

    public void deposit (Money money) {
        balance = balance.add(money);
    }

    public boolean withdraw (Money money) {
        Money newBalance = balance.subtract(money);
        if (newBalance.isBelowZero())
            return false;
        balance = newBalance;
        return true;
    }
}
