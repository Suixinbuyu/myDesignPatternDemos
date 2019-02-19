package StructuralTypeDPDemos.ProxyPattern;

public class FoodServiceImpl implements FoodService {
    @Override
    public Food makeChicken() {
        Food f = new Chicken();
        f.setChicken("1g");
        f.setSpicy("3g");
        f.setSalt("1g");
        System.out.println(f.toString());
        return f;
    }

    @Override
    public Food makeNoodle() {
        Food f = new Noodle();
        f.setNoodle("1g");
        f.setSalt("4g");
        System.out.println(f.toString());
        return f;
    }
}
