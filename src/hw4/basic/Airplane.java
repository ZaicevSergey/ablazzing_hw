package hw4.basic;

public class Airplane implements Flying {

    private int countPassengers;

    public Airplane(int countPassengers) {
        this.countPassengers = countPassengers;
    }

    public int getCountPassengers() {
        return countPassengers;
    }

    @Override
    public void fly() {
        System.out.println("самолет летит");
    }
}
