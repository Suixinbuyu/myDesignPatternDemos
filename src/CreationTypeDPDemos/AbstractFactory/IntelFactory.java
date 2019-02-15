package CreationTypeDPDemos.AbstractFactory;

public class IntelFactory implements ComputerFactory {
    @Override
    public CPU makeCPU() {
        return new IntelCPU();
    }

    @Override
    public MainBoard makeMainBoard() {
        return new IntelMainBoard();
    }
}
