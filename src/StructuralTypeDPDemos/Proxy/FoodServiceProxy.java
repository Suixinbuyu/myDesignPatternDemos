package StructuralTypeDPDemos.Proxy;

/**
 * 代理类,
 */
public class FoodServiceProxy implements  FoodService {
    //真实实现类
    private FoodServiceImpl foodServiceImpl = new FoodServiceImpl();
    @Override
    public Food makeChicken() {
        System.out.println("制作鸡肉");
        Food food = foodServiceImpl.makeChicken();
        System.out.println("制作鸡肉完成,加点其他调料");
        //增强
        food.setSpicy("50g");
        return food;
    }

    @Override
    public Food makeNoodle() {
        System.out.println("制作拉面");
        Food food = foodServiceImpl.makeNoodle();
        System.out.println("制作拉面完成");
        return food;
    }
}
