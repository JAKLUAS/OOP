package Constructors;
                                   // this is a templed
public class Ball {

      String color;   // this is instance veriable  ornek
      String size;
      String brand;
      double weight;


      public void throwForwards(){

           String str ; // this is local veriable ornek


            System.out.println("throwForwards");

      }
      public void strike (){

            System.out.println("strike");

      }
      public void spare (){
            System.out.println("spare");

      }
      public void miss (){

            System.out.println("miss");
      }
      public void printBallInfo(){

          System.out.println("ball info: " + color + " " + size +" "+ brand +" "+ weight);
      }


      public void printBallInfoWithoutColor() {
            System.out.println("ball info:" + size +" "+ brand +" "+ weight);
      }



public Ball(){

             System.out.println("Halil Dikmen");
}
public Ball(String newColor){
            color = newColor;
}
public Ball(String newSize,String newColor,String newBrand,double newWeight){

             color = newColor;
             size = newSize;
             brand = newBrand;
             weight = newWeight;

}

}
