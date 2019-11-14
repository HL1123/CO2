public class Main {
    public static void main(String[] args) {
        Bubble bubble=new Bubble(2019,11,9);
        Coconut coconut=new Coconut(2019,11,9);
        MilkTea milkTea=new MilkTea("great tea",bubble);
        TeaShop teaShop1=new TeaShop();
        teaShop1.add(bubble);
        teaShop1.add(coconut);
        teaShop1.sale("great tea","Bubble");
        teaShop1.sale("great tea","Coconut");
        teaShop1.sale("great tea","Bubble");
        teaShop1.sale("great tea","Coconut");
    }
}
