package lessons;
import java.util.*;
public class modulo2 {
    public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number between 1- 999:");
       int numb= scan.nextInt();
       numb=234;
       int a = numb % 10;
       int b = numb/10;
       int c = b % 10 ;
       int d=  b / 10;

        System.out.println(a + c + d);






    }




}
