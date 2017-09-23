import java.util.*;

public class RockPaperScissors {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("What is your move?");
        String move = scanner.nextLine();
        ComputerPlay();

    }

    public static String ComputerPlay() {
        Random hitme = new Random();
        int newint = hitme.nextInt(5);
        if (newint == 0) {
           return  "Rock";
        }
        if (newint == 1) {
            return  "Paper";
        }
        if (newint == 2) {
            return  "Scissors";
        }
        if (newint == 3) {
            return  "Spock";
        }
        else {
            return  "Lizard";
        }
    }

    public static String mortalKombat(String move, String ComputerPlay){
    if (move == "r" || move == "R" || move == "Rock" || move == "rock"){
        if (ComputerPlay == "Scissors" || ComputerPlay == "Lizard"){
            System.out.println("Player wins!");
        }
        if (ComputerPlay == "Paper" || ComputerPlay == "Spock"){
            System.out.println("Computer wins!");
        }
        else {
            System.out.println("This is a draw");
        }
    }
    }
