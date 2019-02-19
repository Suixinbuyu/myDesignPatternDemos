package StructuralTypeDPDemos.BridgePattern;

/**
 * @Description:
 * @Author: xjp
 * @Date: 2019/2/18
 */

public abstract class Shape {
    protected DrawAPI drawapi;

    /**
     * @Description:
     * @Param: [drawapi]
     * @return:
     * @Author: xjp
     * @Date: 2019/2/18
     */
    protected Shape(DrawAPI drawapi) {
        this.drawapi = drawapi;
    }

    public abstract void draw();
}
