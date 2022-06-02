package replitLABS;

import java.util.Scanner;

public class LAB30Conditions {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("In : ");

        int num = input.nextInt();

        int a = num % 2;

        if (a == 0) {
            System.out.println(a + " is even ");
        } else {
            System.out.println(num + " is odd");
        }
    }
}










