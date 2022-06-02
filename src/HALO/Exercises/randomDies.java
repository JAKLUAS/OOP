package HALO.Exercises;

public class randomDies {
    public static void main(String[] args) {

        int randomDie1 = 1 + (int)(Math.random()*6);
        int randomDie2 = 1+ (int)(Math.random()*6);

        System.out.println("Die1 =" + randomDie1);
        System.out.println("Die2 =" + randomDie2);
        int total = randomDie1+randomDie2;
        System.out.println("Total = " + total );
    }
}