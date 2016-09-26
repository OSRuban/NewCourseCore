package module4.homework;


public class ChinaBank extends Bank {
    public ChinaBank(long id, String bankCountry, Currency currency, int numberOfEmployee, double avrSalaryOfEmployee, long rating, long totalCapital) {
        super(id, bankCountry, currency, numberOfEmployee, avrSalaryOfEmployee, rating, totalCapital);
    }

    @Override
    int getLimitOfWithdraw() {
        int limit = 0;
        if (getCurrency() == (Currency.USD)) {
            limit = 100;
        }
        if (getCurrency() == (Currency.EUR)) {
            limit = 150;
        }
        return limit;
    }

    @Override
    int getLimmitOfFunding() {
        int limit = 0;
        if (getCurrency() == (Currency.EUR)) {
            limit = 5000;
        }
        if (getCurrency() == Currency.USD) {
            limit = 10000;
        }
        return limit;
    }

    @Override
    double getMonthyRate() {
        double monthlyRate = 0;
        if (getCurrency() == (Currency.USD)) monthlyRate = 0.01;
        return monthlyRate;
    }

    @Override
    double getCommission(int summ) {
        double commission = 0;
        if (getCurrency() == (Currency.USD) && summ <= 1000) {
            commission = 0.03;
        } else commission = 0.05;
        if (getCurrency() == Currency.EUR && summ <= 1000) {
            commission = 0.1;
        } else commission = 0.11;
        return commission;
    }
}
