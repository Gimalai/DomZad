class Main {
    public static void main(String[] args) {
        // Объявление и инициализация переменных
        double dog = 8.0;
        double cat = 3.6;
        int paper = 763789;

        // Использование типа переменной var для увеличения значения на 4
        dog += 4.0;
        cat += 4.0;
        paper += 4;

        // Уменьшение значений переменных
        dog -= 3.5;
        cat -= 1.6;
        paper -= 7639;

        // Инициализация переменной friend с использованием типа var
        var friend = 19;

        // Увеличение значения переменной на 2
        friend += 2;

        // Деление на 7
        friend /= 7;

        // Инициализация переменной frog с использованием типа var
        var frog = 3.5;

        // Увеличение переменной в 10 раз
        frog *= 10;

        // Деление на 3.5
        frog /= 3.5;

        // Добавление 4
        frog += 4;

        // Инициализация массы боксеров с использованием типа var
        var boxer1 = 78.2;
        var boxer2 = 82.7;

        // Вычисление общей массы боксеров
        var totalWeight = boxer1 + boxer2;

        // Вычисление разницы в массе боксеров
        var weightDifference = Math.abs(boxer1 - boxer2);

        // Инициализация массы спортсменов с использованием типа var
        var weight1 = 78.2;
        var weight2 = 82.7;

        // Вычисление разницы масс спортсменов с использованием вычитания
        var difference1 = Math.abs(weight1 - weight2);

        // Вычисление разницы масс спортсменов с использованием остатка от деления
        var difference2 = Math.abs(weight1 % weight2);

        var totalHours = 640;
        var workHoursPerEmployee = 8;

        // Вычисление общего числа сотрудников
        var totalEmployees = totalHours / workHoursPerEmployee;

        // Вывод новых значений переменных в консоль
        System.out.println("Новое значение переменной dog: " + dog);
        System.out.println("Новое значение переменной cat: " + cat);
        System.out.println("Новое значение переменной paper: " + paper);

        // Вывод значений переменной frog после каждой операции
        System.out.println("Значение переменной frog после увеличения в 10 раз: " + frog);
        System.out.println("Значение переменной frog после деления на 3.5: " + frog);
        System.out.println("Значение переменной frog после добавления 4: " + frog);

        // Вывод значений переменной friend после каждой операции
        System.out.println("Значение переменной friend после увеличения на 2: " + friend);
        System.out.println("Значение переменной friend после деления на 7: " + friend);

        // Вывод значений переменных в консоль
        System.out.println("Значение переменной dog: " + dog);
        System.out.println("Значение переменной cat: " + cat);
        System.out.println("Значение переменной paper: " + paper);

        // Вывод общей массы и разницы массы в консоль
        System.out.println("Общая масса боксеров: " + totalWeight + " кг");
        System.out.println("Разница в массе боксеров: " + weightDifference + " кг");

        // Вывод разницы масс спортсменов в консоль
        System.out.println("Разница масс спортсменов (вычитание): " + difference1 + " кг");
        System.out.println("Разница масс спортсменов (остаток от деления): " + difference2 + " кг");

        System.out.println("Всего работников в компании — " + totalEmployees + " человек");
    }
}