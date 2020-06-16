import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {

    public static int countChar(String str,char c)
    {
        int wynik=0;
        String tekst = str.toLowerCase();
        for(int i=0;i<str.length();i++)
        {
            if(tekst.charAt(i)==c)
            {
                wynik++;
            }
        }
        System.out.print("znalezione litery = ");
        return wynik;
    }

    public static void main(String[] args) throws FileNotFoundException{
    File plik = new File("tekst.txt");
    Scanner odczyt = new Scanner(plik);
    Scanner znak = new Scanner(System.in);
    System.out.println("Podaj znak do zliczenia");
    char cos = znak.next().charAt(0);
    String str = odczyt.nextLine();
    System.out.println(plik.getName());
    System.out.println(str);
    System.out.println(cos);
    System.out.println(countChar(str,cos));
    }
}
