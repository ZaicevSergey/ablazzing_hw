package hw3.advancrd.Task1;

//Задача №1
//1. Создать следующую структуру из классов и интерфейсов:
// дерево -> ель (имеет шишки, умеет пахнуть)
// дерево -> сосна (имеет шишки, умеет пахнуть)
// растение -> роза (умеет цвести, умеет пахнуть)
// растение -> папоротник (умеет цвести)
// Создать у каждого класса по объекту, распределить по массивам интерфейсов
// И у каждого массива вызвать характерный метод
//Ожидание:
// сосна : умеет пахнуть
// ель : умееть пахнуть
// роза: умееть пахнуть
// роза: умеет цвести
// папоротник: умеет цвести

public class Main {
    public static void main(String[] args) {
        Smell spruce = new Spruce("ель");
        Smell pine = new Pine("сосна");
        Smell rose = new Rose("роза");
        Blossom fern = new Fern("папоротник");

        Blossom[] arrayBlossom = {(Blossom) rose, fern};
        Smell[] arraySmell = {pine, spruce, rose};

        for (Smell smell : arraySmell) {
            System.out.println(smell.getName() + ": " + "" + smell.printSmell());

        }

        for (Blossom blossom : arrayBlossom) {
            System.out.println(blossom.getName() + ": " + blossom.printBlossom());

        }

    }
}
