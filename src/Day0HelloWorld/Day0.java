package Day0HelloWorld;


import java.util.Scanner;

/**
 *
 * @author tabrizguliyev
 */
public class Day0 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String inputString = scan.nextLine();
        scan.close();
        System.out.println("Hello, World.");
        System.out.println(inputString);
    }
}
