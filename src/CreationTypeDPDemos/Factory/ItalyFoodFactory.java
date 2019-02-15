package CreationTypeDPDemos.Factory;

import CreationTypeDPDemos.simpleFactory.Food;

public class ItalyFoodFactory implements FoodFactory {
    @Override
    public Food makeFood(String name) {
        if (name.equalsIgnoreCase("A")){
            return  new ItalyFoodA();
        }else if (name.equalsIgnoreCase("B")){
            return  new ItalyFoodB();
        }else {
            return  null;
        }
    }
}
