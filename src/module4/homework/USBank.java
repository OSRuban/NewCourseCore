package module4.homework;

public class USBank extends Bank {
    public USBank(long id, String bankCountry, Currency currency, int numberOfEmployee, double avrSalaryOfEmployee, long rating, long totalCapital) {
        super(id, bankCountry, currency, numberOfEmployee, avrSalaryOfEmployee, rating, totalCapital);
    }

    @Override
    int getLimitOfWithdraw() {
        int limit = 0;
        if (getCurrency() == (Currency.USD)) {
            limit = 1000;
        }
        if (getCurrency() == (Currency.EUR)) {
            limit = 1200;
        }
        return limit;
    }

    @Override
    int getLimmitOfFunding() {
        int limit = 0;
        if (getCurrency() == (Currency.EUR)) {
            limit = 10000;
        }
        return limit;
    }

    @Override
    double getMonthyRate() {
        double monthlyRate = 0;
        if (getCurrency() == (Currency.USD)) monthlyRate = 0.01;
        if (getCurrency() == (Currency.EUR)) monthlyRate = 0.02;
        return monthlyRate;
    }

    @Override
    double getCommission(int summ) {
        double commission = 0;
        if (getCurrency() == (Currency.USD) && summ <= 1000) {
            commission = 0.05;
        } else commission = 0.07;
        if (getCurrency() == Currency.EUR && summ <= 1000) {
            commission = 0.06;
        } else commission = 0.08;
        return commission;
    }
}
