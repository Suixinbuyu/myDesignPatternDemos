package BehavioralDPDemos.observersPattern;

import java.util.ArrayList;
import java.util.List;

/**
 * @Description: 主题类
 * @Author: xjp
 * @Date: 2019/2/19
 */
public class Topic {
    private List<Observer> observers = new ArrayList<>();
    private int state;

    public int getState() {
        return state;
    }

    public void setState(int state) {
        this.state = state;
        //数据变更,通知观察者
        notifyObs();
    }

    public void attach(Observer observer) {
        observers.add(observer);
    }

    /**
     * @Description: 通知观察者
     * @Param: []
     * @return: void
     * @Author: xjp
     * @Date: 2019/2/19
     */
    public void notifyObs() {
        for (Observer observer : observers) {
            observer.update();
        }
    }
}
