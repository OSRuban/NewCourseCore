package module2.homeworkM2.task2;

public class Withdraw {

    static String withdraw(double balance, double withdrawal) {

        double commission = withdrawal * 0.05;
        double total = commission + withdrawal;

        if (balance < total) {
            return "NO";
        } else {
            balance -= total;
            return "OK " + commission + "  " + balance;
        }
    }
}
