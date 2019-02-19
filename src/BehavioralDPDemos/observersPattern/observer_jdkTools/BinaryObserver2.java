package BehavioralDPDemos.observersPattern.observer_jdkTools;

import java.util.Observable;
import java.util.Observer;
/**
* @Description: 观察者的实现,这里采用jdk提供的observer接口
* @Author: xjp
* @Date: 2019/2/19
*/

public class BinaryObserver2 implements Observer {
    @Override
    public void update(Observable o, Object arg) {

        String s = Integer.toBinaryString((int) arg);
        System.out.println("主题发生变化,结果是:"+s);
    }
}
