import java.util.*;
import java.lang.String;

public class RockPaperScissors {
    public static void main(String[] args) {
        String staticComputer = ComputerPlay();
        System.out.println(staticComputer);
        Scanner scanner = new Scanner(System.in);
        System.out.println("What is your move?");
        String move = scanner.nextLine();
        String upperMove = move.toUpperCase();
        mortalKombat(upperMove, staticComputer);
        battleReport(upperMove, staticComputer);

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


    public static void mortalKombat(String move, String ComputerPlay) {
        if (move.equals("R)")) {
            if (ComputerPlay.equals("Scissors") || ComputerPlay.equals("Lizard")) {
                System.out.println("Player wins!");
            }
            if (ComputerPlay.equals("Paper") || ComputerPlay.equals("Spock")) {
                System.out.println("Computer wins!");
            } else {
                System.out.println("It is a draw");
            }
        }
        if (move.equals("P")) {
            if (ComputerPlay.equals("Spock") || ComputerPlay.equals("Rock")) {
                System.out.println("Player wins!");
            }
            if (ComputerPlay.equals("Scissors") || ComputerPlay.equals("Lizard")) {
                System.out.println("Computer wins!");
            } else {
                System.out.println("It is a draw");
            }
        }

        if (move.equals("S")) {
            if (ComputerPlay.equals("Lizard") || ComputerPlay.equals("Paper")) {
                System.out.println("Player wins!");
            }
            if (ComputerPlay.equals("Rock") || ComputerPlay.equals("Spock")) {
                System.out.println("Computer wins!");
            } else {
                System.out.println("It is a draw");
            }
        }
        if (move.equals("L")) {
            if (ComputerPlay.equals("Paper") || ComputerPlay.equals("Spock")) {
                System.out.println("Player wins!");
            }
            if (ComputerPlay.equals("Scissors") || ComputerPlay.equals("Rock")) {
                System.out.println("Computer wins!");
            } else {
                System.out.println("It is a draw");
            }
        }
        if (move.equals("O")) {
            if (ComputerPlay.equals("Scissors") || ComputerPlay.equals("rock")) {
                System.out.println("Player wins!");
            }
            if (ComputerPlay.equals("Paper") || ComputerPlay.equals("Lizard")) {
                System.out.println("Computer wins!");
            } else {
                System.out.println("It is a draw");
            }
        }
    }

    public static void battleReport(String move, String Computerplay) {
        String combination = move + Computerplay;
        if (!move.equals("O")) {
            if (move.charAt(0) == (Computerplay.charAt(0))) {
                System.out.println("You both picked " + Computerplay + "!");
            }
        }
        if (move.equals("O")) {
            if (Computerplay.equals("Spock")) {
                System.out.println("You both picked " + Computerplay + "!");
            }
        }

        if (combination.equals("SPaper") || combination.equals("PScissors")) {
            System.out.println("Scissors cut Paper");
        }
        if (combination.equals("RPaper") || combination.equals("PRock")) {
            System.out.println("Paper covers Rock");
        }
        if (combination.equals("RLizard") || combination.equals("LRock")) {
            System.out.println("Rock crushes Lizard");
        }
        if (combination.equals("OLizard") || combination.equals("LSpock")) {
            System.out.println("Lizard poisons Spock");
        }
        if (combination.equals("RScissors") || combination.equals("SRock")) {
            System.out.println("Rock crushes Scissors");
        }
        if (combination.equals("OScissors") || combination.equals("SSpock")) {
            System.out.println("Spock smashes Scissors");
        }
        if (combination.equals("LScissors") || combination.equals("SLizard")) {
            System.out.println("Scissors decapitate Lizards");
        }
        if (combination.equals("LPaper") || combination.equals("PLizard")) {
            System.out.println("Lizard eats Paper");
        }
        if (combination.equals("OPaper") || combination.equals("PSpock")) {
            System.out.println("Paper disproves Spock");
        }
        if (combination.equals("ORock") || combination.equals("RSpock")) {
            System.out.println("Lizard eats Paper");
        }
    }
}

