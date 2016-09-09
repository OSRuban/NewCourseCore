package module2.homeworkM2;

public class Task1 {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        double[] array1 = {1.2, 4.8, 4.7, 0.3, 1.8, 2.6, 2.4, 3.8, 4.5, 2.2};

        System.out.println(sum(array));
        System.out.println(min(array));
        System.out.println(max(array));
        System.out.println(maxpositiv(array));
        System.out.println(multiplication(array));
        System.out.println(mod(array));
        System.out.println(secondLargest(array));

        System.out.println(sum(array1));
        System.out.println(min(array1));
        System.out.println(max(array1));
        System.out.println(maxpositiv(array1));
        System.out.println(multiplication(array1));
        System.out.println(mod(array1));
        System.out.println(secondLargest(array1));


    }

    static int sum(int[] f) {
        int sum = 0;
        for (int i = 0; i < f.length; i++) {
            sum = sum + f[i];
        }
        return sum;
    }

    static int min(int[] b) {
        int min = b[0];
        for (int i = 0; i < b.length; i++) {
            if (b[i] < min) {
                min = b[i];
            }
        }
        return min;
    }

    static int max(int[] c) {
        int max = c[0];
        for (int i = 0; i < c.length; i++) {
            if (c[i] > max) {
                max = c[i];
            }
        }
        return max;
    }

    static int maxpositiv(int[] p) {
        int positivMax = p[0];
        for (int i = 0; i < p.length; i++) {
            if (p[i] > 0) {
                if (p[i] > positivMax) ;
                positivMax = p[i];
            }
        }
        return positivMax;
    }

    static int multiplication(int[] m) {
        int mult = 1;
        for (int i = 0; i < m.length; i++) {
            mult = mult * m[i];
        }
        return mult;
    }

    static int mod(int[] m) {
        int mod = m[0] % m[m.length - 1];
        return mod;
    }

    static int secondLargest(int[] s) {
        int secondLargest = 0;
        int max = s[0];
        for (int i = 0; i < s.length; i++) {
            if (s[i] > max) {
                secondLargest = max;
                max = s[i];
            }
        }
        return secondLargest;
    }

    static double sum(double[] f) {
        double sum = 0;
        for (int i = 0; i < f.length; i++) {
            sum = sum + f[i];
        }
        return sum;
    }

    static double min(double[] q) {
        double min = q[0];
        for (int i = 0; i < q.length; i++) {
            if (q[i] < min) {
                min = q[i];
            }
        }
        return min;
    }

    static double max(double[] w) {
        double max = w[0];
        for (int i = 0; i < w.length; i++) {
            if (w[i] > max) {
                max = w[i];
            }
        }
        return max;
    }

    static double maxpositiv(double[] p) {
        double positivMax = p[0];
        for (int i = 0; i < p.length; i++) {
            if (p[i] > 0) {
                if (p[i] > positivMax) ;
                positivMax = p[i];
            }
        }
        return positivMax;
    }

    static double mod(double[] m) {
        double mod = m[0] % m[m.length - 1];
        return mod;
    }

    static double multiplication(double[] f) {
        int mult = 1;
        for (int i = 0; i < f.length; i++) {
            mult *= f[i];
        }
        return mult;
    }

    static double secondLargest(double[] arr) {
        double max = arr[0];
        double secondLargest = 0;
        for (int i = 0; i < arr.length; i++) {
            if (max < arr[i]) {
                secondLargest = max;
                max = arr[i];
            }
        }
        return secondLargest;

    }
}
