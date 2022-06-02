package lessons;
import java.util.*;

public class moduloDollars {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("please enter the amount : (e.g.23.89)");
        double amount = sc.nextDouble();
        double money = amount * 100;

        int dollar = (int) money/100;
        money = money % 100;
        System.out.println("DOLLAR: " + dollar);

        int quarters = (int) (money / 25);
        money = money % 25;
        System.out.println("QUARTERS: " + quarters);

        int dimes = (int) (money / 10);
        money = money % 10;
        System.out.println("DIMES: " + dimes);

        int nickles = (int) (money / 5);
        money = money % 5;
        System.out.println("NICKLES : " + nickles);

        int pennies = (int) money;
        System.out.println("PENNIES: " + pennies);










    }
}
