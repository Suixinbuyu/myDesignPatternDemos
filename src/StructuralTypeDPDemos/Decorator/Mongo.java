package StructuralTypeDPDemos.Decorator;

public class Mongo extends Condiment {
    private Beverage beverage;

    public Mongo(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + "加Mongo";
    }

    @Override
    public double cost() {
        return beverage.cost() + 5;
    }
}
