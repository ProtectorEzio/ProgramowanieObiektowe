import java.math.BigInteger;
import java.util.*;
class main {

    public static void zadanie(int n) {
        BigInteger[][] szachownica = new BigInteger[n][n];
        BigInteger ziarna = new BigInteger("2");
        int potega=0;
        BigInteger suma = new BigInteger("0");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                BigInteger wynik = ziarna.pow(potega);
                szachownica[i][j] = wynik;
                potega++;
                suma = suma.add(wynik);
            }
        }
        System.out.println(Arrays.deepToString(szachownica));
        System.out.println("Suma: "+suma);
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        zadanie(n);
    }
}