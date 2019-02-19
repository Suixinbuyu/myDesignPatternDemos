package BehavioralDPDemos.observersPattern;

public class HexaObserver extends Observer {
    public HexaObserver(Topic topic) {
        this.topic = topic;
        this.topic.attach(this);
    }

    @Override
    public void update() {
        String s = Integer.toHexString(topic.getState());
        System.out.println("订阅的数据发生变化,新的数据处理为16进制为:" + s);
    }
}
