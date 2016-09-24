package module2.homeworkM2.task1;

public class Task1 {

    public int sum(int[] f) {
        int sum = 0;
        for (int i = 0; i < f.length; i++) {
            sum = sum + f[i];
        }
        return sum;
    }

    public int min(int[] b) {
        int min = b[0];
        for (int i = 0; i < b.length; i++) {
            if (b[i] < min) {
                min = b[i];
            }
        }
        return min;
    }

    public int max(int[] c) {
        int max = c[0];
        for (int i = 0; i < c.length; i++) {
            if (c[i] > max) {
                max = c[i];
            }
        }
        return max;
    }

    public int maxpositiv(int[] p) {
        int positivMax = p[0];
        for (int i = 0; i < p.length; i++) {
            if (p[i] > 0) {
                if (p[i] > positivMax) ;
                positivMax = p[i];
            }
        }
        return positivMax;
    }

    public int multiplication(int[] m) {
        int mult = 1;
        for (int i = 0; i < m.length; i++) {
            mult = mult * m[i];
        }
        return mult;
    }

    public int mod(int[] m) {
        int mod = m[0] % m[m.length - 1];
        return mod;
    }

    public int secondLargest(int[] s) {
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

    public double sum(double[] f) {
        double sum = 0;
        for (int i = 0; i < f.length; i++) {
            sum = sum + f[i];
        }
        return sum;
    }

    public double min(double[] q) {
        double min = q[0];
        for (int i = 0; i < q.length; i++) {
            if (q[i] < min) {
                min = q[i];
            }
        }
        return min;
    }

    public double max(double[] w) {
        double max = w[0];
        for (int i = 0; i < w.length; i++) {
            if (w[i] > max) {
                max = w[i];
            }
        }
        return max;
    }

    public double maxpositiv(double[] p) {
        double positivMax = p[0];
        for (int i = 0; i < p.length; i++) {
            if (p[i] > 0) {
                if (p[i] > positivMax) ;
                positivMax = p[i];
            }
        }
        return positivMax;
    }

    public double mod(double[] m) {
        double mod = m[0] % m[m.length - 1];
        return mod;
    }

    public double multiplication(double[] f) {
        int mult = 1;
        for (int i = 0; i < f.length; i++) {
            mult *= f[i];
        }
        return mult;
    }

    public double secondLargest(double[] arr) {
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
