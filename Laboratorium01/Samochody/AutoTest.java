package pl.edu.uwm.wmii.rafalzulewski.laboratorium01;
import java.lang.*;
import java.util.*;
public class AutoTest {

    public static void main(String[] args) {
        List<String>Samochody = new ArrayList<String>();
        Samochod p = new Samochod();
        p.marka = "Fiat";
        p.rocznik = 2000;
        p.pojSilnika = 12.5F;
        p.sprOgraniczenie(2000);
        p.oblicz(100,12.5F);

        Samochod x = new Samochod();
        x.marka = "Automobil";
        x.rocznik = 1899;
        x.pojSilnika = 4.3F;
        x.sprOgraniczenie(1899);
        x.oblicz(50,4.3F);

        Samochod y = new Samochod();
        y.marka = "Nissan";
        y.rocznik = 2011;
        y.pojSilnika = 20.2F;
        y.sprOgraniczenie(2011);
        y.oblicz(300,20.2F);
        Samochody.add( p.marka +" "+ Integer.toString(p.rocznik) +" "+ Float.toString(p.pojSilnika) + " " + Float.toString(p.spalanie));
        Samochody.add( x.marka +" "+ Integer.toString(x.rocznik) +" "+ Float.toString(x.pojSilnika) + " " + Float.toString(x.spalanie));
        Samochody.add( y.marka +" "+ Integer.toString(y.rocznik) +" "+ Float.toString(y.pojSilnika) + " " + Float.toString(y.spalanie));
        //String Auto = (String)Samochody.get(0);
        int i;
        for(i=0;i<Samochody.size();i++)
        {
            System.out.println(Samochody.get(i));
        }
    }
}
