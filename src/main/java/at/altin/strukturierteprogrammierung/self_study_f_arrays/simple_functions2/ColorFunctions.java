package at.altin.strukturierteprogrammierung.self_study_f_arrays.simple_functions2;

import java.util.Scanner;

public class ColorFunctions {
    public static void welcome() {
        System.out.printf("Welcome to ColorFunctions!\n");
    }

    public static void good_bye() {
        System.out.printf("Exiting ColorFunctions!\n");
    }

    public static int read_rgb() {
        System.out.printf("red");
        int r = read_channel();
        System.out.printf("green");
        int g = read_channel();
        System.out.printf("blue");
        int b = read_channel();
        return encode(r, g, b);
    }

    public static int read_channel() {
        int v = -1;
        do {
            System.out.printf(": ");
            v = sc.nextInt();
        } while (v < 0 || v > 255);
        return v;
    }

    public static int encode(int a, int b, int c) {
        return ((a * 1000 + b) * 1000) + c;
    }

    public static void print_rgb(int rgb) {
        System.out.printf("R%03d G%03d B%03d\n", red(rgb), green(rgb), blue(rgb));

    }

    public static int red(int rgb) {
        return rgb / 1000000;
    }

    public static int green(int rgb) {
        return rgb / 1000 % 1000;
    }

    public static int blue(int rgb) {
        return rgb % 1000;
    }

    public static int rgb_2_cmy(int rgb) {
        int c = 255 - red(rgb), m = 255 - green(rgb), y = 255 - blue(rgb);
        return encode(c, m, y);
    }

    public static int min(int a, int b, int c) {
        if (a <= b && a <= c)
            return a;
        if (b <= a && b <= c)
            return b;
        return c;

    }


    public static void print_cmy(int cmy) {
        System.out.printf("C%03d M%03d Y%03d\n", cyan(cmy), magenta(cmy), yellow(cmy));

    }

    public static int cyan(int cmy) {
        return cmy / 1000000;
    }

    public static int magenta(int cmy) {
        return cmy / 1000 % 1000;
    }

    public static int yellow(int cmy) {
        return cmy % 1000;
    }



    public static void convert() {

        welcome();
        int rgb = read_rgb();
        print_rgb(rgb);
        int cmy = rgb_2_cmy(rgb);
        print_cmy(cmy);
        good_bye();
    }


    /*------------ DO NOT TOUCH ----------------*/
    static Scanner sc;

    public static void main(String[] args) {
        sc = new Scanner(System.in);
        Test[] tests = { new Test() {
            @Override
            protected void exec() {
                welcome();

            }

        }, new Test() {
            @Override
            protected void exec() {
                good_bye();

            }

        }, new Test() {
            @Override
            protected void exec() {
                System.out.printf("%d\n", read_channel());
            }

        }, new Test() {
            @Override
            protected void exec() {
                int a, b, c;
                a = sc.nextInt();
                b = sc.nextInt();
                c = sc.nextInt();
                System.out.printf("%d\n", encode(a, b, c));

            }

        }, new Test() {
            @Override
            protected void exec() {
                System.out.printf("%d\n", read_rgb());
            }

        }, new Test() {
            @Override
            protected void exec() {
                int a;
                a = sc.nextInt();
                System.out.printf("%d\n", red(a));

            }

        }, new Test() {
            @Override
            protected void exec() {
                int a;
                a = sc.nextInt();
                System.out.printf("%d\n", green(a));

            }

        }, new Test() {
            @Override
            protected void exec() {
                int a;
                a = sc.nextInt();
                System.out.printf("%d\n", blue(a));

            }

        }, new Test() {
            @Override
            protected void exec() {
                int a;
                a = sc.nextInt();
                print_rgb(a);

            }

        }, new Test() {
            @Override
            protected void exec() {
                int a;
                a = sc.nextInt();
                System.out.printf("%d\n", rgb_2_cmy(a));

            }

        }, new Test() {
            @Override
            protected void exec() {
                int a;
                a = sc.nextInt();
                System.out.printf("%d\n", cyan(a));

            }

        }, new Test() {
            @Override
            protected void exec() {
                int a;
                a = sc.nextInt();
                System.out.printf("%d\n", magenta(a));

            }

        }, new Test() {
            @Override
            protected void exec() {
                int a;
                a = sc.nextInt();
                System.out.printf("%d\n", yellow(a));
            }

        }, new Test() {
            @Override
            protected void exec() {
                int a;
                a = sc.nextInt();
                print_cmy(a);

            }

        }, new Test() {
            @Override
            protected void exec() {
                convert();

            }

        }

        };
        System.out.printf("Test#: ");
        int n = sc.nextInt();
        if (n < 1 || n > tests.length + 1) {
            System.out.println("unknown test.");
            return;
        }
        tests[n - 1].run();
        sc.close();
    }

    private abstract static class Test {
        protected abstract void exec();

        void run() {
            System.out.printf("executing %s\n", this.getClass().getSimpleName());
            exec();
        }
    }
}
