package ru.invx.tasks.task2;

public enum Currency {
    RUB(1),
    USD(90);

    private int rate;
    Currency(int rate) {
        this.rate = rate;
    }

    public int getRate() {
        return rate;
    }
}
