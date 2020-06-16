import java.util.ArrayList;

public class Main {

    public static ArrayList<Integer>łącz(ArrayList<Integer>a,ArrayList<Integer>b)
    {
        int length=a.size()+b.size();
        ArrayList<Integer>nowa=new ArrayList<Integer>(length);
        for(int i=0;i<a.size();i++)
        {
            nowa.add(a.get(i));
        }
        for(int i=a.size();i<length;i++)
        {
            nowa.add(b.get(i-a.size()));
        }
        return nowa;
    }
    public static ArrayList<Integer>merge(ArrayList<Integer>a,ArrayList<Integer>b)
    {
        ArrayList<Integer> wynik = new ArrayList();
        int dlugosc;
        if (a.size() > b.size()) dlugosc = a.size();
        else dlugosc = b.size();

        for (int i = 0; i < dlugosc; i++) {
            if (a.size() > i) {
                wynik.add(a.get(i));
            }
            if (b.size() > i) {
                wynik.add(b.get(i));
            }
        }
        return wynik;
    }
    public static void bubblesort(ArrayList<Integer>a)
    {
        Integer tmp;
        if(a.size()>1)
        {
            for(int i=0;i<a.size();i++)
            {
                for(int j=0;j<a.size()-1;j++)
                {
                    if(a.get(j).compareTo(a.get(j+1))>0)
                    {
                        tmp=a.get(j);
                        a.set(j,a.get(j+1));
                        a.set(j+1,tmp);
                    }
                }
            }
        }

    }
    public static ArrayList<Integer>mergeSorted(ArrayList<Integer>a,ArrayList<Integer>b)
    {
        ArrayList<Integer> wynik = new ArrayList();
        int dlugosc;
        bubblesort(a);
        bubblesort(b);
        if (a.size() > b.size()) dlugosc = a.size();
        else dlugosc = b.size();
        for (int i = 0; i < dlugosc; i++) {
            if (a.size() > i) {
                wynik.add(a.get(i));
            }
            if (b.size() > i) {
                wynik.add(b.get(i));
            }
        }
        bubblesort(wynik);
        return wynik;
    }

    public static ArrayList<Integer>Reversed(ArrayList<Integer>a)
    {
        ArrayList<Integer> wynik = new ArrayList();
        wynik=a;
        int i=0;
        int j=a.size()-1;
        while(i<j)
        {
            int temp=wynik.get(i);
            wynik.set(i,a.get(j));
            wynik.set(j,temp);
            i++;
            j--;
        }
        return wynik;
    }
    public static void Reversed2(ArrayList<Integer>a)
    {
        ArrayList<Integer> wynik = new ArrayList();
        wynik=a;
        int i=0;
        int j=a.size()-1;
        while(i<j)
        {
            int temp=wynik.get(i);
            wynik.set(i,a.get(j));
            wynik.set(j,temp);
            i++;
            j--;
        }
    }

    public static void main(String[] args) {
        ArrayList<Integer>a=new ArrayList<Integer>();
        ArrayList<Integer>b=new ArrayList<Integer>();
        a.add(1);
        a.add(4);
        a.add(9);
        a.add(16);
        b.add(9);
        b.add(7);
        b.add(4);
        b.add(9);
        b.add(11);
        System.out.println(merge(a,b));
        System.out.println();
        System.out.println(mergeSorted(a,b));
        System.out.println();
        ArrayList<Integer>c=mergeSorted(a,b);
        System.out.println(c);
        System.out.println();
        System.out.println(Reversed(c));
        System.out.println();
        Reversed2(a);
        System.out.println(a);
    }
}
