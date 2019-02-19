package BehavioralDPDemos.TemplatePattern;

public abstract class AbstractTemplate {
    //模板方法
    public void templateMethod() {
        init();
        apply();
        end();
    }

    protected void init() {
        System.out.println("init抽象层已经实现,子类也可以选择重写");
    }

    protected abstract void apply();

    protected abstract void end();
}
