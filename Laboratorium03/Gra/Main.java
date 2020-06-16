public class Main {

    public static void main(String[] args) {

        WalkaPvP battle = new WalkaPvP();

        Łucznik legolas = new Łucznik("Legolas", 400 , 5, 13);

        Wojownik aragorn = new Wojownik("Aragorn", 500 , 3, 12);

        System.out.println(aragorn.toString());

        System.out.println("");

        System.out.println(legolas.toString());

        System.out.println("");

        battle.battle(aragorn, legolas);

        Łucznik goblin= new Łucznik("GoblinA",200,7,14);

        Wojownik ork = new Wojownik("OrkA", 300, 5, 15);

        System.out.println(ork.toString());

        System.out.println("");

        System.out.println(goblin.toString());

        System.out.println("");

        battle.battle(goblin,ork);

        WalkaPvE encounter = new WalkaPvE();

        PotwórMelee zombie=new PotwórMelee("Zgnilec",400,2,10);

        PotwórRanged jaszczur=new PotwórRanged("Reptiljanin",500,4,12);

        Wojownik leonidas = new Wojownik("Leonidas", 500 , 4, 12);

        System.out.println(leonidas.toString());

        System.out.println("");

        System.out.println(jaszczur.toString());

        System.out.println("");

        encounter.battle(leonidas,jaszczur);
    }
}
