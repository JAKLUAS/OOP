package homeWorks;
import java.util.*;
public class UnixTIME {
    public static void main(String[] args) {

        long milliSeconds = System.currentTimeMillis();
        long days = milliSeconds / 86400000;
        milliSeconds = milliSeconds % 86400000 ;
        long hours = milliSeconds / 3600000;
        milliSeconds = milliSeconds % 3600000;
        long minutes = milliSeconds / 60000 ;
        milliSeconds = milliSeconds % 60000 ;
        long seconds = milliSeconds / 1000;
        milliSeconds = milliSeconds %100;


        System.out.println("Days = " + days);
        System.out.println("Hours = " + hours);
        System.out.println("Minutes = " + minutes);
        System.out.println("Seconds = " + seconds);



    }




}

