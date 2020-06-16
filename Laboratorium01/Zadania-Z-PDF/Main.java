package pl.edu.uwm.wmii.rafalzulewski.laboratorium01;

import java.util.*;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        //--------------------------------------------------------------------------------------------------------------

        System.out.println("Zadanie 1.1.a");
        int a,x;
        int size;
        int wynikA=0;
        int suma=0;
        System.out.println("Podaj liczbę narutalną");
        Scanner odczyt = new Scanner(System.in);
        a = odczyt.nextInt();

        if (a<0)
        {
            System.out.println("To nie jest liczba naturalna , liczby naturalne są większe od 0 , podaj liczbę jeszcze raz");
            a = odczyt.nextInt();
        }
        size = a;
        System.out.println("Podałeś liczbę naturalną równą" + " - " + a);
        System.out.println("Podaj" + " "+ a + " " + "liczb rzeczywistych odzielonych spacją");
        for(int i=a;i<size+a;i++) {
        x = odczyt.nextInt();
        wynikA+=x;


        suma=wynikA;
        wynikA=suma;
        System.out.println("Wyniki które nam wychodzą z dodawania" + " = " + wynikA);
        }

        //--------------------------------------------------------------------------------------------------------------

        System.out.println("Zadanie 1.1.e");
        int b,y;
        int wynikE=1;
        int iloczyn=0;
        int liczba=0;
        System.out.println("Podaj liczbę narutalną");
        b = odczyt.nextInt();
        if (b<0)
        {
            System.out.println("To nie jest liczba naturalna , liczby naturalne są większe od 0 , podaj liczbę jeszcze raz");
            b = odczyt.nextInt();
        }
        size=b;
        System.out.println("Podałeś liczbę naturalną równą" + " - " + b);
        System.out.println("Podaj" + " "+ b + " " + "liczb rzeczywistych odzielonych spacją");
        for(int i=0;i<size;i++)
        {
            y=odczyt.nextInt();
            liczba=Math.abs(y);
            wynikE=wynikE*liczba;
            iloczyn=wynikE;
            wynikE=iloczyn;

            System.out.println("Wyniki które nam wychodzą z mnożenia" + " = " + wynikE);
        }

        //--------------------------------------------------------------------------------------------------------------

        System.out.println("Zadanie 1.1.h");
        int c,z;
        int wynikH=0;
        int wynik=0;
        System.out.println("Podaj liczbę narutalną");
        c = odczyt.nextInt();
        if (c<0)
        {
            System.out.println("To nie jest liczba naturalna , liczby naturalne są większe od 0 , podaj liczbę jeszcze raz");
            c = odczyt.nextInt();
        }
        System.out.println("Podałeś liczbę naturalną równą" + " - " + c);
        System.out.println("Podaj" + " "+ c + " " + "liczb rzeczywistych odzielonych spacją");
        for(int i=1;i<c+1;i++)
        {
            z=odczyt.nextInt();
            wynik+=z*Math.pow(-1,1+i);
            wynikE=wynik;
            wynik=wynikE;


            System.out.println("Wyniki które nam wychodzą" + " - " + wynik);
        }

        //--------------------------------------------------------------------------------------------------------------

        System.out.println("Zadanie 2.1.b");
        int d,q;
        int wynikB=0;
        int wynik2B=0;
        d = odczyt.nextInt();
        if (d<0)
        {
            System.out.println("To nie jest liczba naturalna , liczby naturalne są większe od 0 , podaj liczbę jeszcze raz");
            d = odczyt.nextInt();
        }
        System.out.println("Podałeś liczbę naturalną równą" + " - " + d);
        System.out.println("Podaj" + " "+ d + " " + "liczb rzeczywistych odzielonych spacją");
        for(int i=0;i<d;i++)
        {
            q=odczyt.nextInt();
            wynikB=q;
            if(wynikB%3==0 && wynikB%5!=0)
            {
                System.out.println("Liczby naturalne spełniające warunek podzielne przez 3, nie podzielne przez 5" + " = " + wynikB);
                wynik2B+=1;
            }
        }
        System.out.println("Ilość liczb spełniających warunek" + " = " + wynik2B);

        //--------------------------------------------------------------------------------------------------------------

        System.out.println("Zadanie 2.1.d");
        int e,p;
        int wynikD=0;
        List<Integer>lista=new ArrayList<Integer>();
        e = odczyt.nextInt();
        if (e<0)
        {
            System.out.println("To nie jest liczba naturalna , liczby naturalne są większe od 0 , podaj liczbę jeszcze raz");
            e = odczyt.nextInt();
        }
        System.out.println("Podałeś liczbę naturalną równą" + " - " + e);
        System.out.println("Podaj" + " "+ e + " " + "liczb rzeczywistych odzielonych spacją");
        for(int i=0;i<e;i++)
        {
            p=odczyt.nextInt();
            lista.add(p);
        }
        for(int i=1;i<e-1;i++)
        {
            if(lista.get(i)<((lista.get(i-1)+lista.get(i+1))/2))
            {
                System.out.println("("+lista.get(i)+","+" "+lista.get(i-1)+lista.get(i+1)+")");
                wynikD+=1;
            }
        }
        System.out.println("Ilość liczb spełniających warunek" + " = " + wynikD);


        //--------------------------------------------------------------------------------------------------------------

        System.out.println("Zadanie 2.1.f");
        int j,l;
        int wynikF=0;
        j = odczyt.nextInt();
        if (j<0)
        {
            System.out.println("To nie jest liczba naturalna , liczby naturalne są większe od 0 , podaj liczbę jeszcze raz");
            j = odczyt.nextInt();
        }
        System.out.println("Podałeś liczbę naturalną równą" + " - " + j);
        System.out.println("Podaj" + " "+ j + " " + "liczb rzeczywistych odzielonych spacją");
        for(int i=0;i<j;i++)
        {
            l=odczyt.nextInt();
            if(i%2!=0 || l%2==0)
            {
                System.out.println("Liczby naturalne spełniające warunek" + " = " + l);
                wynikF+=1;
            }
        }
        System.out.println("Ilość liczb spełniających warunek" + " = " + wynikF);

        //--------------------------------------------------------------------------------------------------------------

        System.out.println("Zadanie 2.5");
        int n;
        int o;
        int ilosc=0;
        List<Integer>lista2=new ArrayList<Integer>();
        n=odczyt.nextInt();
        if (n<0)
        {
            System.out.println("To nie jest liczba naturalna , liczby naturalne są większe od 0 , podaj liczbę jeszcze raz");
            n = odczyt.nextInt();
        }
        System.out.println("Podałeś liczbę naturalną równą" + " - " + n);
        System.out.println("Podaj" + " "+ n + " " + "liczb rzeczywistych odzielonych spacją");
        for(int i=0;i<n;i++)
        {
            o=odczyt.nextInt();
            lista2.add(o);
        }
        for(int i=0;i<n-1;i++)
        {
          if(lista2.get(i)>0 && lista2.get(i+1)>0)
          {
              System.out.println("("+lista2.get(i)+","+lista2.get(i+1)+")");
              ilosc+=1;
          }
        }
        System.out.println("Ich ilość wynosi - " + ilosc);

        //--------------------------------------------------------------------------------------------------------------
    }
}
