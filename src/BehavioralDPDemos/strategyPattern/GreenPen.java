package BehavioralDPDemos.strategyPattern;

public class GreenPen implements Strategy {
    @Override
    public void draw(int radius, int x, int y) {
        System.out.println("用蓝笔画图: radius" + radius + ", x:" + x + ",y" + y);
    }
}
