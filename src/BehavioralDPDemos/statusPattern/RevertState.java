package BehavioralDPDemos.statusPattern;

public class RevertState implements State {
    @Override
    public void doAction(Context context) {
        System.out.println("商品补充库存");
        context.setState(this);
        //执行增加库存的操作
        //...
    }

    @Override
    public String toString() {
        return "revertState";
    }
}
