package CreationTypeDPDemos.Singleton;

/**
 * 嵌套类实现单例,最经典,推荐使用
 */
public class Singleton_best {
    private Singleton_best() {
        System.out.println("test best");
    }

    /**
     * 主要是使用了嵌套类可以访问外部类的静态属性和静态方法的特性;
     * 静态的内部类称为嵌套类,非静态的称为内部类
     */
    private static class Holder {
        private Holder() {
            System.out.println("testholder");
        }
        private static Singleton_best instance = new Singleton_best();
    }

    public static Singleton_best getInstance() {
        return Holder.instance;
    }
}
