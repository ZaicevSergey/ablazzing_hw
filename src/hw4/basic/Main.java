package hw4.basic;

import java.util.ArrayList;
import java.util.Iterator;

//Базовый уровень
//Задача №1
//1. Создать два класса, которые умеют летать: самолет и утка. Атрибут утки: isInjured (ранен),
// атрибут самолета: countPassengers.
//2. Создать интерфейс, который объединяет эти два класса.
//3. Имплементировать его в двух классах
//4. Реализовать метод летать:
// Для утки:
// Метод летать будет выкидывать ошибку FlyException (создать такой класс), если утка подстрелена,
// иначе печатать на экран "утка летит"
// Для самолета:
// Метод летать будет выкидывать ошибку FlyException, если количество пассажиров меньше нуля.
// Иначе печать "самолет летит"
//5. Создать 1 утку не раненую, 1 утку раненую, 1 самолет с 10 пассажирами, 1 самолет с -1 пассажиром.
//6. Положить их всех в массив
//7. Перебрать массив и вызвать у каждого элемента метод летать
// Перехватить исключения: вывести на экран message ошибки
// Ожидание:
// утка летит
// Ошибка: утка ранена
// самолет летит
// Ошибка: пассажиров в самолете меньше 0
public class Main {
    public static void main(String[] args) {
        Duck duck1 = new Duck(false);
        Duck duck2 = new Duck(true);
        Airplane airplane1 = new Airplane(10);
        Airplane airplane2 = new Airplane(-1);

        ArrayList<Flying> arrayList = new ArrayList<>();
        arrayList.add(duck1);
        arrayList.add(duck2);
        arrayList.add(airplane1);
        arrayList.add(airplane2);

        for (int i = 0; i < arrayList.size(); i++) {
            if (arrayList.get(i) instanceof Duck && ((Duck) arrayList.get(i)).isInjured() == true) {
                try {
                    throw new FlyException();
                } catch (FlyException e) {
                    System.out.println("Ошибка: утка ранена");
                }
            } else if (arrayList.get(i) instanceof Duck && ((Duck) arrayList.get(i)).isInjured() == false) {
                arrayList.get(i).fly();
            } else if (arrayList.get(i) instanceof Airplane && ((Airplane) arrayList.get(i)).getCountPassengers() < 0) {
                try {
                    throw new FlyException();
                } catch (FlyException e) {
                    System.out.println("шибка: пассажиров в самолете меньше 0");
                }
            }else {
                arrayList.get(i).fly();
            }
        }
    }
}
