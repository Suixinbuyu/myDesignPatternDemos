package CreationTypeDPDemos.PrototypePattern;

import java.io.*;


/**
 * 原型模式一般使用的较少,jdk提供的clone方法可以实现浅克隆,碰到对象引用的时候,克隆出的和原来的指向同一个对象,
 * 深克隆方法需要将对象实现序列化,再实现反序列化
 */
public class App {
    public static void main(String[] args) throws Exception {
        Test test = new Test(new Test2());
        Test clone = (Test) test.clone();
        //false
        System.out.println(test.equals(clone));
        //true
        System.out.println(test.getTest2().equals(clone.getTest2()));
        //使用深克隆方法可以避免引用的对象相同
        System.out.println("=================");
        Test3 test3 = new Test3(new Test4());
        Test3 test31 = test3.deepClone();
        //false
        System.out.println(test3.equals(test31));
        //false
        System.out.println(test3.getTest4().equals(test31.getTest4()));

    }
}

class Test implements Cloneable {
    private Test2 test2;

    public Test(Test2 test2) {
        this.test2 = test2;
        System.out.println("Test1");
    }

    public Test2 getTest2() {
        return test2;
    }

    public void setTest2(Test2 test2) {
        this.test2 = test2;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}

class Test2 {
    public Test2() {
        System.out.println("Test2");
    }
}

/**
 * 实现序列化接口来实现深克隆
 */
class Test3 implements Serializable {
    private Test4 test4;

    public Test4 getTest4() {
        return test4;
    }

    public void setTest4(Test4 test4) {
        this.test4 = test4;
    }

    public Test3(Test4 test4) {
        this.test4 = test4;
    }

    public Test3 deepClone() throws Exception {
        //将对象写入流中
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(byteArrayOutputStream);
        objectOutputStream.writeObject(this);

        //再将对象从流中取出
        ByteArrayInputStream byteInputStream = new ByteArrayInputStream(byteArrayOutputStream.toByteArray());
        ObjectInputStream objectInputStream = new ObjectInputStream(byteInputStream);
        return (Test3) objectInputStream.readObject();
    }
}

/**
 * 实现序列化接口来实现深克隆
 */
class Test4 implements Serializable {

}
