public class MilkTea {
    protected String name;
    protected Ingredient ingredient;

    public MilkTea(String n,Ingredient ingredient1)
    {
        name=n;
        ingredient=ingredient1;
    }
//    @Override
    public String toString() {
        return "name:"+name+' '+"Ingredient:"+ingredient.toString();
    }
}
