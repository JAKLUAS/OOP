package homeWorks;

import java.util.Scanner;

public class modulo1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter a number : ");
        int num = input.nextInt();
       // num = 87748;
        int a = num % 10;         //8
        num = num / 10;           //8774
        int b = num % 10;         //4
        num = num / 10;           //877
        int c = num % 10;         //7
        num = num / 10;           //87
        int d = num % 10;         //7
        num = num / 10;           //8
        int f = num;

        System.out.println("a :" + a );
        System.out.println("b :" + b );
        System.out.println("c :" + c );
        System.out.println("d :" + d );
        System.out.println("f :" + f );
        System.out.println("a+b+c+d+f  is : " + (a+b+c+d+f));





    }
}
