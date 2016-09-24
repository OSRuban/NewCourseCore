package module3.homeworkM3.task4;

public class Main {
    public static void main(String[] args) {
        User user = new User("Tonystark", 2500, 24, "Starkcompany", 250, "USD");
        user.setCompanyName("Starkcompany");
        System.out.println(user.companyNameLength(user.getCompanyName()));
        user.getMonthsOfEmployment();
        System.out.println(user.monthIncreaser(2));
    }
}
