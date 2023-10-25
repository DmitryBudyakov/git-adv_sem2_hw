
/**
 * Main
 */
public class Main {

    public static void main(String[] args) {
        System.out.print("\033[H\033[2J");
        System.out.println("Hello Git Advanced!!!");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.print("\033[H\033[2J");

        try {
            countingFromSomeNumber();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }

    public static void countingFromSomeNumber() throws InterruptedException {
        int N = 5;
        System.out.println("ATENTION!!!");
        Thread.sleep(3000);
        for (int i = N; i >= 1; i--) {
            System.out.print("\033[H\033[2J");
            System.out.println(i);
            Thread.sleep(1000);
        }
        System.out.print("\033[H\033[2J");
        System.out.println("GO!");
    }
}