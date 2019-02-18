package StructuralTypeDPDemos.Bridge;

public class Rectangle extends Shape {
    private int x;
    private int y;


    protected Rectangle(int x, int y, DrawAPI drawapi) {
        super(drawapi);
        this.x = x;
        this.y = y;

    }

    @Override
    public void draw() {
        drawapi.draw(0,x,y);
    }
}
