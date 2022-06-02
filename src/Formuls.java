import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

import java.util.*;              // import java.lang.*;(all import classes )

import static java.lang.Math.round;

public class Formuls {
    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);//

        int name = input.nextInt();// when you add veriables you use nextput

        System.out.println("java" + "script");       // type two different words together

        int h= 8;
        System.out.println("halil" + h );

        System.out.println("Firstname:");
        String Firstname = input.next();   // soru olarak yoneltildiginde  bu sekilde nkomut verilir

        System.out.println(12/4); // matematik islemi yaprken direk islem yapilir

        System.out.println("address : ");
        input.nextLine();
        String address = input.nextLine(); // adres yazarken uzun oldugu icin ek ilave olarak bu formul yazilir

        System.out.print("hello");// print stays on th same  line  ln goes to the next line
        System.out.println("world"); // ln goes to the next line

        String str = "Bitcoin is crashin";
        System.out.println(str);
        System.out.println(str.toUpperCase()); // CUMLEYI BUYUTMEK ISTEDIGIMIZDE

       // final Number = 45

        double num = 45.6;
        int num2 = (int) num;
        System.out.println("num2");//45
        System.out.println("num");//45.6 // CASTING


        System.out.println(System.currentTimeMillis());
        long milliSeconds = System.currentTimeMillis();    // UNIX TIME  //ZAMAN BULMAK ICIN


        byte b1 =  56;
        byte b2 = 6;

        byte b3 = (byte) (b1 + b2 ); // sonuc intiger cikiyor ve parantez icinde byte ekleyerek byte cevriliyor


        char ch1 = 'a';
        char ch2 = 54 ;
        char ch3 = '\u0058'; // unicode ile charakter yazilabilir

        System.out.println("he said \"Java is fun\"and i agreed");  // Java is fun TIRNAK ICINDE YAZMAK ICIN \"...\" EKLENILIR

        System.out.println("Name\tage\tweight");
        System.out.println("john\t25\t90");      //  \t tab  space yerine kullanilir

        System.out.println("this\nis\na\nsentences"); // bu cumlenin bolunerek bir alt siraya yazilmasini saglar

        int dollar = 34;
        int quater = 50;
        int dimes = 23;
        int pennies = 12;
        System.out.println("DOLLARS = " + dollar + "\n"+ "Quaters = " + quater + "\n" +"Dimes = " + dimes + "\n"+"Pennies = " + pennies);
                                       //    \n sayesinde hepsi alt alta siralanir


        // MATH CLASS
        System.out.println(Math.PI*5.6*5.6); // Math PI WILL GIVE you 3,14576 pi

        System.out.println(Math.abs( 70 - 90 )); //MATH.ABS  eksi cikan matematik islemleri pozitive ceirkmek te kullanilir
        System.out.println(Math.ceil(0.8999999999));//MATH.CEIL kendisine en yakin olan tam sayiya cevirir sonuc double 1.0 cikar
        System.out.println(Math.round(0.8999999999));// MATH ROUND aynisekilde kendisine yakin tam sayiya ceker sonuc 1 olur

        int a = 56;
        int b = 30;
        int c = 23;
        System.out.println(Math.max(a,b)); //iki sayi arasindaki ki buyuk sayiyi kabul sayar

        System.out.println(Math. min(12, -34 ));// kucuk olan sasyi sonuc kabul edilir

        System.out.println(Math.max( a,( Math.max(b , c))));// genedle iki sayi arasinda buyuk sayi verir ama uc sayi kiyaslanirsa bu sekilde yapilior

        System.out.println(Math.pow(2,10 )); //iki sayisinin on katini bulur

        System.out.println(Math.pow(5,3));//5*5*5 5 sayisinin 3 kati // cikis herzaman  double olur

        System.out.println(Math.random());// returens random decimel number 0.0 - 1.0

        int randomNO = (int)(Math.random() * 10);
        System.out.println(randomNO);          // RETURNS RANDOM  INTEGER NUMBERS FROM 0-9

        // IF YOU WANNA CHANGE THE RENGE THEN
        System.out.println(10 +(int)(Math.random() * 20));// 10 ile 19 arasinda bir random sayi verir


                   // OWN METHOD
         // METHOD IS A COLLECTION OF STATETMENTS GROUPED TOGETHER TO PERFORM AN OPERATION
           // System.out.println();
        // MATH.POW
        // MATH.RANDOM
        // SC.NEXTLINE  ARE IN THE JAVA LIBRARY
        // IN THIS CLASS WE LL LEARN HOW TO DEFINE OUR OWN METHOD
        // OUR METHOD HAS TO STAY WITH IN THE CLASS
        // DRY -> DONT REPEAT YOURSELF METHOD

      char lowercase = (char)('a'+ (int) (Math.random())*26); // to take from ascii table lower case charecters









    }
}

