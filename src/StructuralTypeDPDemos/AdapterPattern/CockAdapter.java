package StructuralTypeDPDemos.AdapterPattern;

public class CockAdapter implements Duck {
    Cock cock;
    //将鸡适配成鸭子来使用
    public  CockAdapter(Cock cock){
        this.cock = cock;
    }
    //实现鸭的嘎嘎叫
    @Override
    public void quack() {
        //内部其实是一只鸡在咕咕叫
        cock.gobble();
    }


    @Override
    public void fly() {
        cock.fly();
    }
}
