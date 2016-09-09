package module2.homeworkM2;

public class Task4 {
    static int[] balances = {1200, 250, 2000, 500, 3200};
    static String[] ownerNames = {"Jane", "Ann", "Jack", "Oww", "Lane"};

    public static void main(String[] args) {
        String ownerName = "Oww";
        double withdrawal = 100;

        System.out.println(fund(ownerName, withdrawal));
    }

    static String fund(String name, double funding) {
        int index = -1;
        for (int k = 0; k < ownerNames.length; k++) {
            if (ownerNames[k].equals(name)) {
                index = k;
                break;
            }
        }

        double balance = balances[index];

        balances[index] += funding;
        return name + " " + balances[index];

    }
}



