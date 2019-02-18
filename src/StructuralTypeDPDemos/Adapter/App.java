package StructuralTypeDPDemos.Adapter;

/**
 * 适配器模式,(对象适配模式)
 */
public class App {
    public static void main(String[] args) {
        //有一只野鸡
        Cock cock = new WildCock();
        //将野鸡适配成了鸭子
        Duck duck = new CockAdapter(cock);
        duck.quack();
        duck.fly();
    }
}
