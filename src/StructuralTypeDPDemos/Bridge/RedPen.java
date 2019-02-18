package StructuralTypeDPDemos.Bridge;

public class RedPen implements DrawAPI {
    @Override
    public void draw(int radius, int x, int y) {
        System.out.println("使用红色的笔画: radius" + radius + "," + x + "," + y);
    }
}
