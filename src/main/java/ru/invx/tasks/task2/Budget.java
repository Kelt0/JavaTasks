package ru.invx.tasks.task2;

import java.math.BigDecimal;
import java.util.Objects;


public class Budget implements Comparable<Budget>{
    Float amount;
    Currency currency;

    @Override
    public int compareTo(Budget o) {
        // Сравнивать будем по рублям
        if(currency == Currency.USD){
            amount *= 90F;
        }

        return this.amount.compareTo(o.amount);
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Budget budget = (Budget) o;
        return Objects.equals(amount, budget.amount);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(amount);
    }
}

