package Constructors;

public class tester {
    public static void main(String[] args) {


        Ball ball = new Ball();
        ball.printBallInfo();
        ball.throwForwards();
        Ball ball2 = new Ball("green");
        ball2.printBallInfo();
        Ball ball3 = new Ball("black","large","adidas",9.5);
        ball3.printBallInfo();




    //    String str3 = new String(new char[]{'a','b','c'});


    }
}
