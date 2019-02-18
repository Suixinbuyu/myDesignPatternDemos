package StructuralTypeDPDemos.Bridge;

public class Circle extends Shape {
    private int radius;
    /**
     * @param drawapi
     * @Description:
     * @Param: [drawapi]
     * @return:
     * @Author: xjp
     * @Date: 2019/2/18
     */
    protected Circle( int radius,DrawAPI drawapi) {
        super(drawapi);
        this.radius =radius;

    }

    @Override
    public void draw() {
    drawapi.draw(radius,0,0);
    }
}
