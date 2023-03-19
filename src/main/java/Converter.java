public class Converter {
    int convertToKm(int steps){
        int lengthSM = steps * 75;
        int lengthKM = lengthSM / 100000;
        return lengthKM;
    }

    int convertStepsToKilocalories(int steps){
        int calories = steps * 50;
        int kiloCalories = calories / 1000;
        return kiloCalories;
    }


}
