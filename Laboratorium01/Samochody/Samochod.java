package pl.edu.uwm.wmii.rafalzulewski.laboratorium01;

public class Samochod {
    String marka;
    int rocznik;
    float pojSilnika;
    int trasa;
    float spalanie;
    void sprOgraniczenie(int rocznik) {
        if(rocznik>=1900 && rocznik<=2018){
            System.out.println("Rocznik samochodu jest prawidlowy");
        }
        else
        {
            System.out.println("Nie ma samochodu z takim rocznikiem");
        }
    }
    void oblicz(int trasa,float pojSilnika){
        spalanie=trasa*5*pojSilnika;
        System.out.println(spalanie);
    }
}

