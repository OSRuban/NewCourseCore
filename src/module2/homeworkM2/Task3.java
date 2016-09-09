package module2.homeworkM2;

public class Task3 {
    static int[] balances = {1200, 250, 2000, 500, 3200};
    static String[] ownerNames = {"Jane", "Ann", "Jack", "Oww", "Lane"};

    public static void main(String[] args) {
        System.out.println( withdraw("Ann", 100));
        System.out.println( withdraw("Oww",490));
    }

    static String withdraw(String name, double withdrawal) {
        int index = -1;
        for (int k = 0; k < ownerNames.length; k++) {
            if (ownerNames[k].equals(name)) {
                index = k;
                break;
            }
        }
        double com = withdrawal * 0.05;
        double balance = balances[index];
        double total = com + withdrawal;
        if (balance < total) {
            return name + " NO";
        } else {
            balances[index] -= total;
            return  name + " " + withdrawal + " " + balances[index];
        }
    }
}



