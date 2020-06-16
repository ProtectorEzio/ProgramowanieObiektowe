public class ZadanieNr2 {
    public static void Dodatnie(int[] tab) {
        int dodatnie = 0;

        for (int i = 0; i < tab.length; i++) {
            if (tab[i] > 0)
                dodatnie += 1;

        }
        System.out.println("Ilość dodatnich = " + dodatnie);
    }

    public static void Ujemne(int[] tab) {
        int ujemne = 0;
        for (int i = 0; i < tab.length; i++) {
            if (tab[i] < 0)
                ujemne += 1;
        }
        System.out.println("Ilosc ujemnych = " + ujemne);
    }

    public static void Zerowe(int[] tab){
        int zerowe=0;
        for (int i = 0; i < tab.length; i++) {
            if (tab[i] == 0)
                zerowe += 1;
        }
        System.out.println("Ilosc zerowych = " + zerowe);
    }
}
