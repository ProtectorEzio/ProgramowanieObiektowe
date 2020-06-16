import java.io.FileNotFoundException;
import java.io.File;
import java.util.Scanner;

public class Main {

    public static int countSubStr(String str,String subStr)
    {
        int lastIndex = 0;
        int count = 0;
        String tekst = str.toLowerCase();
        while (lastIndex != -1)
        {
            lastIndex = tekst.indexOf(subStr,lastIndex);
            if( lastIndex != -1)
            {
                count++;
                lastIndex += subStr.length();
            }
        }
        return count;
    }

    public static void main(String[] args) throws FileNotFoundException{
        File plik = new File("tekst.txt");
        Scanner odczyt = new Scanner(plik);
        Scanner tekst = new Scanner(System.in);
        System.out.println("Podaj wyraz do zliczenia w tekscie - ");
        String cos = tekst.nextLine();
        String str = odczyt.nextLine();
        System.out.println(plik.getName());
        System.out.println(str);
        System.out.println(cos);
        System.out.println(countSubStr(str,cos));
    }
}
