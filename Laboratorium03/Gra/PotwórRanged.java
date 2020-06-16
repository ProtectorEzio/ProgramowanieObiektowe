public class PotwórRanged extends Potwór {

    private int dexterity;

    public PotwórRanged(String name, double hp, int tacticPoints, int dexterity) {
        super(name, hp, tacticPoints);
        this.dexterity = dexterity;
    }

    public PotwórRanged() {
        super("GoblinA", 100, 3);
        this.dexterity = 15;
    }

    @Override
    public double countAttack() {
        return (double) this.getDexterity() * this.getTacticPoints() * this.getHp();
    }

    public int getDexterity() {
        return dexterity;
    }

    public void setDexterity(int dexterity) {
        this.dexterity = dexterity;
    }

    @Override
    public String toString() {
        return "Imię: " + this.getName() +
                "\nZręczność: " + this.getDexterity() +
                "\nHp: " + this.getHp() +
                "\nPunkty Taktyk: " + this.getTacticPoints();
    }
}