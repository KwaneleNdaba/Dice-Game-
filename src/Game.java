import java.util.Scanner;
import java.util.Random;
public class Game {
    int numDice, trials;
    Random rand ;

    Scanner scan; //allows the user to press enter

    public Game(int numDice, int trials){
        this.numDice = numDice;
        this.trials = trials;
        rand = new Random();
        scan = new Scanner(System.in);
    }

    public int play(String who, int target){
        int[] dice = new int[numDice]; //three elements
        //for each round I need an array
        // to remember the results coming from the tosses
        int point = 0;

        for(int i = 0 ;  i < trials; i++){//run 5  times
            for(int j = 0 ; j < numDice; j ++){// the number of dice for each choice is 3
                dice[j] = rand.nextInt(6) + 1;// 3 numbers coming from the random object
            }
            System.out.println("Press Enter:");
            scan.nextLine();
            for(int j : dice){
                System.out.print(j + " ");//print out the 3 numbers from the dice
            }
            System.out.println();
            for(int j = 0 ; j < numDice ; j ++){// check the number of points that matches the chosen target
                if(dice[j] == target){
                    point++;
                }
            }
            System.out.println(who + "got " + point + " points");
        }
        return point;
    }
}
