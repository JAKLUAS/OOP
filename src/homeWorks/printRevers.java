package homeWorks;

public class printRevers {
    public static void main(String[] args) {

        printReverse(); // Don't change anything here. Simply run the code to test the output.
    }


    public static void printReverse()  {
        int randomNO = (10+(int)(Math.random() * 10000));
        System.out.println(randomNO);
        int A = randomNO % 10 ;
        randomNO = randomNO / 10;
        int B = randomNO % 10;
        randomNO = randomNO / 10;
        int C = randomNO % 10;
        randomNO = randomNO / 10;
        int D = randomNO;
        System.out.println(""+A+B+C+D);

    }
}
