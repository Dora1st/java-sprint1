import java.util.Arrays;
import java.util.Scanner;

public class StepTracker {
    MonthData[] monthToData = new MonthData[12];
    Scanner scanner;
    static int goalByStepsPerDay = 10000;

    void changeStepGoal(Scanner scanner){
        goalByStepsPerDay = scanner.nextInt();
        if(goalByStepsPerDay <= 0){
            System.out.println("Цель не может быть меньше нуля или равной ему");
            return;
        }
    }



    StepTracker(Scanner scan) {
        scanner = scan;
        for (int i = 0; i < monthToData.length; i++) {
            monthToData[i] = new MonthData();
        }
    }

    void addNewNumberStepsPerDay() {
        System.out.println("Введите номер месяца");
        int month = scanner.nextInt();
        if (month < 1 || month > 12) {
            System.out.println("Месяц введен неверно");
            return;
        }
        System.out.println("Введите день от 1 до 30 (включительно)");
        int day = scanner.nextInt();
        if (day < 1 || day > 12){
            System.out.println("День введен неверно");
            return;
        }
        System.out.println("Введите количество шагов");
        int steps = scanner.nextInt();
        if(steps < 0){
            System.out.println("Количество шагов не может быть отрицательным");
            return;
        }
        // Получение соответствующего объекта MonthData из массива
        MonthData monthData = monthToData[month-1];
        // Сохранение полученных данных
        monthData.days[day-1] = steps;


    }

    void printStatistic(){
        System.out.println("Введите номер месяца");
        int month = scanner.nextInt();
        if (month < 1 || month > 12) {
            System.out.println("Месяц введен неверно");
            return;
        }
        MonthData monthData = monthToData[month-1];
        Converter converter = new Converter();

        System.out.print("Количество шагов по дням: ");
        monthData.printDaysAndStepsFromMonth();
        System.out.println();
        System.out.println("Общее количество шагов за месяц: " + monthData.sumStepsFromMonth());
        System.out.println("Максимальное пройденное количество шагов в месяце: " + monthData.maxSteps());
        System.out.println("Cреднее количество шагов: " + monthData.maxSteps() / monthData.days.length);
        System.out.println("Пройденная дистанция (в км): " + converter.convertToKm(monthData.sumStepsFromMonth()));
        System.out.println("Количество сожжённых килокалорий: " + converter.convertStepsToKilocalories(monthData.sumStepsFromMonth()));
        System.out.println("Лучшая серия: " + monthData.bestSeries(goalByStepsPerDay));





    }


}
