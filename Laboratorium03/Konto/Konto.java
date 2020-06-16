import java.io.*;
import java.util.*;
import java.nio.*;
import java.text.SimpleDateFormat;


public class Konto {
    private float SaldoPoczatkowe;
    private float SaldoKoncowe;
    private float Przelew;
    private float Wpłata;
    private float Wypłata;
    private int WypłataBankomat;
    private float PlatnoscKarta;

    public Konto(float SaldoPoczatkowe,float SaldoKoncowe
                 ,float Przelew,float Wpłata,float Wypłata,
                 int WypłataBankomat,float PlatnoscKarta)
    {
        this.SaldoPoczatkowe = SaldoPoczatkowe;
        this.SaldoKoncowe = SaldoKoncowe;
        this.Przelew = Przelew;
        this.Wpłata = Wpłata;
        this.Wypłata = Wypłata;
        this.WypłataBankomat = WypłataBankomat;
        this.PlatnoscKarta = PlatnoscKarta;
    }

    public boolean ZapiszDoPliku(String path){
        try{
            FileWriter zapis = new FileWriter(path,true);
            StringBuffer bf = new StringBuffer();
            BufferedWriter wr = new BufferedWriter(zapis);
            PrintWriter out = new PrintWriter(wr);
            Calendar calendar = Calendar.getInstance();
            SimpleDateFormat df = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
            bf.append("Time stamp: " + df.format(calendar.getTime())+"\n");
            bf.append(this.toString());
            out.println(bf.toString());
            out.close();
            return true;
        }catch (IOException e){
            e.printStackTrace();
            return false;
        }
    }

    public float getSaldoPoczatkowe() {
        return SaldoPoczatkowe;
    }

    public void setSaldoPoczatkowe(float SaldoPoczatkowe) {
        this.SaldoPoczatkowe = SaldoPoczatkowe;
    }

    public float getSaldoKoncowe() {
        return SaldoKoncowe;
    }

    public void setSaldoKoncowe(float SaldoKoncowe) {
        this.SaldoKoncowe = SaldoKoncowe;
    }

    public float getPrzelew() {
        return Przelew;
    }

    public void setPrzelew(float Przelew) {
        this.Przelew = Przelew;
    }

    public float getWpłata() {
        return Wpłata;
    }

    public void setWpłata(float Wpłata) {
        this.Wpłata = Wpłata;
    }

    public float getWypłata() {
        return Wypłata;
    }

    public void setWypłata(float Wypłata) {
        this.Wypłata = Wypłata;
    }

    public int getWypłataBankomat(){
        return WypłataBankomat;
    }

    public void setWypłataBankomat(int WypłataBankomat){
        this.WypłataBankomat = WypłataBankomat;
    }

    public float getPlatnoscKarta(){
        return PlatnoscKarta;
    }

    public void setPlatnoscKarta(float PlatnoscKarta){
        this.PlatnoscKarta = PlatnoscKarta;
    }

    @Override
    public String toString() {
        return "Konto:\n" +
                "bilans startowy " + SaldoPoczatkowe +
                ",\nbilans koncowy " + SaldoKoncowe +
                ",\nprzelew " + Przelew +
                ",\nwplata " + Wpłata +
                ",\nwyplata " + Wypłata +
                ",\nwyplata z bankomatu " + WypłataBankomat +
                ",\nplatnosc karta " + PlatnoscKarta+"\n";

    }

}
