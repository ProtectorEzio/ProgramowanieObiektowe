import java.util.Scanner;
import java.util.Random;


public class Macierz {
    static int m,n,k;
    int[][]tab;

    public static void main(String[] args) {

        Macierz A=new Macierz();
        Macierz B=new Macierz();
        Macierz C=new Macierz();
        Scanner odczyt = new Scanner( System.in );
        Random rand= new Random();
        System.out.print( "k = " );
        k = odczyt.nextInt();
        System.out.print( "m = " );
        m = odczyt.nextInt();
        System.out.print( "n = " );
        n = odczyt.nextInt();
        if ( ( k < 0 || k>10 ) | ( m < 0 || m>10 ) | ( n < 0 || n>10 ) )
        {
            System.out.print( "Podano błędne wymiary macierzy,Proszę podać poprawne wymiary\n" );
            System.out.print( "k = " );
            k = odczyt.nextInt();
            System.out.print( "m = " );
            m = odczyt.nextInt();
            System.out.print( "n = " );
            n = odczyt.nextInt();
        }
        A.tab = new int[m][n];
        B.tab = new int[n][k];
        C.tab = new int[m][k];

        for(int i = 0; i < m; i++)
        {
            for(int j = 0; j < n; j++)
            {
                A.tab[i][j] = rand.nextInt(9)+1;
            }
        }

        System.out.println( "Macierz A" );

        for(int i = 0; i < m; i++)
        {
            for(int j = 0; j < n; j++)
            {
                if ( j % n == 0 )
                    System.out.println();
                System.out.print( A.tab[i][j] + " " );
            }
        }
        System.out.println();
        for(int i = 0; i < n; i++)
        {
            for(int j = 0; j < k; j++)
            {
                B.tab[i][j] = rand.nextInt(9)+1;
            }
        }

        System.out.println( "Macierz B" );

        for(int i = 0; i < n; i++)
        {
            for(int j = 0; j < k; j++)
            {
                if ( j % k == 0 )
                    System.out.println();
                System.out.print( B.tab[i][j] + " " );
            }
        }
        int iloczyn=0;
        for(int i = 0; i < m; i++)
        {
            for(int j = 0; j < k; j++)
            {
                for(int l = 0; l < n ; l++)
                    iloczyn += A.tab[i][l] * B.tab[l][j];

                C.tab[i][j] = iloczyn;
                iloczyn = 0;
            }
        }
        System.out.println();
        System.out.println( "Macierz C" );

        for(int i = 0; i < m; i++)
        {
            for(int j = 0; j < k; j++)
            {
                if ( j % k == 0 )
                    System.out.println();
                System.out.print( C.tab[i][j] + " " );
            }
        }
    }
}
