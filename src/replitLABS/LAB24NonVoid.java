package replitLABS;

public class LAB24NonVoid {
    public static void main(String[] args) {


        System.out.println(maxNum(1, 2, 3)); //should print 3
        System.out.println(maxNum(1, 3, 2)); //should print 3
        System.out.println(maxNum(3, 2, 1)); //should print 3
        System.out.println(maxNum(-3, -1, -2));


    }
    public static int maxNum (int num1 , int num2, int num3){

        int result = Math.max( num1,( Math.max(num2 , num3)));

        return result;

    }

}
