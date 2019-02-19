package StructuralTypeDPDemos.BridgePattern;
/**
* @Description: 桥梁模式
 * 优点在于非常容易拓展
 * 便于解耦
* @Author: xjp
* @Date: 2019/2/18
*/

public class App{
    public static void main(String[] args) {
        Shape greenCircle = new Circle(10, new GreenPen());
        Shape redRectangle = new Rectangle(1, 2, new RedPen());
        greenCircle.draw();
        redRectangle.draw();
    }
}