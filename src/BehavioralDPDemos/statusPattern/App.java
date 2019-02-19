package BehavioralDPDemos.statusPattern;
/**
* @Description: 状态模式,能够从复杂的嵌套条件里面脱离,
 * 优点:让每一个状态对修改关闭,允许对象在内部状态改变时,改变它的行为,使对象看起来像是修改了它的类
 *
* @Author: xjp
* @Date: 2019/2/19
*/

public class App {
    public static void main(String[] args) {
        Context context = new Context("iphoneX");
        //减库存
        State state = new DeductState();
        state.doAction(context);

        //加库存
        State state1 = new RevertState();
        state1.doAction(context);

        context.getState().toString();
    }
}
