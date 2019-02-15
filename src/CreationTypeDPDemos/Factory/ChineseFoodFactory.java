package CreationTypeDPDemos.Factory;

import CreationTypeDPDemos.simpleFactory.Food;

public class ChineseFoodFactory implements FoodFactory {
    @Override
    public Food makeFood(String name) {
        if (name.equalsIgnoreCase("A")){
            return  new ChineseFoodA();
        }else if (name.equalsIgnoreCase("B")){
            return  new ChineseFoodB();
        }else {
            return  null;
        }
    }
}
