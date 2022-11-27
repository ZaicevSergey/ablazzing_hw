package hw3.advancrd.Task2;

// Задание №2:
// Написать систему управления складскими запасами. Создать класс склад, создать класс работники
// (написать геттеры на все аттрибуты).
// Количество работников минимум 3.
// Работники берут из склада товар, и портят его. Нужно написать взаимодействие через методы работников и склад:
// Работник берет из склада товар, на складе товар уменьшается. Работник когда взял товар, выводит на экран
// "Ура я испортил водку!" и добавляет к себе в журнал количество испорченного товара.
// У склада есть только одна позиция - Водка.

public class Main {
    public static void main(String[] args) {
        Warehouse w = new Warehouse(10);
        Employee employee1 = new Employee("Sergey");
        Employee employee2 = new Employee("Dima");
        Employee employee3 = new Employee("Ivan");


        employee1.spoilInfo(w);
        employee1.spoilInfo(w);
        employee2.spoilInfo(w);
        employee1.spoilInfo(w);
        employee3.spoilInfo(w);
    }
}
