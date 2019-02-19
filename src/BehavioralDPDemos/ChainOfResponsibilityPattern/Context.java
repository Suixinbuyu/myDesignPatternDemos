package BehavioralDPDemos.ChainOfResponsibilityPattern;

public class Context {

    private String location;

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public boolean isNewuser() {
        return true;
    }

    public boolean isSupportLocation(String location) {
        return true;
    }

}
