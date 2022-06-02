package replitLABS;

public class LAB33ifConditions {
    public static void main(String[] args) {
        System.out.println(monkeyTrouble(true, true)); // true
        System.out.println(monkeyTrouble(false, false)); // true
        System.out.println(monkeyTrouble(true, false)); // false
        System.out.println(monkeyTrouble(false, true)); // false

    }public static boolean monkeyTrouble(boolean aSmile, boolean bSmile) {
        boolean a = aSmile;
        boolean b = bSmile;
        if (a==b){
            return true;

        }else{
            return false;
        }
    }
}
