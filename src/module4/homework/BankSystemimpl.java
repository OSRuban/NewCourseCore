package module4.homework;

public class BankSystemimpl implements BankSystem {
    @Override
    public void withdrawOfUser(User user, int amount) {
        double commission = amount * user.getBank().getCommission(amount);
        double summ = amount + commission;
        if (user.getBank().getLimitOfWithdraw() >= summ) {
            user.setBalance(user.getBalance() - summ);
        } else {
            System.out.println("Error");
        }
    }

    @Override
    public void fundUser(User user, int amount) {
        double commission = amount * user.getBank().getCommission(amount);
        double summ = amount + commission;
        if (commission <= user.getBank().getLimmitOfFunding()) {
            user.setBalance(amount + user.getBalance() - commission);
        }
    }

    @Override
    public void transferMoney(User fromUser, User toUser, int amount) {
        double commission = amount * fromUser.getBank().getCommission(amount);
        double summ = amount + commission;
        if (summ <= fromUser.getBank().getLimitOfWithdraw() && amount <= toUser.getBank().getLimmitOfFunding()) {
            fromUser.setBalance(fromUser.getBalance() - summ);
            toUser.setBalance(toUser.getBalance() + amount);
        } else {
            System.out.println("Error");
        }

    }


    @Override
    public void paySalary(User user) {
        user.setBalance(user.getBalance() + user.getSalary() - user.getSalary() *
                user.getBank().getCommission(user.getSalary()));

    }
}
