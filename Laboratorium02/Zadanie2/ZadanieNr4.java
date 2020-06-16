public class ZadanieNr4 {
    public static void sumaDodatnich(int[]tab){
        int sumaDodatnich=0;
        for(int i=0;i<tab.length;i++)
        {
            if(tab[i]>0)
            {
                 sumaDodatnich+=tab[i];
            }
        }
        System.out.println("Suma dodatnich = " + sumaDodatnich);
    }

    public static void sumaUjemnych(int[]tab){
        int sumaUjemnych=0;
        for(int i=0;i<tab.length;i++)
        {
            if(tab[i]<0)
            {
                sumaUjemnych+=tab[i];
            }
        }
        System.out.println("Suma ujemnych = " + sumaUjemnych);
    }
}
