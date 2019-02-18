package StructuralTypeDPDemos.Decorator;
/** 
* @Description: 装饰者模式,其作用往往是给原来的功能添加多个小功能,
 * 代理模式也可以实现功能的增强,但是不容易实现多个功能的增强,
* @Author: xjp
* @Date: 2019/2/18 
*/ 

public class App {
    public static void main(String[] args) {
        Beverage greenTea = new GreenTea();
        //加 lemon
        greenTea = new Lemon(greenTea);
        //再加Mongo
        greenTea= new Mongo(greenTea);

        System.out.println(greenTea.getDescription());
        System.out.println(greenTea.cost());

        System.out.println("==========================");
        //红茶加双份的lemon和Mongo
        Beverage blackTea = new BlackTea();
        blackTea = new Mongo(new Mongo(new Lemon(new Lemon(blackTea))));
        System.out.println(blackTea.getDescription());
        System.out.println(blackTea.cost());


    }
}
