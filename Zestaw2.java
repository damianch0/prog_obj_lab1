package pl.damian;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Zestaw2 {
    public static void main(String[] args) {
// Zad 1
//        23.0 + 76 // double
//        41*2.0+3 // double
//        5-33 // int
//        109%3 // int
//        50/2 // int
//        4|2 // int
//        3^5 // int
//        7&9 // int

// zad 2
        zad2();
// zad 3
        Scanner scanner = new Scanner(System.in);
        zad3(scanner);
// zad 4
        zad4(scanner);
//zad 5
        zad5(scanner);
    }

    private static void zad2() {
        int w1 = (int) ((Math.sqrt(7) - 1.0) / 3.0) + ((int) Math.pow(3, 3)) % 3;
        System.out.println(w1);
        int w2 = 1994 / (16 * 12);
        System.out.println(w2);
        int w3 = (int) ((3 + Math.sqrt(3)) / ((Math.sqrt(5) / 2) / 3));
        System.out.println(w3);
        int a = 17, b = 2, c = 3;
        int w4 = a % b % c;
        System.out.println(w4);
        String imie = "Damian", nazwisko = "Chyliński";
        int w5 = (int) ((imie.length() % nazwisko.length() + 1) / Math.pow(2, 1.0 / 4.0));
        System.out.println(w5);
    }

    private static void zad3(Scanner scanner) {
        String first = scanner.next();
        String second = scanner.next();
        System.out.printf("%s %s\n", first, second);
    }

    private static void zad4(Scanner scanner) {
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        System.out.printf("%d + %d = %d", a, b, a + b);
        System.out.printf("%d - %d = %d", a, b, a - b);
        System.out.printf("%d * %d = %d", a, b, a * b);
        System.out.printf("%d / %d = %d", a, b, a / b);
    }

    private static void zad5(Scanner scanner) {
        int x = scanner.nextInt();
        System.out.println(x + 140);
        System.out.println(x - 31);
        System.out.println(x * 7);
        System.out.println(x / 13);
        System.out.println(x % 7);
        System.out.println(x / 4);
        System.out.println(Math.pow(x, 45));
        System.out.println(x & 67);
        System.out.println(x | 59);
        System.out.println(x ^ 23);
        System.out.println(x << 5);
        System.out.println(x >> 6);

    }
}
