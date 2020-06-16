package pl.edu.uwm.wmii.rafalzulewski.laboratorium00;

public class Main {

    public static void main(String[] args) {
	double saldo=1000;
	double proc=0.06;
	double stan=0;
	for(int i=0;i<3;i++)
        {
            stan=saldo*proc+saldo;
            saldo=stan;
            System.out.println(saldo);
        }
    }
}
