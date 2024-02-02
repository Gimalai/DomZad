public class Main {
    public static void main(String[] args) {
        //задача  1
        double value1 = 27.12;
        long value2 = 987_678_965_549L;
        float value3 = 2.786f;
        int value4 = 569;
        short value5 = -159;
        int value6 = 27_897;
        byte value7 = 67;

        System.out.println("Значение переменной value1 с типом double равно " + value1);
        System.out.println("Значение переменной value2 с типом long равно " + value2);
        System.out.println("Значение переменной value3 с типом float равно " + value3);
        System.out.println("Значение переменной value4 с типом int равно " + value4);
        System.out.println("Значение переменной value5 с типом short равно " + value5);
        System.out.println("Значение переменной value6 с типом int равно " + value6);
        System.out.println("Значение переменной value7 с типом byte равно " + value7);

        //Задача 3
        int luydmilaClassSize = 23;
        int annaClassSize = 27;
        int ekaterinaClassSize = 30;
        int totalSheetsOfPaper = 480;

        int sheetsPerStudent = totalSheetsOfPaper / (luydmilaClassSize + annaClassSize + ekaterinaClassSize);

        System.out.println("На каждого ученика рассчитано " + sheetsPerStudent + " листов бумаги");

        // Задача 4
        int bottlesPer2Minutes = 16;
        int minutesPerDay = 24 * 60;
        int minutesPer3Days = 3 * minutesPerDay;
        int minutesPerMonth = 30 * minutesPerDay;

        int bottlesPer20Minutes = (bottlesPer2Minutes * 20) / 2;
        int bottlesPerDay = (bottlesPer2Minutes * minutesPerDay) / 2;
        int bottlesPer3Days = (bottlesPer2Minutes * minutesPer3Days) / 2;
        int bottlesPerMonth = (bottlesPer2Minutes * minutesPerMonth) / 2;

        System.out.println("За 20 минут машина произвела " + bottlesPer20Minutes + " штук бутылок");
        System.out.println("За сутки машина произвела " + bottlesPerDay + " штук бутылок");
        System.out.println("За 3 дня машина произвела " + bottlesPer3Days + " штук бутылок");
        System.out.println("За 1 месяц машина произвела " + bottlesPerMonth + " штук бутылок");

        // Задача 5
        int totalPaintCans = 120;
        int whitePaintCansPerClass = 2;
        int brownPaintCansPerClass = 4;

        int numberOfClasses = totalPaintCans / (whitePaintCansPerClass + brownPaintCansPerClass);
        int whitePaintCans = numberOfClasses * whitePaintCansPerClass;
        int brownPaintCans = numberOfClasses * brownPaintCansPerClass;

        System.out.println("В школе, где " + numberOfClasses + " классов, нужно " + whitePaintCans + " банок белой краски и " + brownPaintCans + " банок коричневой краски");

        // Задача 6
        int bananasPerRecipe = 5;
        int milkPerRecipe = 200;
        int iceCreamBricksPerRecipe = 2;
        int eggsPerRecipe = 4;
        int bananaWeight = 80;
        int milkWeight = 105;
        
        int iceCreamBrickWeight = 100;
        int eggWeight = 70;

        int recipeWeight = (bananasPerRecipe * bananaWeight) + (milkPerRecipe * milkWeight) + (iceCreamBricksPerRecipe * iceCreamBrickWeight) + (eggsPerRecipe * eggWeight);
        double recipeWeightInKg = recipeWeight / 1000.0;

        System.out.println("Вес спортзавтрака в граммах: " + recipeWeight + " г");
        System.out.println("Вес спортзавтрака в килограммах: " + recipeWeightInKg + " кг");

        // Задача 7
        int weightLossMin = 250;
        int weightLossMax = 500;
        int totalWeightLoss = 7000;

        int daysMin = totalWeightLoss / weightLossMin;
        int daysMax = totalWeightLoss / weightLossMax;
        int daysAverage = (daysMin + daysMax) / 2;

        System.out.println("Дней на похудение при потере веса от 250 г: " + daysMin + " дня(ей)");
        System.out.println("Дней на похудение при потере веса от 500 г: " + daysMax + " дня(ей)");
        System.out.println("Дней на похудение при средней потере веса: " + daysAverage + " дня(ей)");

        int mashaPayment = 67600;
        int denisPayment = 83690;
        int kristinaPayment = 76230;

        System.out.println("Машина зарплата после повышения: " + mashaPayment * 1.1 + " рублей. Годовой доход вырос на " + mashaPayment * 0,1);

}

