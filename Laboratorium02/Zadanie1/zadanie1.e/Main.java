import java.util.*;

public class Main {

    public static void main(String[] args) {
        int n;
        Scanner odczyt = new Scanner(System.in);
        System.out.println("Podaj liczbę z przedziału od 1 do 100");
        n=odczyt.nextInt();
        if(n<1 || n>100)
        {
            System.out.println("Podana liczba nie należy do przedziału , podaj liczbę jeszcze raz");
            n=odczyt.nextInt();
        }
        int tablica[];
        int size =n;
        tablica = new int[size];
        Random r = new Random();
        for(int i=0;i<n;i++)
        {
            tablica[i]=r.nextInt(999+999+1)-999;
            System.out.println(tablica[i]);
        }
        //=======================================================

        System.out.println("Zadanie 1.e");

        int długosc=0;
        int liczba=0;
        for(int i=0;i<n;i++)
        {
            if(tablica[i]>0 && tablica[i+1]>0)
            {
                liczba++;
            }
            else
            {
                if(liczba!=0) {
                    if (liczba > długosc)
                    {
                        długosc=liczba+1;
                    }
                }
                liczba=0;
            }
        }
        System.out.println(długosc);
    }
}
