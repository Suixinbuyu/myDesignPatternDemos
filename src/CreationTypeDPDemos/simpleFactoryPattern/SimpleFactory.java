package CreationTypeDPDemos.simpleFactoryPattern;

/**
 * @author xjp
 * @date 2019年2月15日 10:15:33
 * 简单工厂模式
 * 一个工厂类 XxxFactory，里面有一个静态方法，
 * 根据我们不同的参数，返回不同的派生自同一个父类（或实现同一接口）的实例对象
 */
public class SimpleFactory {
    public static Food makeFood(String name) {
        if (name.equalsIgnoreCase("noodle")) {
            Food noodle = new LanZhouNoodle();
            noodle.addSpicy("more");
            return noodle;
        } else if (name.equalsIgnoreCase("chicken")) {
            Food chicken = new HuangMenChicken();
            chicken.addCondiment("potato");
            return chicken;
        } else {
            return null;
        }
    }
}
