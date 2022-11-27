package hw3.advancrd.Task1;

public interface Blossom {
    default String printBlossom() {
        return "умеет цвести";
    }

    String getName();
}
