import java.math.*;
import java.lang.*;

public class RachunekBankowy {
    static void setRocznaStopaProcentowa(double stopaProcentowa)
    {
        rocznaStopaProcentowa=stopaProcentowa;
    }
    static double rocznaStopaProcentowa;
    private double saldo;
    public void stanKonta(double liczba)
    {
        saldo = liczba;
    }
    public static double round(double wartosc,int po)
    {
        if(po<0) throw new IllegalArgumentException();

        BigDecimal bd = new BigDecimal(wartosc);
        bd = bd.setScale(po,RoundingMode.HALF_UP);
        return bd.doubleValue();
    }
    public double obliczMiesieczneOdsetki()
    {
        double wynik = (saldo * rocznaStopaProcentowa) / 12;
        double stanKonta = saldo+wynik;
        System.out.println("Odsetki miesięczne wynoszą = " +    round(wynik,2));
        System.out.println("Saldo konta przed doliczeniem odsetek wynosi = " + saldo);
        saldo = round(stanKonta,2);
        System.out.println("Saldo z doliczonymi odsetkami = " + round(stanKonta,2));
        return round(stanKonta,2);
    }
}
