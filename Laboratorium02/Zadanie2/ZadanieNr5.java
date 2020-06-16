public class ZadanieNr5 {
    public static void  Dlugosc(int[]tab){
        int długosc=0;
        int liczba=0;
        for(int i=0;i<tab.length;i++)
        {
            if(tab[i]>0 && tab[i+1]>0)
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
        System.out.println("Długość maksymalna ciągu dodatniego = " + długosc);
    }
}
