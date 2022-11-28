package hw3.advancrd.Task1;

public interface Smell {

    default String printSmell() {
       return  "умеет пахнуть";
    }

    String getName();
}

