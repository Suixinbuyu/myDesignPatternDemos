package CreationTypeDPDemos.FactoryPattern;

import CreationTypeDPDemos.simpleFactoryPattern.Food;

/**
 * 工厂模式
 * 核心在于第一步选好我们需要的工厂
 */
public interface FoodFactory {
        Food makeFood(String name);
}
