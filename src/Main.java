public class Main {
    public static void main(String[] args) {

        System.out.println("Задание 1  ");

        int total = 0;
        int can = 15000;
        int k = 0;
        while (total < 2_459_000) {
            total += (int) (total * 0.01);
            total = total + can;
            k++;
            System.out.println("Месяц " + k + " сумма накоплений равна " + total + " рублей");
        }

        System.out.println("Задание 2  ");

        int start = 1;
        while (start < 11) {
            System.out.print(" " + start + " ");
            start = start + 1;
        }
        System.out.println();
        for (int r = 10; r >= 1; r--) {
            System.out.print(" " + r + " ");
        }
        System.out.println();

        System.out.println("Задание 3  ");

        int population = 12_000_000;
        int year = 0;
        int deathRate = 8;
        int birthRate = 17;
        int raznica = birthRate - deathRate;
        for (year = 0; year <= 10; year++) {
            int populationNext = population + (population * raznica / 1000);
            System.out.println("Год " + year + ", численность населения составляет " + populationNext + ".");
            population = populationNext;
        }

        System.out.println("Задание 4  ");

        int firstMoney = 15000;
        int totalSecond = 0;
        int d = 1;
        for (; totalSecond < 12_000_000; d++) {
            totalSecond = totalSecond + firstMoney;
            totalSecond += (int) (totalSecond * 0.07);
            System.out.println("Месяц " + d + " сумма накоплений равна " + totalSecond + " рублей");
        }

        System.out.println("Задание 5  ");

        int capital = 15000;
        int totalThirth = 0;
        int f = 1;
        for (; totalThirth < 12000000; f++) {
            totalThirth = totalThirth + capital;
            totalThirth += (int) (totalThirth * 0.07);
            if (f % 6 == 0) {
                System.out.println("Месяц " + f + " сумма накоплений равна " + totalThirth + " рублей");
            }
        }

        System.out.println("Задание 6  ");

        int cash = 15000;
        int totalFourth = 0;
        int j = 1;
        for (; j <= 108; j++) {
            totalFourth = totalFourth + cash;
            totalFourth += (int) (totalFourth * 0.07);
            if (j % 6 == 0) {
                System.out.println("Месяц " + j + " сумма накоплений равна " + totalFourth + " рублей");
            }
        }

        System.out.println("Задание 7  ");

        int today = 1;
        while (today <= 31) {
            today++;
            if (today % 7 == 5) {
                System.out.println("Сегодня пятница, " + today + "-е число. Необходимо подготовить отчет");
            }
        }

        System.out.println("Задание 8  ");

        int startYear = 1824;
        int endYear = 2124;
        for (int firstYear = startYear; firstYear <= endYear; firstYear++) {
            if (firstYear % 79 == 0) {
                System.out.println(firstYear);
            }
        }
    }
}
