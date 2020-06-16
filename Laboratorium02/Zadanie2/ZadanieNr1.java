public class ZadanieNr1 {
    public static void Parzyste(int[]tab){
        int parzyste=0;
        for(int i=0;i<tab.length;i++) {
            if (tab[i] % 2 == 0)
                parzyste+=1;

        }
        System.out.println("Ilość parzystych = " + parzyste);
    }
    public static void Nieparzyste(int[]tab){
        int nieparzyste=0;

        for(int i=0;i<tab.length;i++) {
            if (tab[i] % 2 != 0)
                nieparzyste+=1;
        }
        System.out.println("Ilość nieparzystych = " + nieparzyste);
    }
}
