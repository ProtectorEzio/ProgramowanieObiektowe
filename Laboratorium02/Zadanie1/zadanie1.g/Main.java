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
            System.out.print(tablica[i] + " ");

        }
        //=======================================================

        System.out.println(" ");
        System.out.println("Zadanie 1.g");

        int lewy,prawy;
        System.out.println("Podaj dwie liczby oddzielone spacją(z przedziału od 1-99");
        lewy=odczyt.nextInt();
        prawy=odczyt.nextInt();
        if(lewy>99 && lewy<1 && prawy>99 && prawy<1)
        {
            System.out.println("Podana przez ciebie liczba/-y nie znajduje/-ą się w przedziale od 1-99");
            System.out.println("Ponownie podaj liczby znajdujące się w przedziale");
            lewy=odczyt.nextInt();
            prawy=odczyt.nextInt();
        }
        System.out.println("Wybrany fragment");
        for(int i=lewy;i<=prawy;i++)
        {
            System.out.print(tablica[i] + " ");
        }
        System.out.println();
        System.out.println("Fragment po odwróceniu");
        for(int i=prawy;i>=lewy;i--)
        {
            System.out.print(tablica[i] + " ");
        }
        System.out.println();
    }
}