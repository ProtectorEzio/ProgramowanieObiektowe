import java.math.BigDecimal;
import java.math.RoundingMode;

public class WalkaPvP {

    public void battle(Bohater a, Bohater b){
        double życiea=a.getHp()/a.getHp()*100;
        System.out.println("Życie "+ a.getName()+" = "+życiea+"%");
        double życieb=b.getHp()/b.getHp()*100;
        System.out.println("Życie "+ b.getName()+" = "+życieb+"%");
        for (;;) {
            double aAtak = round(a.countAttack() * 0.005);
            double bAtak = round(b.countAttack() * 0.005);
            double aHpPoAtaku = a.getHp() - bAtak;
            double bHpPoAtaku = b.getHp() - aAtak;
            System.out.println("");
            System.out.println(a.getName() + " atakuje " + b.getName() + "a za " + round(aAtak));
            try {
                b.setHp(bHpPoAtaku);
            } catch (RuntimeException e) {
                b.setHp(0);
            }
            if (b.getHp() < 0.01){
                System.out.println("");
                System.out.println(a.getName()+ " zwycięża");
                break;
            }
            System.out.println("");
            System.out.println("Życie "+ b.getName() + "a wynosi: " + round(b.getHp()));
            System.out.println("");
            System.out.println(b.getName() + " atakuje " + a.getName() + "a za " + round(bAtak));
            try {
                a.setHp(aHpPoAtaku);
            } catch (RuntimeException e) {
                a.setHp(0);
            }
            System.out.println("");
            System.out.println("Życie "+a.getName() + "a wynosi: " + round(a.getHp()));
            if (a.getHp() < 0.01){
                System.out.println("");
                System.out.println(b.getName()+ " zwycięża");
                break;
            }
        }
    }

    private static double round(double value) {
        BigDecimal bd = new BigDecimal(value);
        bd = bd.setScale(2, RoundingMode.HALF_UP);
        return bd.doubleValue();
    }
}