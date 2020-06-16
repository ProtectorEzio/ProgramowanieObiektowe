public abstract class Potwór {

    private String name;
    private double hp;
    private int tacticPoints;

    public Potwór(String name, double hp, int tacticPoints)throws RuntimeException {
        if (hp < 0 || hp > 10000){
            throw new RuntimeException("Hp value is in %, so between 0-1.00");
        }
        this.name = name;
        this.hp = hp;
        this.tacticPoints = tacticPoints;
    }

    public abstract double countAttack();

    public int getTacticPoints() {
        return tacticPoints;
    }

    public void setTacticPoints(int tacticPoints) {
        this.tacticPoints = tacticPoints;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getHp() {
        return hp;
    }

    public void setHp(double hp)throws RuntimeException {
        if (hp < 0 || hp > 10000){
            throw new RuntimeException("Hp value is in %, so between 0-1.0");
        }
        this.hp = hp;
    }
}
