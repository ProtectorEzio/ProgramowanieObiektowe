public class Main {

    public static void main(String[] args) {
	Konto konto = new KontoPrywatne(2000,500,1500,250,250,200,200,400,1000);

	System.out.println(konto);
	konto.ZapiszDoPliku("konta.txt");
    }
}
