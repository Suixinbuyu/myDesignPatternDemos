package StructuralTypeDPDemos.BridgePattern;

/**
 * ctrl+{}  跳转大括号前后
 *
 */
public class BluePen implements DrawAPI {
    @Override
    public void draw(int radius, int x, int y) {
        System.out.println("使用蓝色的笔画: radius" + radius + "," + x + "," + y);
    }
}
