package Day2Operators;

import java.util.Scanner;

/**
 *
 * @author tabrizguliyev
 */
public class Day2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double meal_cost = scanner.nextDouble();
        int tip_percent = scanner.nextInt();
        int tax_percent = scanner.nextInt();
        scanner.close();
        int totalCost = (int) Math.round(meal_cost + (meal_cost * tip_percent / 100) + (meal_cost * tax_percent / 100));
        System.out.println(totalCost);

    }
}
