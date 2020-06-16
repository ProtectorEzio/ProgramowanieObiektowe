public class ZadanieNr6 {
    public static void signum(int[] tab) {
        for (int i = 0; i < tab.length; i++) {
            if (tab[i] > 0) {
                tab[i] = 1;
                System.out.print(tab[i] + "  ");
            } else {
                if (tab[i] == 0) {
                    tab[i] = 0;
                    System.out.print(tab[i] + "  ");
                }
                tab[i] = -1;
                System.out.print(tab[i] + "  ");
            }
        }
        System.out.println();
    }
}
