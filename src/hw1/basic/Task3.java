package hw1.basic;

// Задание №3
// Дано:
//Курица
//boolean chicken = true;
//Овощи
//boolean vegetables = false;
//Соус
//boolean sour = true;
//Хлеб
//boolean toast = true;
//Колбаса
//boolean sausage = true;
//Яйца
//boolean eggs = true;
// Задача: Повара попросили сделать салат.
// Если у повара есть все ингредиенты для "Цезаря" (курица, овощи, соус и гренки), то лучше сделать "Цезарь".
// Если для "Цезаря" ингредиентов не нашлось, то сделать Оливье (овощи, колбаса или курица, яйца).
// Если и для Оливье не нашлось ингредиентов, то сделать Овощной салат (нужны только овощи).
// Если ингредиентов нет, то повар объявляет: У меня ничего нет
// Написать набор условий, приготовления салатов, по приоритету (от Цезаря к овощному).
// Либо объявить о невозможности сделать салат.
// Ожидаемый результат: вывод на экран сделанного салата или объявление о том, что ничего нет.
// Проверьте работоспособность условий, через изменение значения переменных.

public class Task3 {
    public static void main(String[] args) {
        boolean chicken = false;
        boolean vegetables = false;
        boolean sour = true;
        boolean toast = false;
        boolean sausage = false;
        boolean eggs = true;

        boolean saladCaesar = chicken && vegetables && sour && toast;
        boolean salatOlivie = vegetables && (sausage || chicken) && eggs;
        boolean salatVegetables = vegetables;

        if (saladCaesar) {
            System.out.println("Салат Цезарь");
        } else if (salatOlivie) {
            System.out.println("Салат Оливье");
        } else if (salatVegetables) {
            System.out.println("Салат Овощной");
        } else {
            System.out.println("У меня ничего нет");
        }
    }
}
