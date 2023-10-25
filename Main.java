import java.time.LocalDate;
import java.time.Period;

/**
 * Main
 */
public class Main {
    final static String CLEAR_SCREEN = "\\\033[H\\\033[2J"+"\r";

    public static void main(String[] args) {
        System.out.print(CLEAR_SCREEN);
        System.out.println("Hello Git Advanced!!!");
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.print(CLEAR_SCREEN);

        try {
            countingFromSomeNumber();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        try {
            timeToNewYear();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }

    public static void countingFromSomeNumber() throws InterruptedException {
        int N = 5;
        System.out.println("ATENTION!!!");
        Thread.sleep(3000);
        for (int i = N; i >= 0; i--) {
            System.out.print(CLEAR_SCREEN);
            System.out.println(i);
            Thread.sleep(1000);
        }
        System.out.print(CLEAR_SCREEN);
        System.out.println("GO!");
        Thread.sleep(2000);
        System.out.print(CLEAR_SCREEN);
    }

    public static void timeToNewYear() throws InterruptedException {
        LocalDate happyNewYearDate = LocalDate.of(2024, 01, 01);
        System.out.println("TIME TILL " + happyNewYearDate.getYear() + " YEAR:");
        Thread.sleep(3000);
        System.out.print(CLEAR_SCREEN);
        LocalDate now = LocalDate.now();
        System.out.println("Today is " + now);
        Period diff = Period.between(now, happyNewYearDate);
        // System.out.printf("It is %d years, %d months and %d days to " +
        // happyNewYearDate.getYear(),
        // diff.getYears(), diff.getMonths(), diff.getDays());
        System.out.printf("%d months and %d days to " + happyNewYearDate.getYear(),
                diff.getMonths(), diff.getDays());
        Thread.sleep(3000);
        System.out.println();
        System.out.println();
        System.out.println("Iе comes soon :))");
        Thread.sleep(2000);
        System.out.println("Bye! Be happy! :)");
        Thread.sleep(2000);
        System.out.print(CLEAR_SCREEN);

    }
}