package replitLABS;

public class LAB32Conditions {
    public static void main(String[] args) {
        System.out.println(hasTeen(13, 20, 10)); // true
        System.out.println(hasTeen(12, 18, 20)); // true
        System.out.println(hasTeen(20, 10, 13)); // true
        System.out.println(hasTeen(1, 20, 12)); // false
        System.out.println(hasTeen(12, 20, 19)); // true
        System.out.println(hasTeen(12, 9, 20)); // false
    }
    public static boolean hasTeen(int a , int b , int c  ){

        if(a>=13 && a<=19){
           return true;
        }
        if (b>=13 && b<=19){
            return true;
        }
        if (c>=13 && c<=19){
            return true;
        }
        else{
            return false;

    }
} }
