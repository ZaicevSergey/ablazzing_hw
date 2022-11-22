package hw2.advancrd;

// Задание №1: Написать цикл, который будет прибавлять число к result до тех пор,
// пока не получиться больше 1_000_000.
// Дано:
//        double increment = 0.01123;
//                double result = 0;
// Вывести на экран, количество итераций, которое потребовалось, чтобы дойти до миллиона.
// Если число отрицательное, то сразу заканчиваем цикл, ничего не выводя.
// Внимание: число может измениться, и не должно приводить к изменению вашего кода.

public class Task1 {
    public static void main(String[] args) {
        double increment = 0.01123;
        double result = 0;
        int index = 0;
        while (result <= (double) 1_000_000) {
            result += increment;
            index++;
        }
        System.out.println(index);
        System.out.println(result);
    }
}
