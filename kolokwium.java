public class Main {
    public static void main(String[] args) {
        System.out.println(najblizszySasiad(20));
        System.out.println(dokladnosc(4.0, 4.1, 0.001));
        System.out.println(pierwiastek(20, 2, 0.001));
        System.out.println(pierwiastek(20, 3, 0.001));
//        System.out.println("Podciag " + podciag(new int[]{5,4,3}));
//        System.out.println("Podciag z r " + podciag(new int[]{5,3,1}, 2));
//        System.out.println(czyPalindrom(121));
//        palindromLiczbowy(2);
    }

    // zad 1.
    public static boolean dokladnosc(double x, double y, double k) {
        return Math.abs(x-y) < k;
    }

    // zad 2.
    public static double najblizszySasiad(double S) {
        double min = S;
        for (int i = 1; i < S; i++) {
            double tmp = i * i;
            if ((tmp - S) < min ) {
                min = i;
            }
        }
        return min;
    }

    // Zad 3.
    public static double pierwiastek(double S, int n, double k) {
        double x = najblizszySasiad(S);
        double xSum = 0;
        double xPower = 1;
        for (int i = 0; i < n - 1; i++) {
            xSum += x;
            xPower *= x;
        }
        double xNext = (xSum + (S/xPower)) / n;
        while (!dokladnosc(xNext, x, k)) {
            x = xNext;
            xSum = 0;
            xPower = 1;
            for (int i = 0; i < n - 1; i++) {
                xSum += x;
                xPower *= x;
            }
            xNext = (xSum + (S/xPower)) / n;
        }

        return xNext;
    }

    // Zad 4.
    public static int podciag(int[] tab) {
        int n = 0;
        for (int j = 0; j < tab.length; j++) {
            int tmp = 1;
            for (int i = j + 1; i < tab.length; i++) {
                if (tab[i - 1] < tab[i]) {
                    break;
                }
                tmp++;
            }
            if (tmp > n) {
                n = tmp;
            }
        }
        return n;
    }


    // zad 5.
    public static int podciag(int[] tab, int r) {
        int n = 0;
        for (int j = 0; j < tab.length; j++) {
            int tmp = 1;
            for (int i = j + 1; i < tab.length; i++) {
                if (tab[i - 1] - tab[i] != r) {
                    break;
                }
                tmp++;
            }
            if (tmp > n) {
                n = tmp;
            }
        }
        return n;
    }

    // Zad 6.
    public static boolean czyPalindrom(int n) {
        int tmp = n;
        int r = 0;
        while (tmp / 10 != 0) {
            r += tmp % 10;
            r *= 10;
            tmp /= 10;
        }
        r += tmp % 10;
        return r == n;
    }

    // Zad7.
    public static void palindromLiczbowy(int m) {
        // 3 cyfrowe to od 100 do 999
        // 2 cyfrowe to od 10 do 99 m = 2 m - 1
        //


        for (int i = (int) Math.pow(10, m - 1); i < (int) Math.pow(10, m); i++) {
            for (int j = (int) Math.pow(10, m - 1); j < (int) Math.pow(10, m); j++) {

                if (czyPalindrom(i * j)) {
                    System.out.printf("%d x %d = %d\n", i, j, (i * j));
                }
            }
        }

    }
}