package CreationTypeDPDemos.SingletonPattern;

/**
 * 懒汉模式
 */
public class Singleton_lazy {
    private Singleton_lazy(){}

    /**
     * 这里注意volatile关键字(使用了volatile的禁止指令重排序的功能)
     * volatile关键字有几种作用:
     * 1.内存可见性;
     * 2.禁止指令重排序;
     */
    private static volatile  Singleton_lazy instance = null;

    public static  Singleton_lazy getInstance(){
        if(instance == null){
            //加锁
            //synchronized的语义:
            //进入 synchronized 时，使得本地缓存失效，synchronized 块中对共享变量的读取必须从主内存读取；
            // 退出 synchronized 时，会将进入 synchronized 块之前和 synchronized 块中的写操作刷入到主存中
            synchronized (Singleton_lazy.class){
                //必须判断,不然会存在并发问题
                if(instance == null){
                    //instance 是 volatile 的，
                    // 那么对于 instance 的赋值操作（赋一个引用给 instance 变量）就不会和构造函数中的属性赋值发生重排序，
                    // 能保证构造方法结束后，才将此对象引用赋值给 instance。
                    instance =new Singleton_lazy();
                }
            }
        }
        return  instance;
    }

}
