import java.util.*;

public class TeaShop implements Shop {
    List<Bubble> bubbleslist = new ArrayList<Bubble>();
    List<Coconut> coconutslist = new ArrayList<Coconut>();

    private void addingredient(Bubble bubble) {
        bubbleslist.add(bubble);
    }

    private void addingredient(Coconut coconut) {
        coconutslist.add(coconut);
    }

    public void add(Ingredient in) {
        if (in instanceof Bubble) {
            addingredient((Bubble) in);
        } else if (in instanceof Coconut) {
            addingredient((Coconut) in);
        }
    }

    public void sale(String n, String ingredient) {
        try {
            Calendar calendar = Calendar.getInstance();
            int year = calendar.get(calendar.YEAR);
            int month = calendar.get(calendar.MONTH);
            int day = calendar.get(calendar.DATE);
            int frist = 0;
            if (ingredient == "Bubble") {
                if (!bubbleslist.isEmpty()) {
                    int i=-1;
                    for (i=0; i<bubbleslist.size(); ) {
                        Bubble bu= bubbleslist.get(i);
                        if (bu.year * 360 + bu.month * 30 + bu.day + bu.shelflife >= year * 360 + month * 30 + day) {
                            break;
                        }
                        else
                        {
                            bubbleslist.remove(i);
                        }
                    }
                    if(bubbleslist.isEmpty()) {
                        frist=1;
                    }
                    else
                    {
                        bubbleslist.remove(i);
                        System.out.println("谢谢您，欢迎您下次光临！");
                    }
                }
                else {
                    frist = 1;
                }
            } else if (ingredient == "Coconut") {
                if (!coconutslist.isEmpty()) {
                    int i=-1;
                    for (i=0; i<coconutslist.size(); ) {
                        Coconut bu= coconutslist.get(i);
                        if (bu.year * 360 + bu.month * 30 + bu.day + bu.shelflife >= year * 360 + month * 30 + day) {
                            break;
                        }
                        else
                        {
                            coconutslist.remove(i);
                        }
                    }
                    if(coconutslist.isEmpty()) {
                        frist=1;
                    }
                    else
                    {
                        coconutslist.remove(i);
                        System.out.println("谢谢您，欢迎您下次光临！");
                    }
                } else {
                    frist = 1;
                }
            }
            if(frist==1)
            {
                throw new SoldOutException();
            }
        }catch (SoldOutException e)
        {
            System.out.println("对不起！奶茶卖完咯，下次再来吧~");
            e.printStackTrace();
        }
    }
    }
interface Shop{
    void add(Ingredient in);
    void sale(String name,String ingredient);
}