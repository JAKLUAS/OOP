package lessons;

import java.util.Scanner;

public class moduloDollars2 {
    public static void main(String[] args) {
        Scanner DOLLAR = new Scanner(System.in);

        System.out.println("enter the amount : (e.g 43.99)");
        double amount = DOLLAR.nextDouble();
        double cents = amount * 100;
        
        int dollar = (int) (cents / 100);
        cents = cents % 100;

        int quaters = (int) (cents / 25);
        cents = cents % 25;

        int dimes = (int) (cents / 10);
        cents = cents % 10;

        int nickles = (int) (cents / 5);
        cents = cents % 5;

        int pennies = (int) (cents);


        System.out.println("Dollar : " + dollar);
        System.out.println("Quaters : " + quaters);
        System.out.println("Dimes : " + dimes);
        System.out.println("Nickles :" + nickles);
        System.out.println("Pennies : " + cents);











    }
}
