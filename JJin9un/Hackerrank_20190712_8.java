import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

/**
 * Java End-of-file
 * https://www.hackerrank.com/challenges/java-end-of-file
 */
public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner in = new Scanner(System.in);

        int x = 0;
        while (in.hasNext()) {
            String s = in.nextLine();
            x++;

            System.out.println(x + " " + s);
        }

        in.close();
    }
}
