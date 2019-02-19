package BehavioralDPDemos.statusPattern;

public class DeductState implements State {
    @Override
    public void doAction(Context context) {
        System.out.println("商品卖出,准备减库存");
        context.setState(this);
        //执行减库存操作
        //....
    }

    @Override
    public String toString() {
        return "deductState";
    }
}
