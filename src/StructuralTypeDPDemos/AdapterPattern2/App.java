package StructuralTypeDPDemos.AdapterPattern2;

/**
 * @author
 * 适配器模式,类继承
 * 对象适配和类适配的区别比较:
 * 1.类适配属于静态实现,对象适配属于组合的动态实现,对象适配需要多实例化一个对象;
 * 2.对象适配使用的比较多
 *
 */

public class App {
    public static void main(String[] args) {
        Transportation transportation = new CarAdapter();
        transportation.brake();
        transportation.speedUp();

    }
}
