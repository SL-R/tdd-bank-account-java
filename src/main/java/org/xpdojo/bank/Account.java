package org.xpdojo.bank;

public class Account {

    public Integer balance;

    public Account () {
        balance = 0;
    }

    public Account (int amount) {
        balance = amount;
    }

    public void deposit (int amount) {
        balance += amount;
    }

    public void withdraw (int amount) {
        balance -= amount;
    }
}
