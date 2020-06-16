import java.util.*;

public class Main {

    public static void main(String[] args) {
        int n;
        Scanner odczyt = new Scanner(System.in);
        System.out.println("Podaj liczbę z przedziału od 1 do 100");
        n = odczyt.nextInt();
        if (n < 1 || n > 100) {
            System.out.println("Podana liczba nie należy do przedziału , podaj liczbę jeszcze raz");
            n = odczyt.nextInt();
        }
        int tablica[];
        int size = n;
        tablica = new int[size];
        Random r = new Random();
        for (int i = 0; i < n; i++) {
            tablica[i] = r.nextInt(999 + 999 + 1) - 999;
            System.out.println(tablica[i]);
        }
        //==============================================================================================

        System.out.println("Zadanie 1.b");
        int dodatnie=0;
        int ujemne=0;
        int zerowe=0;
        for(int i=0;i<n;i++)
        {
            if(tablica[i]>0)
            {
                dodatnie+=1;
            }
            if(tablica[i]==0)
            {
                zerowe+=1;
            }
            if(tablica[i]<0)
            {
                ujemne+=1;
            }
        }
        System.out.println("Ilość dodatnich = " + dodatnie + " , " + "ilosc ujemnych = " + ujemne + " , " + "ilosc zerowych = " + zerowe);

    }
}
