package HALO.Exercises;

import java.util.Scanner;

public class compoundAssignment {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //int a = 67;
        System.out.println(" enter a number : ");
        int a = input.nextInt();
        a += 3;  // a = a + 3 >70
        a -= 5; // a = a - 5 >65
        a *= 2; //a = a * 2 > 130
        a /= 3;  //a = a/3 > 43

        System.out.println("RESULT : " + a);


    }
}
