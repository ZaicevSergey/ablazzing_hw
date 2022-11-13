package hw1.advanced;

//Продвинутый уровень
//Задача №1
//Произвести преобразование "234" в число типа int и прибавить к этому числу длину строки "some_text"

public class Task1 {
    public static void main(String[] args) {
        String numberStr = "234";
        int numberInt = Integer.parseInt(numberStr);
        System.out.println(numberInt + numberStr.length());
    }
}
