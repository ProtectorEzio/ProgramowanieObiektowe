import java.util.*;

public class Main {

    public static void main(String[] args) {
        int n;
        int max=999;
        int min=-999;
	    Scanner odczyt = new Scanner(System.in);
        System.out.println("Podaj liczbę z przedziału od 1 do 100");
        n=odczyt.nextInt();
        if(n<1 || n>100)
        {
            System.out.println("Podana liczba nie należy do przedziału , podaj liczbę jeszcze raz");
            n=odczyt.nextInt();
        }
        int tab[];
        int size = n;
        tab = new int[size];
        generuj tablica = new generuj();
        wyswietl wys = new wyswietl();
        tablica.generuj(tab,n,min,max);
        wys.wys(tab,n);
        System.out.println();
        ZadanieNr1 p = new ZadanieNr1();
        p.Parzyste(tab);
        p.Nieparzyste(tab);
        ZadanieNr2 x=new ZadanieNr2();
        x.Dodatnie(tab);
        x.Ujemne(tab);
        x.Zerowe(tab);
        ZadanieNr3 q=new ZadanieNr3();
        q.Maksymalne(tab);
        ZadanieNr4 r=new ZadanieNr4();
        r.sumaDodatnich(tab);
        r.sumaUjemnych(tab);
        //ZadanieNr5 w = new ZadanieNr5();
        //Czasami wywala błąd(zależy od kaprysu programu(lepiej odpalać bez reszty funkcji))
        //w.Dlugosc(tab);
        ZadanieNr6 e = new ZadanieNr6();
        e.signum(tab);
        ZadanieNr7 t= new ZadanieNr7();
        int lewy,prawy;
        System.out.println("Podaj dwie liczby oddzielone spacją z przedziału od 1:n-1");
        lewy=odczyt.nextInt();
        prawy=odczyt.nextInt();
        if(lewy>n && lewy<=1 && prawy>n && prawy<=1)
        {
            System.out.println("Podana przez ciebie liczba/-y nie znajduje/-ą się w przedziale od 1:n-1");
            System.out.println("Ponownie podaj liczby znajdujące się w przedziale");
            lewy=odczyt.nextInt();
            prawy=odczyt.nextInt();
        }
        t.odwrocFragment(tab,lewy,prawy);
    }
}

