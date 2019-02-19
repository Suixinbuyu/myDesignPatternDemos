package BehavioralDPDemos.observersPattern.observer_jdkTools;

import java.util.Observable;
/**
* @Description: 主题,这里采用继承jdk提供的observable类来实现
* @Author: xjp
* @Date: 2019/2/19
*/

public class Topic2 extends Observable {
    private int state;

    public int getState() {
        return state;
    }

    public void setState(int state) {
        this.state = state;
        notifyObs();
    }

    public void  notifyObs(){
        System.out.println(this.getState());
        this.setChanged();
        this.notifyObservers(state);
    }
}
