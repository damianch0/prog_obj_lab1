package pl.damian;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

// Zestaw 1
public class Zestaw1 {

    public static void main(String[] args) {
// zad 1
        String imieNazwisko = "Damian Chyliński";
        System.out.println(imieNazwisko);
// zad 2
        System.out.println(imieNazwisko);
// zad 3
        System.out.println("Ala" + "ma" + "kota");
//zad 4
        System.out.println("                      *");
        System.out.println("                      * *");
        System.out.println("                      * * *");
        System.out.println(" * * * * * * * * * * * * * *");
        System.out.println(" * * * * * * * * * * * * * * *");
        System.out.println(" * * * * * * * * * * * * * *");
        System.out.println("                      * * *");
        System.out.println("                      * *");
        System.out.println("                      *");
        System.out.println();
        System.out.println("     *");
        System.out.println("    * *");
        System.out.println("   * * *");
        System.out.println("  * * * *");
        System.out.println(" * * * * *");
        System.out.println("* * * * * *");
        System.out.println(" * * * * *");
        System.out.println("  * * * *");
        System.out.println("   * * *");
        System.out.println("    * *");
        System.out.println("     *");

// zad 5
        System.out.println("Ala ma kota".replace("a", "e"));
// zad 6
        String napis = "Ala ma kota";
        System.out.println(napis.toUpperCase());
        System.out.println(napis.toLowerCase());
// zad 7
        System.out.println();
        System.out.println("A = " + (int) 'A');
        System.out.println("! = " + (int) '!');
        System.out.println("@ = " + (int) '@');
        System.out.println("> = " + (int) '>');
        System.out.println("~ = " + (int) '~');
        System.out.println("\\n = " + (int) '\n');
        System.out.println("\\b = " + (int) '\b');

// zad 8
        // duże litery <67, 90>
        // małe litery <97, 122>
        // cyfry <48, 57>
//        System.out.println((int) 'A');
//        System.out.println((int) 'Z');
//        System.out.println((int) 'a');
//        System.out.println((int) 'z');
//        System.out.println((int) '0');
//        System.out.println((int) '9');

// zad 9
        System.out.printf("Grzesiek nie wiedział dlaczego %s jest tak drapieżnym %s mimo, że jego %s na to nie wskazuje.\n", "napis1", "napis2", "napis3");
// zad 10
        System.out.printf("%s to najlepsza książka napisana przez %s\n", "Włodek ", "Włodek P");
// zad 11
        System.out.println("wodrze".repeat(5));

// zad 12
        DateTimeFormatter dateFormat = DateTimeFormatter.ofPattern("yyyy-M-d");
        DateTimeFormatter timeFormat = DateTimeFormatter.ofPattern("HH:mm:ss");
        LocalDateTime now = LocalDateTime.now();
        System.out.printf("Dzisiaj jest %s godzina %s", now.format(dateFormat), now.format(timeFormat));
// zad 13
        System.out.println((char) 54);
        System.out.println((char) 103);
        System.out.println((char) 241);
        System.out.println((char) 67);
        System.out.println((char) 9999);
        System.out.println((char) imieNazwisko.length());
        System.out.println((char) 129781);

    }

}
