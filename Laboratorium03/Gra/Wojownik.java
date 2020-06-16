public class Wojownik extends Bohater {


    private int strength;

    public Wojownik(String name, double hp, int tacticPoints, int strength) {
        super(name, hp, tacticPoints);
        this.strength = strength;
    }

    public Wojownik() {
        super("OrkA", 100, 1);
        this.strength = 15;
    }

    @Override
    public double countAttack() {
        double hpMod = this.getHp();
        if (hpMod < 20) {
            hpMod = this.getHp() + (this.getHp() / 2);
        }
        return this.getStrength() * hpMod * this.getTacticPoints();
    }

    public int getStrength() {
        return strength;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }

    @Override
    public String toString() {
        return "Imię: " + this.getName() +
                "\nSiła: " + this.getStrength() +
                "\nHp: " + this.getHp() +
                "\nPunkty Taktyk: " + this.getTacticPoints();
    }
}