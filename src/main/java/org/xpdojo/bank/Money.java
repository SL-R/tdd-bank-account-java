package org.xpdojo.bank;

/**
 * Immutable class to represent Money as a concept.
 * This class should have no accessor methods.
 */
public class Money {

    int amount;

    public Money () {
        amount = 0;
    }

    public Money (int amount) {
        this.amount = amount;
    }

    public Money (Money money) {
        amount = money.amount;
    }

    public Money add (Money money) {
        return new Money(amount + money.amount);
    }

    public Money subtract (Money money) {
        return new Money(amount - money.amount);
    }

    @Override
    public boolean equals(Object obj) {
        return (obj != null) && (obj instanceof Money) && (amount == ((Money)obj).amount);
    }
}
