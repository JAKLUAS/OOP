package replitLABS;

public class LAB34Conditions {
    public static void main(String[] args) {
        System.out.println(division(33));
    }

    public static boolean division(int num) {
        int a = num;

        if (a%3==0|a%5==0){
            return true;

        }else {
            return false;
        }
    }
}