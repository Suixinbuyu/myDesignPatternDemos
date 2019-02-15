package CreationTypeDPDemos.Factory;

public class App {
    public static void main(String[] args) {
        //首先选择一个合适的工厂
        FoodFactory chineseFoodFactory = new ChineseFoodFactory();
        //由上一步所选择的工厂造出不同的对象
        chineseFoodFactory.makeFood("A");

    }
}
