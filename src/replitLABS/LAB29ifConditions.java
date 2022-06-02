package replitLABS;

import java.util.Scanner;

public class LAB29ifConditions {
    public static void main(String[] args) {

            Scanner input = new Scanner(System.in);
            System.out.print("In:");
            int num = input.nextInt();


            if (num > 0){

                System.out.println( num + " is positive");

            }

            if (num < 0){


                System.out.println(num + " is negative");

            }
        }
    }

