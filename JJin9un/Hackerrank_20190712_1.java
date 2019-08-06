import java.util.Scanner;

public class Hackerrank_20190712_1 {

    public static void main(String[] args) {
        String input = "100\n42\n42 is the answer to life, the universe, and everything!";
        Scanner scan = new Scanner(input);
        scan.useDelimiter("\n");
        // Scanner scan = new Scanner(System.in);

        int i = scan.nextInt();

        // Write your code here.
        double d = scan.nextDouble();
        scan.nextLine();
        String s = scan.nextLine();

        System.out.println("String: " + s);
        System.out.println("Double: " + d);
        System.out.println("Int: " + i);

        scan.close();
    }
}