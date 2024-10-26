package at.altin.strukturierteprogrammierung.review_class9;

public class ArrayDemo {
    public static void main(String[] args) {
        double[] d = {0, 1, 45, 98};
        print(d);
        double[] v = foo2(d);
        print(d);
        v[2] = -5;
        print(v);

        int max = Integer.MAX_VALUE;
    }

    private static void print(double[] d) {
        for(double e : d) {
            System.out.printf("%02.0f ", e);
        }
        System.out.println();
    }

    private static double[] foo(double[] a) {
        double[] d = new double[a.length];
        for(int i=0; i < d.length; i++) {
            d[i] = a[i];
        }
        d[0] = -1;
        return d;
    }

    private static double[] foo2(double[] a) {
        a[0] = -1;
        return a;
    }
}
