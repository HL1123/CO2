import java.util.Calendar;

public abstract class Ingredient {
    protected String name;
//    protected Calendar calendar;
    protected int year;
    protected int month;
    protected int day;
    protected int shelflife;
    public Ingredient(String n,int y,int m,int d,int s)
    {
        year=y;
        month=m;
        day=d;
        name=n;
        shelflife=s;
    }

//    @Override
    public String toString() {
        return "name:"+name+' '+"year:"+year+' '+"month:"+month+' '+"day:"+day+' '+"shelf life"+shelflife;
    }
}
