public class ZadanieNr7 {
    public static void odwrocFragment(int[]tab,int lewy,int prawy){
        System.out.println("Wybrany fragment");
        for(int i=lewy;i<=prawy;i++)
        {
            System.out.print(tab[i] + " ");
        }
        System.out.println();
        System.out.println("Fragment po odwróceniu");
        for(int i=prawy;i>=lewy;i--)
        {
            System.out.print(tab[i] + " ");
        }
    }
}
