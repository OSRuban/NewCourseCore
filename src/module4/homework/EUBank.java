package module4.homework;

import java.util.*;

public class EUBank extends Bank {
    public EUBank(long id, String bankCountry, Currency currency, int numberOfEmployee, double avrSalaryOfEmployee, long rating, long totalCapital) {
        super(id, bankCountry, currency, numberOfEmployee, avrSalaryOfEmployee, rating, totalCapital);
    }

    @Override
    int getLimitOfWithdraw() {
        int limit = 0;
        if (getCurrency() == (Currency.USD)) {
            limit = 2000;
        }
        if (getCurrency() == (Currency.EUR)) {
            limit = 2200;
        }
        return limit;
    }

    @Override
    int getLimmitOfFunding() {
        int limit = 0;
        if (getCurrency() == (Currency.EUR)) {
            limit = 20000;
        }
        if (getCurrency() == Currency.USD) {
            limit = 10000;
        }
        return limit;
    }

    @Override
    double getMonthyRate() {
        double monthlyRate = 0;
        if (getCurrency() == (Currency.EUR)) monthlyRate = 0.01;
        return monthlyRate;
    }

    @Override
    double getCommission(int summ) {
        double commission = 0;
        if (getCurrency() == (Currency.USD) && summ <= 1000) {
            commission = 0.05;
        } else commission = 0.07;
        if (getCurrency() == Currency.EUR && summ <= 1000) {
            commission = 0.02;
        } else commission = 0.04;
        return commission;
    }

}
