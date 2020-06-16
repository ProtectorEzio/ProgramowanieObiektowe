package pl.edu.uwm.wmii.rafalzulewski.laboratorium01;

import java.util.Scanner;
import java.lang.*;
public class Main {

    public static void main(String[] args) {
        Scanner odczyt=new Scanner(System.in);
        double a,b,c;
        int Nrdzialania;
        int wybór;
        System.out.println("Wybierz działanie");
        System.out.println("1.Suma");
        System.out.println("2.Różnica");
        System.out.println("3.Iloczyn");
        System.out.println("4.Iloraz");
        System.out.println("5.Modulo(Reszta z dzielenia)");
        System.out.println("6.Pierwiastek");
        do{
            Nrdzialania=odczyt.nextInt();
            switch(Nrdzialania) {
                case 1:
                    System.out.println("Suma");
                    System.out.println("Podaj a");
                    a=odczyt.nextDouble();
                    System.out.println("Podaj b");
                    b=odczyt.nextDouble();
                    c=a+b;
                    System.out.println("a+b="+" "+ c);
                    break;
                case 2:
                    System.out.println("Różnica");
                    System.out.println("Podaj a");
                    a=odczyt.nextDouble();
                    System.out.println("Podaj b");
                    b=odczyt.nextDouble();
                    c=a-b;
                    System.out.println("a-b="+" "+ c);
                    break;
                case 3:
                    System.out.println("Iloczyn");
                    System.out.println("Podaj a");
                    a=odczyt.nextDouble();
                    System.out.println("Podaj b");
                    b=odczyt.nextDouble();
                    c=a*b;
                    System.out.println("a*b="+" "+ c);
                    break;
                case 4:
                    System.out.println("Iloraz");
                    System.out.println("Podaj a");
                    a=odczyt.nextDouble();
                    System.out.println("Podaj b");
                    b=odczyt.nextDouble();
                    c=a/b;
                    System.out.println("a/b="+" "+ c);
                    break;
                case 5:
                    System.out.println("Modulo(Reszta z dzielenia)");
                    System.out.println("Podaj a");
                    a=odczyt.nextDouble();
                    System.out.println("Podaj b");
                    b=odczyt.nextDouble();
                    c=a%b;
                    System.out.println("a%b="+" "+ c);
                    break;
                case 6:
                    System.out.println("Pierwiastek");
                    System.out.println("Podaj liczbę");
                    c=odczyt.nextDouble();
                    double pierwiastek = Math.sqrt(c);
                    System.out.println("Pierwiastek z wybranej liczby jest równy"+" "+ pierwiastek);
                    break;
            }
            System.out.println("Kontynuujemy? 1-Tak,0-Nie");
            wybór=odczyt.nextInt();
        }while(wybór!=0);
        System.out.println("Goodbye!");
    }
}