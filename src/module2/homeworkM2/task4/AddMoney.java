package module2.homeworkM2.task4;

public class AddMoney {
    static int[] balances = {1200, 250, 2000, 500, 3200};
    static String[] ownerNames = {"Jane", "Ann", "Jack", "Oww", "Lane"};



    static String fund(String name, double funding) {
        int index = 0;
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


