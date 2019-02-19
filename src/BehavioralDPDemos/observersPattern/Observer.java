package BehavioralDPDemos.observersPattern;

/**
 * @Description: 定义观察者
 * @Author: xjp
 * @Date: 2019/2/19
 */

public abstract class Observer {
    //持有对主题的引用
    protected Topic topic;

    /**
     * @Description: 更新操作
     * @Param: []
     * @return: void
     * @Author: xjp
     * @Date: 2019/2/19
     */
    public abstract void update();
}
