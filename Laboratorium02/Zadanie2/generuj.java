import java.util.*;

public class generuj {
    public static void generuj(int tab[],int n,int min ,int max){
        Random r = new Random();
        for(int i=0;i<n;i++)
        {
            tab[i]=r.nextInt(max-min+1)+min;
        }
    }
}