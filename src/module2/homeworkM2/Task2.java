package module2.homeworkM2;

public class Task2 {
    public static void main(String[] args) {
        double balance = 100;
        double withdrawal = 10;

        System.out.println(withdraw(balance, withdrawal));
        System.out.println(withdraw(99, 100));
    }

    static String withdraw(double balance, double withdrawal) {
        double com = withdrawal * 0.05;
        double total = com + withdrawal;
        if (balance < total) {
            return "NO";
        } else {
            balance -= total;
            return "OK " + com + " bal: " + balance;
        }
    }
}
