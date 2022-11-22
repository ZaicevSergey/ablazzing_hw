package hw2.advancrd;

// Задание №2: Дан массив единиц, произвольной длины. Создать цикл, который заменяет каждый
// нечетный элемент на 0;
// Например, дано: [1,1,1,1,1]
// Ожидаемый результат: [0,1,0,1,0]
// Подсказка: прочитай про операнд "%".

import java.util.Arrays;

public class Task2 {
    public static void main(String[] args) {
        int[] array = {1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1};
        replacementOddElements(array);

    }

    public static void replacementOddElements(int[] array) {
        for (int i = 0; i < array.length; i++) {
            if (i % 2 == 0) {
                array[i] = 0;
            }
        }
        System.out.println(Arrays.toString(array));
    }
}
