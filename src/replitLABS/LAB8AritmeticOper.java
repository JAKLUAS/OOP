package replitLABS;
import java.util.Scanner;
public class LAB8AritmeticOper {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        
        System.out.println("enter 2 numbers:");

        int a = input.nextInt();
        int b = input.nextInt();

        System.out.println("addition : " +(a+b));
        System.out.println("Subracter : " +(a-b));
        System.out.println("multiply : " +(a*b));
        System.out.println("divide : " +(float)((float)a/(float)b));
        System.out.println("reminder : " +(a%b));





    }
}
