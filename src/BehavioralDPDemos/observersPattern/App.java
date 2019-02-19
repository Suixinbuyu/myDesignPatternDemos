package BehavioralDPDemos.observersPattern;

import BehavioralDPDemos.observersPattern.observer_jdkTools.BinaryObserver2;
import BehavioralDPDemos.observersPattern.observer_jdkTools.Topic2;

/**
 * @Description: 观察者模式, 两个操作, 观察者关心自己的主题和主题的变化, 主题有数据变化后通知观察者们
 * @Author: xjp
 * @Date: 2019/2/19
 */

public class App {
    public static void main(String[] args) throws InterruptedException {
        //定义一个主题
        Topic topic = new Topic();
        //按如下加入观察者,会出现重复,观察者构造方法会自动将自身添加进topic的观察者列表
        //topic.attach(new BinaryObserver(topic));
        //topic.attach(new HexaObserver(topic));
        new BinaryObserver(topic);
        new HexaObserver(topic);
        //模拟变化
        topic.setState(2);
        Thread.sleep(1000);
        System.out.println("=====================");
        //使用jdk提供的工具
        Topic2 topic2 = new Topic2();
        BinaryObserver2 binaryObserver2 = new BinaryObserver2();
        topic2.addObserver(binaryObserver2);
        topic2.setState(2);

    }
}
