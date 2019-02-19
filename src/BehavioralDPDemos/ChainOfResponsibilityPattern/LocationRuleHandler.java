package BehavioralDPDemos.ChainOfResponsibilityPattern;

public class LocationRuleHandler extends RuleHandler {
    @Override
    public void apply(Context context) {
        boolean supportLocation = context.isSupportLocation(context.getLocation());
        if (supportLocation) {
            System.out.println("哈哈,本地区很幸运参加了该活动");
            if (this.getSuccessor() != null) {
                this.getSuccessor().apply(context);
            }
        } else {
            throw new RuntimeException("很抱歉,该地区无法参与该活动");
        }
    }
}
