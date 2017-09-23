import java.util.*;

public class RockPaperScissors {
    public static void main(String[] args) {
        String staticComputer = ComputerPlay();
        Scanner scanner = new Scanner(System.in);
        System.out.println("What is your move?");
        String move = scanner.nextLine();
        mortalKombat( convert(move), staticComputer);
        //battleReport(move, staticComputer);

    }

    public static String ComputerPlay() {
        Random hitme = new Random();
        int newint = hitme.nextInt(5);
        if (newint == 0) {
            return "Rock";
        }
        if (newint == 1) {
            return "Paper";
        }
        if (newint == 2) {
            return "Scissors";
        }
        if (newint == 3) {
            return "Spock";
        } else {
            return "Lizard";
        }
    }

    public static String convert (String move){
        if (move == "r" || move == "R" || move == "Rock" || move == "rock"){
            return "Rock";
        }
        if (move == "p" || move == "P" || move == "Paper" || move == "paper") {
            return "Paper";
        }
        if (move == "s" || move == "S" || move == "Scissors" || move == "scissors"){
            return "Scissors";
        }
        if (move == "l" || move == "L" || move == "Lizard" || move == "lizard") {
            return "Lizard";
        }
        if (move == "o" || move == "O" || move == "Spock" || move == "spock") {
           return "Spock";
        }
        else{
            System.out.println("this is not a legal input, I will pick Rock for you");
            return "Rock";
        }


    }

    public static void mortalKombat(String move, String ComputerPlay) {
        if (move == "Rock") {
            if (ComputerPlay == "Scissors" || ComputerPlay == "Lizard") {
                System.out.println("Player wins!");
            }
            if (ComputerPlay == "Paper" || ComputerPlay == "Spock") {
                System.out.println("Computer wins!");
            } else {
                System.out.println("This is a draw");
            }
        }
        if (move == "Paper") {
            if (ComputerPlay == "Spock" || ComputerPlay == "Rock") {
                System.out.println("Player wins!");
            }
            if (ComputerPlay == "Scissors" || ComputerPlay == "Lizard") {
                System.out.println("Computer wins!");
            } else {
                System.out.println("This is a draw");
            }
        }

        if (move == "Scissors") {
            if (ComputerPlay == "Lizard" || ComputerPlay == "Paper") {
                System.out.println("Player wins!");
            }
            if (ComputerPlay == "Rock" || ComputerPlay == "Spock") {
                System.out.println("Computer wins!");
            } else {
                System.out.println("This is a draw");
            }
        }
        if (move == "Lizard") {
            if (ComputerPlay == "Paper" || ComputerPlay == "Spock") {
                System.out.println("Player wins!");
            }
            if (ComputerPlay == "Scissors" || ComputerPlay == "Rock") {
                System.out.println("Computer wins!");
            } else {
                System.out.println("This is a draw");
            }
        }
        if (move =="Spock") {
            if (ComputerPlay == "Scissors" || ComputerPlay == "rock") {
                System.out.println("Player wins!");
            }
            if (ComputerPlay == "Paper" || ComputerPlay == "Lizard") {
                System.out.println("Computer wins!");
            } else {
                System.out.println("This is a draw");
            }
        }
    }}

   // public static void battleReport(String move, String Computerplay ){
   //     if (move == "Rock" || Computerplay == "Rock")
//

   // }

   // }

