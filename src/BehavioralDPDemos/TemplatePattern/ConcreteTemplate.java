package BehavioralDPDemos.TemplatePattern;

public class ConcreteTemplate extends AbstractTemplate {
    @Override
    protected void apply() {
        System.out.println("具体的apply实现方案");
    }

    @Override
    protected void end() {
        System.out.println("具体的end实现方案");

    }
}
