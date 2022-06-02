package replitLABS;

public class LAB26NonVoidArea {
    public static void main(String[] args) {
        System.out.println(getArea(50.8));
    }
    public static double getArea(double r){
        double area = Math.PI * r * r;
        return area;
    }
}
