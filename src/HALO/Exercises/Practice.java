package HALO.Exercises;

import java.util.*;

public class Practice {
    public static void main(String[] args) {
        System.out.println("this program will calculate estimste cost of your gas for your trip");
        Scanner input = new Scanner(System.in);

        System.out.println("please enter the distance of your travel");
        double distance = input.nextDouble();
        System.out.println("please enter the mpg");
        double mpg = input.nextDouble();
        System.out.println("please enter the gas price");
        double gas = input.nextDouble();


        double amount = distance / mpg;
        System.out.println("your average amount of gas is " + amount + " gallons  ");
        double cost = amount * gas;
        System.out.println(" your total gas expences is " + cost + " ");







    }
}
