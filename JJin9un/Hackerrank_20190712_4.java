import java.util.*;

/**
 * Java_Loops_II
 */
public class Hackerrank_20190712_4 {

    public static void main(String[] argh) {
        String input = "0\n2\n10";
        Scanner in = new Scanner(input);
        in.useDelimiter("\n");

        // Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for (int i = 0; i < t; i++) {
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();

            int s = a;
            for (int x = 0; x < n; x++) {
                s += Math.pow(2, x) * b;
                System.out.printf("%d ", s);
            }
            System.out.println();
        }
        in.close();
    }
}
