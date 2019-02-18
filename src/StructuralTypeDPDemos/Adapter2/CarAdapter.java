package StructuralTypeDPDemos.Adapter2;

public class CarAdapter extends Airplane implements Transportation {
    private Airplane airplane = new Airplane();

    @Override
    public void reversing() {
        System.out.println("汽车倒车");
    }

    @Override
    public void speedUp() {
        super.speedUp();
    }

    @Override
    public void brake() {
        super.brake();
    }
}
