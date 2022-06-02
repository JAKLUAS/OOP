package HALO.Exercises;
import java.util.Scanner;
public class DoAtmPin {
    public static void main(String[] args) {

        Scanner input= new Scanner(System.in);
        System.out.println("welcom to HALO BANK");
        int count = 0;
        int pass;
        int correctPassword = 4747;

        do{
            System.out.println("enter the pin number");
            pass = input.nextInt();
            count++;
        }while(pass!=correctPassword && count<3);

        if (pass == correctPassword){
            System.out.println("welcome to your account");
        }else if (pass>=3){
            System.out.println("You entered wrong pin and your card deactivated");
            System.out.println("Please call your costumer service");
        }



    }

}
