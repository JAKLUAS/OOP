package lessons;

public class StringClass {
    public static void main(String[] args) {

        String str = "my name is Halil Dikmen";
            str= str.toUpperCase();
           int firstSpace = str.indexOf(" ");
           String firstSentence = str.substring(0,firstSpace);

           int lastSpace = str.lastIndexOf(" ");
           String lastWord = str.substring(lastSpace);


            System.out.println("He said ;"+ str +" "+ firstSpace );
        System.out.println("here is the first sentence : " + firstSentence );
        System.out.println("here is the last name ;"+lastWord);
        System.out.println("the 8. character : "+ str.charAt(8));



        
        
        
        
    }
}
