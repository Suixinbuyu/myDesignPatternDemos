package StructuralTypeDPDemos.ProxyPattern;

public class Food {
    private String chicken;
    private String salt;
    private String spicy;
    private String noodle;

    public String getChicken() {
        return chicken;
    }

    public void setChicken(String chicken) {
        this.chicken = chicken;
    }

    public String getSalt() {
        return salt;
    }

    public void setSalt(String salt) {
        this.salt = salt;
    }

    public String getSpicy() {
        return spicy;
    }

    public void setSpicy(String spicy) {
        this.spicy = spicy;
    }

    public String getNoodle() {
        return noodle;
    }

    public void setNoodle(String noodle) {
        this.noodle = noodle;
    }

    @Override
    public String toString() {
        return "Food{" +
                "chicken='" + chicken + '\'' +
                ", salt='" + salt + '\'' +
                ", spicy='" + spicy + '\'' +
                ", noodle='" + noodle + '\'' +
                '}';
    }
}
