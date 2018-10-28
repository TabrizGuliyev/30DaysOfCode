package Day5Loops;

import java.util.Scanner;

/**
 *
 * @author tabrizguliyev
 */
public class Day5 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();

        for (int i = 1; i < 11; i++) {
            System.out.println(n + " x " + i + " = " + n * i);
        }
    }
}
