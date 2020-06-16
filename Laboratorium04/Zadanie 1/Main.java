import javax.xml.stream.events.Characters;
import java.util.*;
import java.lang.*;

public class Main {

    public static int countChar(String str,char c)
    {
        int wynik=0;

        for(int i=0;i<str.length();i++)
        {
            if(str.charAt(i)==c)
            {
                wynik++;
            }
        }
        System.out.print("znalezione litery = ");
        return wynik;
    }

    public static int countSubStr(String str,String subStr)
    {
        int lastIndex = 0;
        int count = 0;
        while (lastIndex != -1)
        {
            lastIndex = str.indexOf(subStr,lastIndex);
            if( lastIndex != -1)
            {
                count++;
                lastIndex += subStr.length();
            }
        }
        return count;
    }

    public static String middle(String str){
        char znak,znak2,cos2;
        String cos;
        cos = " ";
        cos2= ' ';
        for(int i=1;i<str.length();i++)
        {
            znak=str.charAt(i-1);
            znak2=str.charAt(i);
            if(str.length()%2==0)
            {
                if(i==str.length()/2)
                {
                    cos=znak+""+znak2;
                }
            }
            if(str.length()%2!=0)
            {
                if(i==str.length()/2)
                {
                    cos2=znak2;
                }
            }
        }
        if(str.length()%2==0)
        {
            return cos;
        }
        else
        {
            return Character.toString(cos2);
        }
    }

    public static String repeat(String str,int n)
    {
        String wynik="";
        for(int i=0;i<n;i++)
        {
            wynik+=str;
        }
        return wynik;
    }

    static int [] where(String str, String subStr)
    {
        int n=countSubStr(str,subStr);
        int[] count = new int[n];
        int i = str.indexOf(subStr);
        int j=0;
        count[j]=i;
        while(i >= 0)
        {
            System.out.println(i);
            i = str.indexOf(subStr, i+1);
            if(i != -1) {
                count[++j] = i;
            }
        }
        return count;
    }
    public static String change(String str)
    {
        char[] napis=str.toCharArray();
        StringBuffer test = new StringBuffer();
        String male=str.toLowerCase();
        String duze=str.toUpperCase();
        for(int i=0;i<str.length();i++)
        {
            char litera=str.charAt(i);
            if(litera>=97 && litera<=122)
            {
                napis[i]=duze.charAt(i);
                test.append(napis[i]);
            }
            else if (litera>=65 && litera<=90)
            {
                napis[i]=male.charAt(i);
                test.append(napis[i]);
            }
            else
            {
                napis[i]=str.charAt(i);
                test.append(napis[i]);
            }
        }
        return test.toString();
    }
    public static String nice(String str)
    {
        StringBuffer sb = new StringBuffer(str);

        sb.reverse();

        List<String> ret = new ArrayList<String>((sb.length() + 3 - 1) / 3);

        for (int start = 0; start < sb.length(); start += 3) {
            ret.add(sb.substring(start, Math.min(sb.length(), start + 3)));
        }

        StringBuffer newStr = new StringBuffer();
        for (String s : ret)
        {
            sb.append(s);
            sb.append("'");
        }
        return sb.toString();
    }

    public static String nice2(String str, int size, String separator)
    {
        StringBuffer sb = new StringBuffer(str);
        sb.reverse();

        List<String> ret = new ArrayList<String>((sb.length() + size - 1) / size);

        for (int start = 0; start < sb.length(); start += size) {
            ret.add(sb.substring(start, Math.min(sb.length(), start + size)));
        }

        StringBuffer newStr = new StringBuffer();
        for (String s : ret)
        {
            sb.append(s);
            sb.append(separator);
        }

        return sb.toString();
    }



    public static void main(String[] args) {
        Scanner odczyt=new Scanner(System.in);
        Zad1 zadania = new Zad1();
        zadania.countChar("lelelelewel",'l');
        System.out.println("");
        zadania.countSubStr("lelewel ma lelewela","le");
        zadania.middle("Ciastko1");
        System.out.println(countChar("lelelelewel",'l'));
        System.out.println("");
        System.out.println("Ilośc wystąpień= "+countSubStr("lelewel ma lelewela","le"));
        System.out.println("");
        System.out.println("Podaj tekst do następnej metody");
        String tekst=odczyt.next();
        System.out.println(middle(tekst));
        System.out.println("");
        int n;
        String tekst2;
        System.out.println("Podaj liczbę powtórzeń oraz tekst do następnej metody");
        n=odczyt.nextInt();
        tekst2=odczyt.next();
        System.out.println(repeat(tekst2,n));
        System.out.println("");
        int[] t = where("polelewel ma lelewela","le");
        System.out.println(Arrays.toString(t));
        System.out.println(change("lolek i Bolek LULA"));
        System.out.println(nice("3516235172"));


    }
}
