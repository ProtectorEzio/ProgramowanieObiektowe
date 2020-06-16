package pl.edu.uwm.wmii.rafalzulewski.laboratorium00;

public class Main {

    public static void main(String[] args) {
	int wynik=0;
	int iloczyn=1;
	int liczba=0;
	for(int i=1;i<11;i++)
	    {
	        wynik=iloczyn*i;
	        iloczyn=wynik;
	        System.out.println(iloczyn);
	    }
    }
}
// inna wersja
//	for(int i=1;i<11;i++)
//        {
//            if(i==1)
//            {
//                iloczyn=1;
//                wynik=iloczyn*i;
//            }
//            else
//            {
//                iloczyn=wynik;
//                wynik=iloczyn*i;
//                iloczyn=wynik;
//            }
//        }
//        System.out.println(iloczyn);
