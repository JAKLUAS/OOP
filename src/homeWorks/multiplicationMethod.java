package homeWorks;

public class multiplicationMethod {
    public static void main(String[] args) {
        System.out.println("         multiplication table");
        for (int r = 1; r <=10 ; r++) {
            for (int c = 1; c <=10; c++) {
                System.out.printf("%5d",r*c);
            }
            System.out.println(" ");
        }
    }
}
