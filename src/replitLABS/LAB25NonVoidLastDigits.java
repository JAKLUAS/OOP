package replitLABS;

public class LAB25NonVoidLastDigits {
    public static void main(String[] args) {

        System.out.println( getLastDigit(134));
        System.out.println( getLastDigit(569));
        System.out.println( getLastDigit(3633));



    }
    public static int getLastDigit(int num){
        int num1 = num % 10;
                num = num / 10;
        int num2 = num % 10;

        int result = num1+num2;


        return result;
    }






}
