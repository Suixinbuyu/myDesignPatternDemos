package BehavioralDPDemos.observersPattern;

/**
 * @Description: 定义一个具体的观察者
 * @Author: xjp
 * @Date: 2019/2/19
 */

public class BinaryObserver extends Observer {

    public BinaryObserver(Topic topic) {
        this.topic = topic;
        this.topic.attach(this);
    }

    @Override
    public void update() {
        String s = Integer.toBinaryString(topic.getState());
        System.out.println("订阅的数据状态发生变化,新的数据处理为二进制是:" + s);
    }
}
