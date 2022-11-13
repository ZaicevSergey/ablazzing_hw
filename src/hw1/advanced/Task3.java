package hw1.advanced;

// Задание №3:
// Дано:
//boolean hasFuel = true;
// boolean hasElectricsProblem = false;
//boolean hasMotorProblem = false;
//boolean hasTransmissionProblem = true;
//boolean hasWheelsProblem = true;
// В автосервис приехала сломанная машина. Механики находят неисправность следующим способом:
// Если у машины нет бензина и ничего не сломано, то отдают машину владельцу и берут 1000 рублей за консультацию.
// Если у машины проблема с двигателем, то чинят и берут 10 000.
// Если у машины проблема с электрикой, то чинят и берут 5000.
// Если у машины проблема с коробкой передач, то чинят и берут 4000.
// Если у машины проблема с колесами, то чинят и берут 2000.
// Если две детали сломаны, то на общий счет идет скидка 10%.
// Если сломана коробка передач, и электрика или двигатель, то на общий счет скидка 20%.
// Если нет бензина и что-то сломано, то за консультацию денег не берут.
// Ситуации, что бензин есть и ничего не сломано - быть не может.
// Ожидаемый результат: выведен на экран счет клиенту.

public class Task3 {


    private boolean hasFuel;
    private boolean hasElectricsProblem;
    private boolean hasMotorProblem;
    private boolean hasTransmissionProblem;
    private boolean hasWheelsProblem;
    private double bill;


    public Task3(boolean hasFuel, boolean hasElectricsProblem, boolean hasMotorProblem, boolean hasTransmissionProblem, boolean hasWheelsProblem) {
        this.hasFuel = hasFuel;
        this.hasElectricsProblem = hasElectricsProblem;
        this.hasMotorProblem = hasMotorProblem;
        this.hasTransmissionProblem = hasTransmissionProblem;
        this.hasWheelsProblem = hasWheelsProblem;
        this.bill = 0;
    }

    public boolean notFuelAllWorks() {
        if (hasFuel && !hasElectricsProblem && !hasMotorProblem && !hasTransmissionProblem && !hasWheelsProblem) {
            bill += 1000;
            return true;
        }
        return false;
    }


    public boolean isHahMotorProblem() {
        if (hasMotorProblem) {
            bill += 10000;
            return true;
        }
        return false;
    }

    public boolean isHasElectricsProblem() {
        if (hasElectricsProblem) {
            bill += 5000;
            return true;
        }
        return false;
    }

    public boolean isHasTransmissionProblem() {
        if (hasTransmissionProblem) {
            bill += 4000;
            return true;
        }
        return false;
    }

    public boolean isHasWheelsProblem() {
        if (hasWheelsProblem) {
            bill += 2000;
            return true;
        }
        return false;
    }

    public double getBill() {
        notFuelAllWorks();
        isHahMotorProblem();
        isHasElectricsProblem();
        isHasTransmissionProblem();
        isHasWheelsProblem();
        if ((hasTransmissionProblem && hasElectricsProblem) ||
                (hasTransmissionProblem && hasMotorProblem)) {
            bill = bill - (bill * 0.2);
            return bill;

        } else if ((hasMotorProblem && hasElectricsProblem) ||
                (hasMotorProblem && hasWheelsProblem) ||
                (hasElectricsProblem && hasWheelsProblem) ||
                (hasTransmissionProblem && hasWheelsProblem)) {
            bill = bill - (bill * 0.1);
            return bill;
        } else if (!hasFuel && (hasElectricsProblem || hasMotorProblem || hasTransmissionProblem || hasWheelsProblem)) {
            bill = 0;
            return bill;
        }
        return bill;
    }

}
