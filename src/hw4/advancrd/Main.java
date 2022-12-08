package hw4.advancrd;

//Продвинутая
//Задача №1
//2. Создать следующую структуру из классов и интерфейсов
// магазин (обладает работниками)
// работник (обладает часами - (часы одни))
// часы (умеют тикать, если сломаны выкидывают ошибку WatchBrokenError)
// Бренд (обладает массивом магазинов)
// Создать бренд, положить в него два магазина, в каждом магазине будет по работнику,
// у каждого работника по часам. У одного работника часы сломаны, у второго нет.
// После создания бренда, вытащить из него все часы и вызвать у всех часов метод тикать,
// обработать ошибку сломанных часов.
// Ожидание вывода на экран:
// Часы тикают
// Ошибка: Часы сломались.
public class Main {
    public static void main(String[] args) {
        Watch watchOn = new Watch(false);
        Watch watchOff = new Watch(true);

        Employee employeeWatchOn = new Employee(watchOn);
        Employee employeeWatchOff = new Employee(watchOff);

        Store storeWhereEmployeeWatchOn = new Store(employeeWatchOn);
        Store storeWhereEmployeeWatchOff = new Store(employeeWatchOff);

        Store[] arrayStore = {storeWhereEmployeeWatchOn, storeWhereEmployeeWatchOff};

        Brand brand = new Brand(arrayStore);


        for (int i = 0; i < brand.getArrayStore().length; i++) {
            if (!brand.getArrayStore()[i].getEmployee().getWatch().isBroken()) {
                brand.getArrayStore()[i].getEmployee().getWatch().tick();
            } else {
                try {
                    throw new WatchBrokenError();
                } catch (WatchBrokenError e) {
                    System.out.println("Ошибка: Часы сломались");
                }
            }
        }
    }
}
