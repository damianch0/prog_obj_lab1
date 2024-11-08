package org.example;

import java.util.Arrays;
import java.util.Scanner;

public class Zestaw3 {

    public static void main(String[] args) {
        podzbiory(new int[]{1,2,3});
    }

    // Zadanie 1 Wypisz w granicach n wszystkie trójki pitagorejskie.
    static void trojkiPitagorejskie(int n) {
        double c;
        for (int i = 1; i < n; i++) {
            for (int j = 1; j < n; j++) {
                c = Math.sqrt(i * i + j * j);
                if (c == (int) c) {
                    System.out.printf("%d^2 %d^b = %d\n", i, j, (int) c);
                }
            }
        }
    }

    // Zadanie 2 Wypisz w granicach n wszystkie możliwe zestawy współczynników
    // funkcji kwadratowej dla których istnieją rozwiązania
    static void funKwaRozwiazania(int n) {
        for (int a = 0; a < n; a++) {
            for (int b = 0; b < n; b++) {
                for (int c = 0; c < n; c++) {
                    if (b * b - 4 * a * c >= 0) {
                        System.out.printf("%d^2 - 4*%d*%d\n", a, b, c);
                    }
                }
            }
        }
    }


    // Zadanie 3 Wypisz w granicach n wszystkie możliwe zestawy współczynników
    //funkcji kwadratowej dla których pierwiastek z delty jest kwadratem
    //liczby naturalnej
    static void funKwaDelta(int n) {
        for (int a = 0; a < n; a++) {
            for (int b = 0; b < n; b++) {
                for (int c = 0; c < n; c++) {
                    double delta = Math.sqrt(b * b - 4 * a * c);
                    if (delta == (int) delta) {
                        System.out.printf("%dx^2 + %dx + %d = 0", a, b, c);
                    }
                }
            }
        }
    }

    // Zadanie 4 Wypisz wszystkie liczby pierwsze od 2 do n.
    static void liczbyPierwsze(int n) {
        for (int i = 2; i < n; i++) {
            if (czyPierwsza(i)) {
                System.out.println(i);
            }
        }
    }

    // Zadanie 5 Wypisz wszystkie liczby naturalne m-cyfrowe, które podzielne są
    //przez n.
    static void liczbyPodzielne(int m, int n) {
        for (int i = (int) Math.pow(10, m - 1); i < Math.pow(10, m); i++) {
            if (i % n == 0) {
                System.out.println(i);
            }
        }
    }

    // Zadanie 6 Wypisz piramidę z gwiazdek w dwóch wariantach, której wysokość jest
    //liczbą n.
    static void piramida(int n, boolean variant) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - i; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < i + 1; j++) {
                System.out.print(" * ");
            }
            System.out.println();
        }
    }

    // Zadanie7. Oblicz silnie liczby n
    static int silnia(int n) {
        if (n <= 0) {
            return 1;
        }
        return silnia(n - 1) * n;
    }

    // Zadanie 8 Oblicz silnie podwójną liczby n.
    static int silniaPodwojna(int n) {
        if (n == 0 || n == 1) {
            return 1;
        }
        return silniaPodwojna(n - 2) * n;
    }

    // Zadanie 9 Oblicz silnie m-tą liczby n.
    static int silnia(int m, int n) {
        if (n == 0 || n == 1) {
            return 1;
        }
        return silnia(n - m) * n;
    }

    // Zadanie 10. Oblicz dwumian Newtona n po k.
    static int dwumianNewtona(int n, int k) {
        return silnia(n) / (silnia(k) * silnia(n - k));
    }

    // zadanie 11 Wypisz n pierwszych elementów ciągu Fibonacciego.
    static int ciagFibonacciego(int n) {
        if (n == 0) {
            return 0;
        }
        if (n == 1) {
            return 1;
        }
        var tmp = ciagFibonacciego(n - 1) + ciagFibonacciego(n - 2);
        System.out.println(tmp);
        return tmp;
    }

    // zadanie 12 Oblicz sumę n liczb:
    //Naturalnych
    static int sumaNaturalnych(int n) {
        int sum = 0;
        for (int i = 1; i < n; i++) {
            sum += i;
        }
        return sum;
    }

    //Parzystych
    static int sumaParzystych(int n) {
        int sum = 0;
        for (int i = 1; i < n; i++) {
            if (i % 2 == 0) {
                sum += i;
            }
        }
        return sum;
    }

    //Nieparzystych
    static int sumaNieparzystych(int n) {
        int sum = 0;
        for (int i = 1; i < n; i++) {
            if (i % 2 != 0) {
                sum += i;
            }
        }
        return sum;
    }

    //Kwadratów liczb naturalnych
    static int sumaKwaNaturalnych(int n) {
        int sum = 0;
        for (int i = 1; i < n; i++) {
            sum += i * i;
        }
        return sum;
    }

    //Sześcianów liczb naturalnych
    static int sumaSzeNaturalnych(int n) {
        int sum = 0;
        for (int i = 1; i < n; i++) {
            sum += i * i * i;
        }
        return sum;
    }

    //Odwrotności liczb naturalnych
    static double sumaOdwNaturalnych(int n) {
        double sum = 0;
        for (int i = 1; i < n; i++) {
            sum += 1.0/i;
        }
        return sum;
    }
    // Zadanie 13. Sprawdź czy podany wyraz jest palindromem.
    static boolean czyPalindrom(String wyraz) {
        for (int i = 0; i < wyraz.length(); i++) {
            if (wyraz.charAt(i) != wyraz.charAt(wyraz.length() - i - 1)) {
                return false;
            }
        }

        return true;
    }

    // Zadanie 14. Wypisz trójkąt Pascala, którego wysokość jest liczbą n.
    static void trojkatPascala(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - i; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < i + 1; j++) {
                System.out.printf(" %d ", dwumianNewtona(i,j));
            }
            System.out.println();
        }
    }

    // Zadanie 15 Sprawdź czy podana liczba jest palindromem
    static boolean czyPalindrom(int n) {
        int tn = n;
        int tmp = 0;
        do {
            tmp += tn % 10;
            tmp *= 10;
            tn /= 10;
        }
        while(tn / 10 != 0);
        tmp += tn % 10;

        return tmp == n;
    }

    // Zadanie 16 Sprawdź czy wprowadzona liczba jest doskonała
    static boolean czyDoskonala(int n) {
        int tmp = 0;
        for (int i = 1; i < n; i++) {
            if (n % i == 0) {
                tmp += i;
            }
        }

        return tmp == n;
    }

    // Zadanie 17 Sprawdź czy wprowadzona liczba jest pierwsza.
    static boolean czyPierwsza(int n) {
        if (n < 2) {
            return false;
        }

        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                return false;
            }
        }

        return true;
    }

    // Zadanie 18 Wyznacz największy wspólny dzielnik dwóch liczb.
    static int nwd(int a, int b) {
        while(a % b != 0){
            int tmp = a % b;
            a = b;
            b = tmp;
        }

        return b;
    }

    // Zadanie 19. Funkcja wczytuje liczbę n, a następnie tworzy tablicę n
    //wprowadzonych liczb przez użytkownika, którą zwraca.
    static int[]  wczytajTablice() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Podaj rozmiar: ");
        int n = scanner.nextInt();
        int[] tab = new int[n];
        for (int i = 0; i < n; i++) {
            tab[i] = scanner.nextInt();
        }
        return tab;
    }

    // Zadanie 20 Wypisz wszystkie podzbiory tablicy n-elementowej
    static void podzbiory(int[] tab) {
        podzbiory(tab, 0, tab.length - 1, "");
    }

    static void podzbiory(int[] tab, int left, int right, String acc) {
        if (right < left) {
            System.out.println(acc);
            return;
        }
        podzbiory(tab, left + 1, right, acc);
        podzbiory(tab, left + 1, right, acc + tab[left]);
    }

}
