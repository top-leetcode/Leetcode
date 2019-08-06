import java.util.Scanner;

/**
 * Java Static Initializer Block
 * https://www.hackerrank.com/challenges/java-static-initializer-block/problem
 */
public class Solution {

// Write your code here

private static int B;
private static int H;
private static boolean flag = true;

static {
    Scanner in = new Scanner(System.in);

    B = in.nextInt();
    H = in.nextInt();
    in.close();
    
    if (B < 1 || H < 1) {
        flag = false;
        System.out.println("java.lang.Exception: Breadth and height must be positive");
    }
}

public static void main(String[] args){
		if(flag){
			int area=B*H;
			System.out.print(area);
		}
		
	}//end of main

}//end of class

