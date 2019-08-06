import java.util.Scanner;

public class Hackerrank_20190712_5 {

    private static boolean t(int n) {
        int iNum = (n % 2);
        if (iNum == 1) {
            return false;
        }
        else if ( n <= 5 ) {
            return true;
        }
        else if ( n <= 20 ) {
            return false;
        }
        return true;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int N = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        scanner.close();

        System.out.println( t(N) ? "Not Weird" : "Weird");
        
    }
}
