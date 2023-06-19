import java.util.Scanner;
import java.util.Random;
public class Main {
    public static void main(String[] args) {
        int numDice = 3 , trials = 5; //
        // only 3 numbers in each dice u roll
        // the dice will roll 5 times

        int playerPoints = 0, computerPoints = 0;
        //variable to remember my choice number and the computer number

        Random choice = new Random();// creating a random object for choosing a computer number

        Scanner scan = new Scanner(System.in);
        System.out.println("Choose your target number:");
        int playerTarget = scan.nextInt();// the number for the player
        Game player = new Game(numDice , trials);// Game object or creating a new game

        playerPoints = player.play("Player", playerTarget);//play the game

        int computerTarget = choice.nextInt(6) + 1 ; // generating a number between 1 to 6
        System.out.println("Computer's target is : " + computerTarget);

        Game computer =  new Game(numDice, trials);//creating game for the computer

        computerPoints = computer.play("Computer", computerTarget);// computer plays the game


        if(playerPoints > computerPoints){
            System.out.println("You win");
        }else if(playerPoints < computerPoints){
            System.out.println("Computer wins");
        }else {
            System.out.println("Draw");
        }
        scan.close();
    }
}