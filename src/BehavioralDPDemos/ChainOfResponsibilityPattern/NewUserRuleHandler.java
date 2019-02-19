package BehavioralDPDemos.ChainOfResponsibilityPattern;

public class NewUserRuleHandler extends RuleHandler {
    @Override
    public void apply(Context context) {
        try {
            if (context.isNewuser()) {
                System.out.println("嘿嘿,是新用户,可以参加活动");
                //是否有后续节点
                if (this.getSuccessor() != null) {
                    this.getSuccessor().apply(context);
                }
            }
        } catch (Exception e) {

        }
    }
}
