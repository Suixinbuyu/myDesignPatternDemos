package CreationTypeDPDemos.AbstractFactoryPattern;

/**
 * 抽象工厂模式
 * 当设计到产品族的时候,需要引入抽象工厂模式,能够解决不同产品种类中的兼容性问题
 * 兼容性问题描述:
 * 假如cpu由cpu工厂生产,主板由主板工厂生产,那么intel的cpu就有可能和apd的主板搭配在一起,
 * 但是可能引发不兼容问题,继而,
 * 可以将工厂抽象为电脑生产工厂,Intel工厂生产Intel的cpu和主板,amd生产amd的cpu和主板,解决兼容性问题
 *
 * 抽象工厂模式的缺点:
 * 假如此时再加个生产显示器的功能,那么intel和amd工厂都需要新加功能,也就是修改了原来的方法,违反了设计模式的
 * 对修改关闭,对扩展开放的原则.
 *
 *
 */
public class App {
    public static void main(String[] args) {
        //选定一个大厂
        ComputerFactory intelFactory = new IntelFactory();
        //大厂造cpu
        CPU cpu = intelFactory.makeCPU();
        //大厂造主板
        MainBoard mainBoard = intelFactory.makeMainBoard();
        //同一个厂的设备组合成电脑,不存在兼容性问题
        Computer computer = new Computer(cpu,mainBoard);

    }
}
