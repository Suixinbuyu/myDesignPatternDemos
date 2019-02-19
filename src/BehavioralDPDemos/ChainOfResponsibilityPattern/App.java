package BehavioralDPDemos.ChainOfResponsibilityPattern;
/**
* @Description: 责任链模式  先定义好一个链表,然后在通过任一节点后,如果此节点后面还有其他节点,传递下去
* @Author: xjp
* @Date: 2019/2/19
*/

public class App {
    public static void main(String[] args) {
        RuleHandler newUserHandler = new NewUserRuleHandler();
        RuleHandler locationHandler = new LocationRuleHandler();
        newUserHandler.setSuccessor(locationHandler);
        newUserHandler.apply(new Context());
    }
}
