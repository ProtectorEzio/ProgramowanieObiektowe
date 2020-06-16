public class ZadanieNr3 {
    public static void Maksymalne(int[]tab){
        int iloscMax=0;
        int max=tab[0];
        for(int i=0;i<tab.length;i++)
        {
            if(tab[i]>max) {
                max = tab[i];
            }
        }
        System.out.println("Maksymalna wartość = " + max);
        for(int i=0;i<tab.length;i++)
        {
            if(tab[i]==max)
            {
                iloscMax+=1;
            }
        }
        System.out.println("Ilość wystąpień = " + iloscMax);
    }

}
