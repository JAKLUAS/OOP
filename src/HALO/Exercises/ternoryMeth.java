package HALO.Exercises;

public class ternoryMeth {
    public static void main(String[] args) {


                String name ="Timmy and";
                String lastName = "Burman";
                System.out.println(name.substring(0,5));
        System.out.println(name.charAt(3)); // kelimenin  icinde 3. rakami goseterir

        System.out.println(name.length()); // kelimeyin toplam harf sayisini verir

       System.out.println(name.substring(2)); // 2. siradaki arften baslar timmy ise -mmy diye cikar

       System.out.println((name.substring(3)).concat(lastName));// kelimeyi kesip baska kelime ile birlestirir

        System.out.println(lastName.toUpperCase()); // butun harfleri buyutur

        System.out.println(name.toLowerCase()); // butun harfleri kucultur

        System.out.println(name.trim()); // ekstra bosluklari kirpar

        System.out.println(name.contains("en")); // cumlenin icerisinde aradigimiz seyi bulmaya yarar ...true yada false dir
        System.out.println(lastName.endsWith("ne"));

        String str = "to you ,you won a car";
          System.out.println(str.indexOf('c'));  // karakterin bulundugu ilk sirayi belirtir
          System.out.println(str.lastIndexOf('o')); // karakterin bulundun sirayi sondan tespit eder

        System.out.println(str.lastIndexOf("you"));// cumleyide kesip bolebilir

        String str2 = str.substring(str.indexOf("you"),str.indexOf("you")+3);
        System.out.println(str2);          // cumlenin  icerisinden kelime cikarma formulu






            }




        }




