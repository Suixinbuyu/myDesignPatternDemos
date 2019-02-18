package StructuralTypeDPDemos.FacadePattern;
/** 
* @Description: 门面模式,也叫外观模式
 * 优点在于客户端调用时不用再关注实例化应该使用哪个实现类,直接调用门面提供的方法就可以了
* @Author: xjp
* @Date: 2019/2/18 
*/ 

public class App {
    public static void main(String[] args) {
        //正常调用
        Shape circle = new Circle();
        circle.draw();
        System.out.println("-----------------");
        //使用门面模式调用
        new ShapeMaker().drawCircle();

    }
}
