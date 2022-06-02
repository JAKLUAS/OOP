package HALO.Exercises;

import java.util.Scanner;

public class Hawaii {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("please enter the distance of trip:");
        double trip = input.nextDouble();

        System.out.println("please enter the mpg of your car :");
        double mpg = input.nextDouble();

        System.out.println("please enter the price of gas per gallon:");
        double price = input.nextDouble();

        double gallons = trip / mpg;
        System.out.println("your average amount of your gas " + gallons + " ");

        double cost = gallons * price;
        System.out.println("your total of your expences of gas " + cost + " ");


    }
}
