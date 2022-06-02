package Constructors;
                                 //this is an object
public class OOPdemo {

    public static void main(String[] args) {

     //  String str = new String();
       // String str2 = new String("bskfkf");

        Ball ball1 = new Ball();
//instance veriables are initialized to default values when you create an object of the class
       //System.out.println(ball1.color);
       // System.out.println(ball1.brand);
       // System.out.println(ball1.size);
       // System.out.println(ball1.weight);

        ball1.color = "green";
        ball1.brand = "nike";
        ball1.size = "xl";
        ball1.weight= 10.7;

        System.out.println(ball1.color);
        System.out.println(ball1.brand);
        System.out.println(ball1.size);
        System.out.println(ball1.weight);

       ball1.strike();
       ball1.printBallInfo();


       Ball ball2 = new Ball();

       ball2.color = "red";
       ball2.brand = "adidas";
       ball2.size = "xxl";
       ball2.weight= 9.9;

       ball2.printBallInfo();
       ball2.printBallInfoWithoutColor();

         Ball ball3 = new Ball();
        ball3.color = "black";
        ball3.brand = "adidas";
        ball3.size = "large";
        ball3.weight= 9.5;

        ball3.printBallInfo();
    }
}
