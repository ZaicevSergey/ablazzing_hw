package hw3.expert;


public class Human {
    private final String name;
    private final int age;
    private final int weight;


    public Human(String name, int age, int weight) {
        this.name = name;
        this.age = age;
        this.weight = weight;
    }

    public static HumanBuilder builder() {
        return new HumanBuilder();
    }


    public void info() {
        System.out.printf("%s - возрас %d, все %d\n", name, age, weight);
    }

    public static class HumanBuilder {
        private String name;
        private int age;
        private int weight;

        public HumanBuilder name(String name) {
            this.name = name;
            return this;
        }

        public HumanBuilder age(int age) {
            this.age = age;
            return this;
        }

        public HumanBuilder weight(int weight) {
            this.weight = weight;
            return this;
        }

        public Human build() {
            return new Human(name, age, weight);
        }


    }
}
