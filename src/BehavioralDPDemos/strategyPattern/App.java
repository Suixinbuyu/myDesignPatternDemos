package BehavioralDPDemos.strategyPattern;

/**
 * @Description: 策略模式,与结构型设计模式中的桥梁模式有点类似,不同点在于桥梁模式的抽象程度更高,耦合度更低,
 * 思考:策略模式与一般的代理模式感觉有点类似
 * @Author: xjp
 * @Date: 2019/2/19
 */

public class App {
    public static void main(String[] args) {
        Context context = new Context(new RedPen());
        context.executeDraw(1, 2, 3);
    }
}
