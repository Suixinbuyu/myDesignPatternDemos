package BehavioralDPDemos.ChainOfResponsibilityPattern;

public abstract class RuleHandler {
    //后续节点
    protected   RuleHandler successor;

    public RuleHandler getSuccessor() {
        return successor;
    }

    public void setSuccessor(RuleHandler successor) {
        this.successor = successor;
    }

    public abstract void  apply(Context context);


}
