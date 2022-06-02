package replitLABS;

import java.util.Scanner;

public class LAB31ifConditions {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("in = ");
        String name = input.nextLine();
        String x = "Akmal";
        String y = "Teacher";
        String z = "BOB";
        String a = "student";

        if (name.equals(x)) {
            System.out.println(x + " is " + y);


        }
        if (name.equals(z)) {

            System.out.println(z + " is " + a);

        } else {
            System.out.println(" others are None educated");
        }

    }
}