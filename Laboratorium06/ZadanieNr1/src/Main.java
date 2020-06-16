public class Main {

    public static void main(String[] args) {
		RachunekBankowy saver1 = new RachunekBankowy();
		RachunekBankowy saver2 = new RachunekBankowy();
	    RachunekBankowy.setRocznaStopaProcentowa(0.04);
		saver1.stanKonta(2000);
		saver1.obliczMiesieczneOdsetki();
		saver1.obliczMiesieczneOdsetki();
		saver2.stanKonta(3000);
		saver2.obliczMiesieczneOdsetki();
		saver2.obliczMiesieczneOdsetki();
		RachunekBankowy.setRocznaStopaProcentowa(0.05);
		saver1.stanKonta(2000);
		saver1.obliczMiesieczneOdsetki();
		saver1.obliczMiesieczneOdsetki();
		saver2.stanKonta(3000);
		saver2.obliczMiesieczneOdsetki();
		saver2.obliczMiesieczneOdsetki();
    }
}
