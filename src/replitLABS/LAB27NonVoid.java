package replitLABS;

public class LAB27NonVoid {
    public static void main(String[] args) {
        System.out.println(getSphereVolume(12.9));
    }
    public static double getSphereVolume (double r){

        double result= (4/3)* Math.PI *(r*r*r);



        return result;
    }
}
