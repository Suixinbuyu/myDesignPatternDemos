package StructuralTypeDPDemos.DecoratorPattern;

public class Coffee extends Beverage {
    @Override
    public String getDescription() {
        return "咖啡";
    }

    @Override
    public double cost() {
        return 30;
    }
}
