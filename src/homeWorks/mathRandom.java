package homeWorks;

public class mathRandom {
    public static void main(String[] args) {

        printReverse();           // Don't change anything here. Simply run the code to test the output.
    }


    public static void printReverse()  {
        int randomNO = (int)(Math.random() * 10);

        randomNO = 7580;
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
