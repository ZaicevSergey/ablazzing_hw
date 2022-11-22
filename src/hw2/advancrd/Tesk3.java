package hw2.advancrd;

//Создать два массив чисел:
// 1,2,5,7,10
// 2,3,2,17,15
// Создать массив чисел, в котором будут: все числа из этих двух массивов,
// и результат умножения чисел с одинаковым порядковым номером
//
//Ожидаемый результат:
//1,2,5,7,10,2,3,2,17,15,2,6,10,119,150
//(первый массив - 1,2,5,7,10), (второй массив - 2,3,2,17,15),
//(результат перемножения - (1*2), (2*3), (5*2), (7*17), (10*15)

import java.util.Arrays;
import java.util.stream.IntStream;

public class Tesk3 {
    public static void main(String[] args) {
        int[] array1 = {1, 2, 5, 7, 10};
        int[] array2 = {2, 3, 2, 17, 15};
        int[] arrayMultiplication = new int[array1.length];
        int[] arrayResult;

        for (int i = 0; i < array1.length; i++) {
            arrayMultiplication[i] = array1[i] * array2[i];
        }

        arrayResult = IntStream.concat(Arrays.stream(array1), Arrays.stream(array2))
                .toArray();
        arrayResult = IntStream.concat(Arrays.stream(arrayResult), Arrays.stream(arrayMultiplication)).toArray();

        System.out.println(Arrays.toString(arrayResult));

    }
}
