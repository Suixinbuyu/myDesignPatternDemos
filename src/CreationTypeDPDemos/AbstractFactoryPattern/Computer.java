package CreationTypeDPDemos.AbstractFactoryPattern;

public class Computer {
    private CPU cpu;
    private MainBoard mainBoard;

    public Computer(CPU cpu, MainBoard mainBoard) {
        this.cpu = cpu;
        this.mainBoard = mainBoard;
        System.out.println(cpu.toString()+mainBoard.toString());
    }

    @Override
    public String toString() {
        return "Computer{" +
                "cpu=" + cpu +
                ", mainBoard=" + mainBoard +
                '}';
    }
}
