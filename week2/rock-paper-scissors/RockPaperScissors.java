import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class RockPaperScissors {
    public static void main(String[] args) {
    
        Scanner s = new Scanner(System.in);

        System.out.println("Lets play Rock Paper Scissors.");
        System.out.println("When i say 'shoot', choose: Rock, Paper, Scissors");
        System.out.println("\nAre you ready? Write 'yes' if you are");

        String response = s.nextLine();
        String resultado; 
        String choice;
        if ("yes".equals(response.toLowerCase())){
            System.out.println("Great!");
            while (true) {
                System.out.println("Rock - paper - scissors, shoot!");
                choice = s.nextLine();
                String computerC = computerChoice();
                resultado = result(computerC, choice);
                
                System.out.println("\nComputer: " + computerC);
                System.out.println("User: " + choice);
                System.out.println(resultado + "\n");
                if (!resultado.equals("It's a tie")) { break; }
            }
        }
        
    }

    /**
     * Function name: ComputerChoice
     * @return choice (String)
     * 
     * Inside the function:
     *  1. Pick a random number between 0 and 2
     *  2. if 0: Rock
     *     if 1: Paper
     *     if 2: Scissors
     */
    public static String computerChoice(){
        String[] choices = {"Rock", "Paper", "Scissors"};

        int randomNum = ThreadLocalRandom.current().nextInt(0, 2 + 1);
        return choices[randomNum]; 
    }

    /**
     * 
     * @param computerChoice (String)
     * @param userChoice (String)
     * @return resultado (String)
     */
    public static String result(String computerChoice, String userChoice){

        String resultado = "";

        if ("rock".equals(userChoice.toLowerCase())) {
            if ("sissors".equals(computerChoice.toLowerCase())) {
                return "You win!";
            }
            else if ("paper".equals(computerChoice.toLowerCase())) {
                return "You lose!";
            } else { return "It's a tie"; }
        }
        else if ("paper".equals(userChoice.toLowerCase())) {
            if ("sissors".equals(computerChoice.toLowerCase())) {
                return "You lose!";
            }
            else if ("rock".equals(computerChoice.toLowerCase())) {
                return "You win!";
            } else { return "It's a tie"; }
        }
        else if ("scissors".equals(userChoice.toLowerCase())) {
            if ("rock".equals(computerChoice.toLowerCase())) {
                return "You lose!";
            }
            else if ("paper".equals(computerChoice.toLowerCase())) {
                return "You win!";
            } else { return "It's a tie"; }
        }

        return resultado;
    }

}