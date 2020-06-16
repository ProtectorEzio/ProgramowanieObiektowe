import java.util.*;
import java.math.*;
public class Main {

    public static void main(String[] args) {

    	Scanner odczyt = new Scanner(System.in);


    	BigDecimal saldoP;
		BigDecimal saldoK;
		BigDecimal oprocentowanie;
		BigDecimal zmienna = new BigDecimal(100);  // zmienna do wyliczenia oprocentowania
		int ileLat;



		System.out.println("Podaj saldo początkowe = ");
		saldoP = new BigDecimal(odczyt.nextFloat());
		BigDecimal tmp = saldoP;
		System.out.println("Podaj ile lat trwa lokata oszczędnościowa = ");
		ileLat = odczyt.nextInt();
		System.out.println("Podaj ile wynosi oprocentowanie(podaj x od 1-100 , x/100 = x%)");
		oprocentowanie = new BigDecimal(odczyt.nextFloat());
		BigDecimal oprocentowanie2 = oprocentowanie.divide(zmienna);


		System.out.println("Saldo początkowe = " + saldoP);
		System.out.println("Saldo oprocentowanie = " + oprocentowanie+"%");
		System.out.println("Saldo długość oszczędzania = " + ileLat);


		for(int i=0;i<ileLat;i++)
		{
			BigDecimal cos = tmp.multiply(oprocentowanie2);
			saldoK=tmp.add(cos);
			tmp=saldoK;
			tmp=tmp.setScale(2,BigDecimal.ROUND_CEILING);
			System.out.println(tmp);
		}


		saldoK = tmp;
		System.out.println("Saldo koncowe wynosi = " + saldoK);

    }
}
