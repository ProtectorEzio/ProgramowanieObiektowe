public class KontoPrywatne extends Konto {
    private float wynagrodzenie;
    private float bonusySocialne;

    public KontoPrywatne(float SaldoPoczatkowe ,float SaldoKoncowe,float Przelew,
                         float Wpłata,float Wypłata,int WypłataBankomat,
                         float PłatnoscKarta,float wynagrodzenie,float bonusySocialne){
        super(SaldoPoczatkowe,SaldoKoncowe,Przelew,Wpłata,Wypłata,WypłataBankomat,PłatnoscKarta);
        this.wynagrodzenie=wynagrodzenie;
        this.bonusySocialne=bonusySocialne;
    }
    public float getWynagrodzenie() {
        return wynagrodzenie;
    }

    public void setWynagrodzenie(float wynagrodzenie){
        this.wynagrodzenie = wynagrodzenie;
    }

    public float getBonusySocialne() {
        return bonusySocialne;
    }

    public void setBonusySocialne(float bonusySocialne) {
        this.bonusySocialne=bonusySocialne;
    }

    @Override
    public String toString() {
        return super.toString() +
                "wynagrodzenie: " + wynagrodzenie +
                ",\nbonusy socjalne: " + bonusySocialne;
    }
}
