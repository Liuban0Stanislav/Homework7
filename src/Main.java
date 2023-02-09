import java.text.DecimalFormat;

public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
        task8();
    }

    private static void task8() {
        System.out.println("Задача 8");

        int year = 2023;
        int cometHere = 79;
        int yearOfComing = 0;

        while (yearOfComing <= year + 100 - cometHere){
            yearOfComing = yearOfComing + cometHere;

            if (year - 200 < yearOfComing) {
                System.out.println(yearOfComing);
            }

        }
    }

    private static void task7() {
        System.out.println("Задача 7");

        int dayOfMonth = 3;
        int fridayCounter = dayOfMonth + 7;

        while (dayOfMonth <= 31) {
            if (dayOfMonth == fridayCounter) {
                fridayCounter = dayOfMonth + 7;
                System.out.println("Сегодня пятница, " + dayOfMonth + "-е число. Необходимо подготовить отчет");

            }
            dayOfMonth++;
        }
    }

    private static void task6() {
        System.out.println("Задача 6");

        int percent = 7;
        double sumDeposit = 15_000;
        int timePurpose = 9;
        int monthCounter = 0;

        while (monthCounter <= timePurpose * 12) {
            sumDeposit = sumDeposit + (sumDeposit * percent / 100);
            monthCounter++;
            if (monthCounter % 6 == 0) {
                System.out.println("Месяц " + monthCounter + " Сумма накоплений: " +
                        new DecimalFormat("###,###.##").format(sumDeposit));
            }
        }
        System.out.println("Итого лет: " + (monthCounter / 12) + " Итоговая сумма: " +
                new DecimalFormat("###,###.##").format(sumDeposit));
        System.out.println();
    }

    public static void task5() {
        System.out.println("Задача 5");

        int percent = 7;
        double sumDeposit = 15_000;
        int sumPurpose = 12_000_000;
        int monthCounter = 0;

        while (sumDeposit <= sumPurpose) {
            monthCounter++;
            sumDeposit = sumDeposit + (sumDeposit * percent / 100);
            if (monthCounter % 6 == 0) {
                System.out.println("Месяц " + monthCounter + " Сумма накоплений: " +
                        new DecimalFormat("###,###.##").format(sumDeposit));
            }
        }
        System.out.println("Итого лет: " + (monthCounter / 12) + " Итоговая сумма: " +
                new DecimalFormat("###,###.##").format(sumDeposit));
        System.out.println();
    }

    public static void task4() {
        System.out.println("Задача 4");

        int percent = 7;
        double sumDeposit = 15_000;
        int sumPurpose = 12_000_000;
        int monthCounter = 0;

        while (sumDeposit <= sumPurpose) {
            monthCounter++;
            sumDeposit = sumDeposit + (sumDeposit * percent / 100);
            System.out.println("Месяц " + monthCounter + " Сумма накоплений: " + new DecimalFormat("###,###.##").format(sumDeposit));
        }
        System.out.println();
    }

    private static void task3() {
        System.out.println("Задача 3");

        var population = 12_000_000;    //население всего
        var birthRate = 17 * 1000;      //рождаемость
        var mortality = 8 * 1000;       //смертность

        int timeCounter = 0;            //годы
        while (timeCounter < 10) {
            population = population - mortality + birthRate;
            timeCounter++;
            System.out.println("Год " + timeCounter + ", численность населения составляет " + population);
        }
        System.out.println();
    }

    private static void task2() {
        System.out.println("Задача 2");

        int i = 0;

        while (i < 10) {
            i++;
            System.out.print(i + " ");
        }

        System.out.println();

        for (; i > 0; i--) {
            System.out.print(i + " ");
        }
        System.out.println();
        System.out.println();
    }

    private static void task1() {
        System.out.println("Задача 1");

        int total = 2_459_000;
        int interimResult = 0;      //промежуточный итог
        int monthProfit = 15_000;
        int monthCounter = 1;       //счетчик месяцев

        while (interimResult < total) {
            interimResult += monthProfit;       //добавляем в промежуточный итог месячную прибыль
            monthCounter++;                     //увеличиваем месяц на 1
            System.out.println("Месяц " + monthCounter + ", сумма накоплений равна " +
                    new DecimalFormat("###,###").format(interimResult) + " рублей");
        }
        System.out.println();
    }
}