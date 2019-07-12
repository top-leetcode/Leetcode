import java.util.Scanner;

/**
 * Objective
 * In this challenge, we're going to use loops to help us do some simple math.
 */
public class Hackerrank_20190712_3 {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int N = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 1; i <= 10; i++) {
            System.out.printf("%d x %d = %d\n", N, i, (N * i));
        }

        scanner.close();
    }
}
