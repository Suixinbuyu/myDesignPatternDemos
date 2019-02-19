package StructuralTypeDPDemos.DecoratorPattern;

public class Lemon extends Condiment {
    //重点:这里要传入具体的饮料,可以是没有被装饰的三原料,也可以是其他搭配好的茶
    private Beverage beverage;

    public Lemon(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        //开始装饰
        return beverage.getDescription() + "加lemon";
    }

    @Override
    public double cost() {
        //加lemon多加2元
        return beverage.cost() + 2;
    }
}
