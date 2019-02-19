package CreationTypeDPDemos.SingletonPattern;

/**
 * 饿汉模式
 *
 * 缺点:类加载时就初始化,比较浪费内存
 * 优点:没有加锁,执行效率会高
 * 基于clasloader机制避免了许多多线程同步的问题
 */
public class Singleton {
    //首先不能 new SingletonPattern
    private  Singleton(){ }

    //创建私有静态实例,这个类在第一次创建时候就会进行创建
    private static  Singleton instance = new Singleton();

    public  static  Singleton getInstance(){
        System.out.println("这里是饿汉模式....");
        return  instance;
    }

}
