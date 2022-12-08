package hw4.basic;

public class Duck implements Flying {
    private boolean isInjured;

    public Duck(boolean isInjured) {
        this.isInjured = isInjured;
    }

    public boolean isInjured() {
        return isInjured;
    }

    @Override
    public void fly() {
        System.out.println("утка летит");
    }

}
