package hw4.advancrd;

public class Watch implements Ticking {
 private boolean isBroken;

    public Watch(boolean isBroken) {
        this.isBroken = isBroken;
    }

    public boolean isBroken() {
        return isBroken;
    }

    @Override
    public void tick() {
        System.out.println("Часы тикают");
    }
}
