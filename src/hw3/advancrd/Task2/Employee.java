package hw3.advancrd.Task2;

public class Employee {
    private String name;
    //колиичество испорченного товара
    private int spoiledProduct;

    // взять товар со склада и спортить. Вывести отчет
    public void spoilInfo(Warehouse warehouse) {
        System.out.println("Ура я испортил водку!");
        spoiledProduct++;
        warehouse.setVodka(warehouse.getVodka() - 1);
        System.out.println("Остаток на складе: " + warehouse.getVodka());
        System.out.printf("Работник %s, испортил всего %d бут. водки \n --------------------\n"
                , getName(), this.getSpoiledProduct());
    }

    public Employee(String name) {
        this.name = name;
    }

    public int getSpoiledProduct() {
        return spoiledProduct;
    }

    public String getName() {
        return name;
    }
}
