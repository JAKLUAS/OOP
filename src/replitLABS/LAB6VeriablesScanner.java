package replitLABS;
import java.util.Scanner;
public class LAB6VeriablesScanner {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("On what day of the month were you born?");

       int day = input.nextInt();
        day = 8;
        System.out.println("What is the name of the month in which you were born? ");

        String month = input.next();
        month = " May";

        System.out.println("During what year were you born? ");
         int year = input.nextInt();
         year = 1981;

        System.out.println("You were born on May 8, 1981. You're mighty old!");






    }
}
