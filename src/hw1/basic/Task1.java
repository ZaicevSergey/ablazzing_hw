package hw1.basic;

//Базовая домашка
//Задача №1
//Создать переменные с ростом (!в метрах), весом.
//Произвести расчет индекса массы тела (вес) / (рост * рост) используя переменные, вывести на экран
//Пример результата вывода на экран:
//21.00202130120

public class Task1 {
    public static void main(String[] args) {
        int height = 178;
        int weight = 77;
        double indexMass = ((double) weight / (double) (height * height));
        System.out.println(indexMass);


    }
}
