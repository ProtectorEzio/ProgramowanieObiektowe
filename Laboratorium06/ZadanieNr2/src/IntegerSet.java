public class IntegerSet {
    private static final int Max=100;
    private boolean[]booleanArray=new boolean[Max];

    public static IntegerSet union(IntegerSet a,IntegerSet b)
    {
        IntegerSet union= new IntegerSet();
        System.arraycopy(a.booleanArray,0,union.booleanArray,0,Max);
        for(int i=0;i<Max;i++)
        {
            if(b.booleanArray[i])
            {
                union.booleanArray[i]=true;
            }
        }
        return union;
    }
    public static IntegerSet intersection(IntegerSet a,IntegerSet b)
    {
        IntegerSet intersection=new IntegerSet();
        for(int i=0;i<Max;i++)
        {
            intersection.booleanArray[i]=a.booleanArray[i] && b.booleanArray[i];
        }
        return intersection;
    }
    public void insertElement(int element)
    {
        booleanArray[element]=true;
    }
    public void deleteElement(int element)
    {
        booleanArray[element]=false;
    }
    public String toString()
    {
        boolean isEmpty=true;
        StringBuilder string=new StringBuilder();
        string.append("{");
        for(int i=0;i<Max;i++)
        {
            if(booleanArray[i])
            {
                isEmpty=false;
                string.append(i).append(' ');
            }
        }
        return isEmpty ? "   " : string.append('}').toString();
    }
    public boolean isEqual(IntegerSet a)
    {
        for(int i=0;i<Max;i++)
        {
            if(booleanArray[i]!=a.booleanArray[i])
            {
                return false;
            }
        }
        return true;
    }
    public static void pełenzbiór(IntegerSet a)
    {
        for(int i=0;i<Max;i++)
        {
            a.booleanArray[i]=true;
        }
    }
}