public class Main {

    public static void main(String[] args) {
        IntegerSet a=new IntegerSet();
        IntegerSet b=new IntegerSet();
        System.out.println("Zbiór a jest pusty "+ a);
        System.out.println("Dodawanie pustych zbiorów zwróci nam pusty zbiór "+ IntegerSet.union(a,b));
        IntegerSet pełen = new IntegerSet();
        IntegerSet.pełenzbiór(pełen);
        System.out.println("Pełen zbiór "+ pełen);
        System.out.println("Dodawanie zbioru pełnego do zbioru pustego "+ IntegerSet.union(pełen,a));
        a.insertElement(0);
        System.out.println(a);
        System.out.println("Równość a i b "+ a.isEqual(b));
        System.out.println("Równość b i a "+ b.isEqual(a));
        b.insertElement(0);
        System.out.println("Równość b i a "+ a.isEqual(b));
        a.deleteElement(0);
        System.out.println("Zbiór a jest pusty "+ a);


    }
}
