package StructuralTypeDPDemos.AdapterPattern;

public class WildCock implements Cock {
    @Override
    public void gobble() {
        System.out.println("咕咕叫");
    }

    @Override
    public void fly() {
        System.out.println("鸡会飞....");
    }
}
