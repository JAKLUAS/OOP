package HALO.Exercises;
import java.util.*;
public class identification {
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

        System.out.println("First name :");
        String Firstname = input.next();

        System.out.println("Last name :");
        String Lastname = input.next();

        System.out.println("Age :");
        int Age = input.nextInt();

        System.out.println("cell phone number :");
        long number = input.nextLong();

        System.out.println("ssn number :");
        long ssn = input.nextLong();

        System.out.println("married true / false");
        boolean marriage = input.nextBoolean();

        System.out.println("address : ");
        input.nextLine();
        String address = input.nextLine();


        System.out.println("here the info that you entered:");

        System.out.println("First name : " + Firstname );
        System.out.println("Last name : " + Lastname  );
        System.out.println("Age : " + Age );
        System.out.println("cell phone number : " + number);
        System.out.println("SSN NUMBER : " + ssn );
        System.out.println(" marriage " + marriage );
        System.out.println("Address : " + address );




    }
}
