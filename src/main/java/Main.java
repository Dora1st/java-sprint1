import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StepTracker stepTracker = new StepTracker(scanner);
        while(true){
            printMenu();
            int i = scanner.nextInt();
            if (i==1){
                stepTracker.addNewNumberStepsPerDay();
            } else if (i==2) {
                stepTracker.changeStepGoal(scanner);
            } else if (i==3) {
                 stepTracker.printStatistic();
            } else if (i ==4) {
                System.out.println("Пока");
                scanner.close();
                return;
            } else {
                System.out.println("Извините.Такой команды пока нет");
            }


        }
    }
    static void printMenu(){

        System.out.println("Введите номер команды:\n" +
                "1. Ввести количество шагов за определённый день \n" +
                "2. Изменить цель по количеству шагов в день \n" +
                "3. Напечатать статистику за определённый месяц \n" +
                "4. Выйти из приложения");

    }
}
