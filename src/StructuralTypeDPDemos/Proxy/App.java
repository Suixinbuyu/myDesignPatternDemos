package StructuralTypeDPDemos.Proxy;

/**
 * 代理模式
 * 可以起到"方法包装"和"方法增强" 的功能
 * 在某些情况下,一个客户不想或者不能直接引用另一个对象,代理对象可以在中间起到中介作用
 */
public class App {
    public static void main(String[] args) {
        FoodService foodService = new FoodServiceProxy();
        foodService.makeChicken();
        System.out.println();
    }
}
