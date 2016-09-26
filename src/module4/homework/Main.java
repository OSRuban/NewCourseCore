package module4.homework;

public class Main {
    public static void main(String[] args) {

        Bank usBank = new USBank(11122L, "GB", Currency.EUR, 180, 6000, 13, 7890000000L);
        Bank euBank = new EUBank(11122L, "SE", Currency.EUR, 90, 8000, 9, 9870000000L);
        Bank chinaBank = new ChinaBank(11122L, "CN", Currency.USD, 260, 5000, 15, 7770000000L);

        User user1 = new User(5500L, "GeorgeWashington", 1000000, 16, "President", 2000, usBank);
        User user2 = new User(5500L, "AbrahamLincoln", 2000000, 16, "President1", 2000, usBank);

        User user3 = new User(5500L, "JohnKennedy", 3000000, 17, "President2", 3000, euBank);
        User user4 = new User(5500L, "FranklinRoosevelt", 4000000, 17, "President3", 4000, euBank);

        User user5 = new User(5500L, "RonaldReagan", 5000000, 18, "President4", 5000, chinaBank);
        User user6 = new User(5500L, "BarackObama", 6000000, 18, "President5", 6000, chinaBank);

        BankSystem bankSystem = new BankSystemimpl();

        bankSystem.withdrawOfUser(user1, 200);
        System.out.println(user1);

        bankSystem.fundUser(user5, 500);
        System.out.println(user5);

        bankSystem.transferMoney(user3, user4, 1000);
        System.out.println(user3);
        System.out.println(user4);

        bankSystem.transferMoney(user1, user2, 9000);
        System.out.println(user1);
        System.out.println(user2);

        bankSystem.paySalary(user6);
        System.out.println(user6);

        bankSystem.transferMoney(user1, user6, 2000);
        System.out.println(user1);
        System.out.println(user6);

        bankSystem.transferMoney(user3, user4, 1000);
        System.out.println(user3);
        System.out.println(user4);

        bankSystem.transferMoney(user2, user5, 2500);
        System.out.println(user2);
        System.out.println(user5);

        System.out.println(usBank.moneyPaidMonthlyForSalary());
    }
}
