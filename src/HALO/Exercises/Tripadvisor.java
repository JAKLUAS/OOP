package HALO.Exercises;

import java.util.Scanner;

public class Tripadvisor {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the distance of trip");
        double trip = input.nextDouble();
        System.out.println("please enter your average mpg");
        double mpg = input.nextDouble();
        System.out.println("please enter gas price");
        double gas = input.nextDouble();
        double estGallon = trip / mpg;
        System.out.println("your average amount of gas is " + estGallon + " gallons ");
        double estcost = estGallon * gas;
        System.out.println("your average cost of gas is " + estcost + " dollars ");

















    }
}
