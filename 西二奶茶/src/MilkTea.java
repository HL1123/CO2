public class MilkTea {
    protected String name;
    protected String ingredient;

    public MilkTea(String n,String st)
    {
        name=n;
        ingredient=st;
    }
//    @Override
    public String toString() {
        return "name:"+name+' '+"Ingredient:"+ingredient;
    }
}
