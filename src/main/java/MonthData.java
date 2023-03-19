import java.util.Arrays;

public class MonthData {
    int[]days = new int[30];

    void printDaysAndStepsFromMonth() {
        for (int i = 0; i < days.length; i++) {
            System.out.println(++i + "день: " + days[i]);

        }
    }

    int sumStepsFromMonth() {
        int sum = 0;
        for (int i = 0; i < days.length; i++) {
            sum = sum + days[i];
        }
        return sum;
    }

    int maxSteps() {
        int maxSteps = days[0];
        for (int i = 0; i < days.length; i++) {
            if(maxSteps < days[i]){
                maxSteps = days[i];
            }
        }
        return maxSteps;
    }

    int bestSeries(int goalByStepsPerDay) {
        int finalSeries = 0;
        int currentSeries = 0;
        for (int i = 0; i < days.length; i++) {
            if (days[i] >= goalByStepsPerDay) {
                currentSeries++;
                if (currentSeries > finalSeries) {
                    finalSeries = currentSeries;
                }
            } else if (days[i] < goalByStepsPerDay) {
                currentSeries = 0;
            }
        }
        return finalSeries;

    }



}
