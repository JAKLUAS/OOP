package lessons;

    import java.util.Scanner;
    class Main {
        public static void main(String[] args) {

            System.out.println( "please enter 1 for Rock,2 for Paper, and 3 for Scissors : " );
            Scanner input = new Scanner(System.in);

            int user = input.nextInt();
            int computer = 1 +(int)(Math.random() * 3);
            System.out.println(computer);

            switch(computer){
                case 1:
                    switch(user){
                        case 1:
                            System.out.println("you chose rock.computer chose rock.Draw!");
                            break;
                        case 2:
                            System.out.println("You chose paper. Computer chose rock. You win! ");
                            break;
                       case 3:
                           System.out.println("You chose Scissors . Computer chose rock. You Lost!");
                            break;

                    }
                      break;

                case 2:
                    switch(user){
                        case 1:
                            System.out.println("You chose rock. Computer chose paper. you lost!");
                            break ;

                        case 2:
                            System.out.println("You chose paper. Computer chose Paper. Draw!");
                            break;


                        case 3 :
                            System.out.println("You chose scissors. Computer chose paper. You win!");
                            break;
                    }
                        break;
                case 3 :
                    switch (user){

                        case 1 :
                            System.out.println("You chose rock. Computer chose Scissors. You lost!");
                            break;

                        case 2:
                            System.out.println("You chose paper. Computer chose Scissors. You Won!");
                            break;

                        case 3:
                            System.out.println("You chose Scissors. Computer chose Scissors. Draw!");
                            break;
                    }





            }






        }
























}
