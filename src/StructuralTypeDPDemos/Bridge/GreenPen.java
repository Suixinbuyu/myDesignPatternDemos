package StructuralTypeDPDemos.Bridge;

public class GreenPen implements DrawAPI {
    @Override
    public void draw(int radius, int x, int y) {
        System.out.println("使用绿色的笔画: radius" + radius + "," + x + "," + y);
    }
}
