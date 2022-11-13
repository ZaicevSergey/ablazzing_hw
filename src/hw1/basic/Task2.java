package hw1.basic;

// Задание №2
// Дано:
//int ageChildren=10;
// Задача: Написать условную конструкцию, которая в зависимости от возраста ребенка,
// отправляет его в учебное заведение
// если ребенку до 6 лет то в сад,
// если до 11 лет в младшую школу,
// если до 17 лет в среднюю школу,
// иначе в университет
// Отправляет - имеется в виду, печатает на экран: "пошел в сад", "пошел в младшую школу" и т.д.
// Проверьте работоспособность условий, через изменение значения переменной.

public class Task2 {
    public static void main(String[] args) {
        int ageChildren = 16;
        if (ageChildren < 6) {
            System.out.println("пошел в сад");
        } else if (ageChildren >= 6 && ageChildren < 11) {
            System.out.println("пошел в младшую школу");
        } else if (ageChildren >= 11 && ageChildren < 17) {
            System.out.println("пошел в среднюю школу");
        } else {
            System.out.println("пошел в университет");
        }
    }
}
