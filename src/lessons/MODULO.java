package lessons;
import java.util.*;
public class MODULO {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("enter a number :");
     int num = input.nextInt();
 //5678
        int a = num %10; // 8
        num = num / 10; // 567
        int b = num % 10; //7
        num =num / 10;  //56
        int c = num % 10; //6
        num= num /10;
        int d = num;
        System.out.println( "" + a + b + c + d);









    }

}
