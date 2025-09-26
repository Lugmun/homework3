package homework;

import org.example.Main;

public class HomeWork3 {
    public static void main(String[] args) {

        //task#1
        System.out.println("Задание №1");
        int i = 239572385;
        byte b = 127;
        short s = -3789;
        long l = 203975823475837L;
        float f = 3243.23f;
        double d = -235645636654.3453553579457688457684;
        System.out.println("Значение переменной i с типом int равно " + i);
        System.out.println("Значение переменной b с типом byte равно " + b);
        System.out.println("Значение переменной s с типом short равно " + s);
        System.out.println("Значение переменной l с типом long равно " + l);
        System.out.println("Значение переменной f с типом float равно " + f);
        System.out.println("Значение переменной d с типом double равно " + d);

        //task #2
        System.out.println("\nЗадание №2");
        float param1 = 27.12f;
        long param2 = 987678965549L;
        float param3 = 2.786f;
        short param4 = 569;
        short param5 = -159;
        short param6 = 27897;
        byte param7 = 67;

        //task #3
        System.out.println("\nЗадание №3");
        byte lp = 23;
        byte as = 27;
        byte ea = 30;
        short sheets = 480;
        System.out.println("На каждого ученика рассчитано " + sheets / (lp + as + ea) + " листов бумаги");

        //task #4
        System.out.println("\nЗадание №4");
        byte bottles = 16;
        byte minutes = 2;
        byte bottlesPerMinutes = (byte) (bottles / minutes);
        byte time1 = 20;
        short time2 = 24 * 60;
        short time3 = 3 * 24 * 60;
        int time4 = 30 * 24 * 60;
        System.out.println("За 20 минут машина произвела " + (bottlesPerMinutes * time1) + " штук бутылок");
        System.out.println("За сутки машина произвела " + (bottlesPerMinutes * time2) + " штук бутылок");
        System.out.println("За 3 дня машина произвела " + (bottlesPerMinutes * time3) + " штук бутылок");
        System.out.println("За месяц машина произвела " + (bottlesPerMinutes * time4) + " штук бутылок");

        //task #5
        System.out.println("\nЗадание №5");
        byte numberOfPaints = 120;
        byte whitePaintPerClass = 2;
        byte brownPaintPerClass = 4;
        int numberOfClasses = numberOfPaints / (whitePaintPerClass + brownPaintPerClass);
        System.out.println("В школе, где " + numberOfClasses + " классов, нужно " +
                numberOfClasses * whitePaintPerClass + " банок белой краски и " +
                numberOfClasses * brownPaintPerClass + " банок коричневой краски");

        //task #6
        System.out.println("\nЗадание №6");
        //standard weight
        byte banana = 80;
        byte milk = 105;
        byte iceCream = 100;
        byte egg = 70;
        //for recipe
        byte numOfBanana = 5;
        byte nuOfMilk = 2;
        byte numOfIceCream = 2;
        byte numOfEggs = 4;
        //calculating
        int finalWeight = (banana * numOfBanana +
                milk * nuOfMilk +
                iceCream * numOfIceCream +
                egg * numOfEggs);
        System.out.println("Вес такого спортзавтрака равен " + finalWeight + " в граммах, или " + 0.001*finalWeight + " в килограммах");

        //task #7
        System.out.println("\nЗадание №7");
        int toLoseWeight = 7000;
        int toLoseLessPerDay = 250;
        int toLoseMorePerDay = 500;

        int daysToLoseLess = toLoseWeight / toLoseLessPerDay;
        int daysToLoseMore = toLoseWeight / toLoseMorePerDay;
        int averageAmountOfDays = (daysToLoseLess + daysToLoseMore) / 2;

        System.out.println("Если спортсмен будет худеть по 250 гр, то потребуется " + daysToLoseLess + " дней.\n" +
                "Иначе, если спортсмен будет худеть по 500 гр, то потребуется " + daysToLoseMore +  " дней.\n" +
                "В среднем потребуется " + averageAmountOfDays + " день.");

        //task #8
        System.out.println("\nЗадание №8");
        byte numOfMonths = 12;
        float coefficientOfIncrease = 0.1f;
        int salaryOfMaria = 67760;
        int salaryOfDenis = 83690;
        int salaryOfCristine = 76230;

        int newSalaryOfMaria = (int) (salaryOfMaria + salaryOfMaria * coefficientOfIncrease);
        int newSalaryOfDenis = (int) (salaryOfDenis + salaryOfDenis * coefficientOfIncrease);
        int newSalaryOfCristine = (int) (salaryOfCristine + salaryOfCristine * coefficientOfIncrease);

        System.out.println("Маша теперь получает " + newSalaryOfMaria + " рублей. Годовой доход вырос на " + numOfMonths*(newSalaryOfMaria-salaryOfMaria) + " рублей");
        System.out.println("Денис теперь получает "+ newSalaryOfDenis + " рублей. Годовой доход вырос на " + numOfMonths*(newSalaryOfDenis-salaryOfDenis) +" рублей");
        System.out.println("Кристина теперь получает " + newSalaryOfCristine + " рублей. Годовой доход вырос на " + numOfMonths*(newSalaryOfCristine-salaryOfCristine) + " рублей");

    }
}
