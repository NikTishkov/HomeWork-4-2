import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {
        System.out.println("Task 1");
        //Task 1
        int moneyInTheJar = 0;
        int mount = 0;
        while (moneyInTheJar <= 2_459_000) {
            moneyInTheJar = moneyInTheJar + 15_000;
            mount++;
            System.out.println("Месяц " + mount + " ,сумма накоплений равна " + moneyInTheJar + " рублей.");
        }
        System.out.println(mount + " месяца потребуется, чтобы накопить 2 459 000 рублей.");
        System.out.println("Task 2");
        //Task 2
        int u = 1;
        while (u <= 10) {
            System.out.print(u + " ");
            u++;
        }
        System.out.println();
        for (u = 10; u >= 1; u--) {
            System.out.print(u + " ");
        }
        System.out.println();
        System.out.println("Task 3");
        //Task 3
        int contryY = 12_000_000;
        double contryYNatality = 17.0 / 1000;
        double contyYMortality = 8.0 / 1000;
        int year = 0;
        while (year <= 10) {
            contryY += (contryY * contryYNatality) - (contryY * contyYMortality);
            year++;
            System.out.println("Год " + year + " численность населения составляет " + contryY);
        }
        System.out.println("Task 4");
        //Task 4
        int depositAmount = 15_000;
        int percentageOfDeposit = 0;
        int mount1 = 0;
        while (depositAmount <= 12_000_000) {
            percentageOfDeposit = depositAmount / 100 * 7;
            depositAmount = depositAmount + percentageOfDeposit;
            mount1++;
            System.out.println("Месяц " + mount1 + " ,сумма накоплений равна " + depositAmount + " рублей.");
        }
        System.out.println("Task 5");
        //Task 5
        int depositAmount1 = 15_000;
        int percentageOfDeposit1 = 0;
        int mount2 = 0;
        int depositeTime = 9 * 12;
        while (mount2 <= depositeTime) {
            percentageOfDeposit1 = depositAmount1 / 100 * 7;
            depositAmount1 = depositAmount1 + percentageOfDeposit1;
            mount2++;
            if (mount2 % 6 == 0) {
                System.out.println("Месяц " + mount2 + " ,сумма накоплений равна " + depositAmount1 + " рублей.");
            }
        }
        System.out.println("Task 7");
        //Task 7
        int dayOfTheWeek = 3;
        for (int dayMount = dayOfTheWeek; dayMount <= 31 && dayOfTheWeek >= 1 && dayOfTheWeek <= 7; dayMount += 7) {
            System.out.println("Сегодня пятница, "+ dayMount+ "-е число. Необходимо подготовить отчет.");
        }
        System.out.println("Task 8");
        //Task 8
        int pastYears = 2025 - 200;
        int futureYears = 2025 + 100;
        for (int yearOfTheCometIsFlight = 0;yearOfTheCometIsFlight < futureYears; yearOfTheCometIsFlight += 79) {
            if (yearOfTheCometIsFlight >= pastYears && yearOfTheCometIsFlight < futureYears) {
                System.out.println(yearOfTheCometIsFlight);
                continue;
            }
            System.out.print("");
        }
    }
}