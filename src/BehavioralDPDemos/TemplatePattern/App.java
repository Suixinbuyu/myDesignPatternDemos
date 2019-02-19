package BehavioralDPDemos.TemplatePattern;
/**
* @Description: 模板模式,在继承结构中很有用,模板方法只负责定义第一步做什么,
 * 第二部做什么,第三步做什么,具体实现可以交给子类去来实现
* @Author: xjp
* @Date: 2019/2/19 
*/ 

public class App {
    public static void main(String[] args) {
        AbstractTemplate template = new ConcreteTemplate();
        //调用模板方法
        template.templateMethod();
    }
}
