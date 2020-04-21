package com.kodilla.rps;

import java.util.Random;

public class RPS {

    public static void main(String args[]) {

        Settings settings = new Settings();
        Player player = new Player();
        Computer computer = new Computer();
        Random random = new Random();

        int rock = 1, paper = 2, scissors = 3, spock = 4, lizard = 5;

        settings.askUsername();
        String username = settings.setUsername();
        settings.askRoundsNumber();
        int roundToWin = settings.setRoundsNumber();
        settings.askDifficulty();
        int difficulty = settings.setDifficulty();
        settings.rules();
        //settings.endGame();
        //settings.resetGame();

        int playerPoints = 0, computerPoints = 0;

        int betterPlayerPoints;

        boolean end = false;

        System.out.println("Hello " + username + ". You have set game into " + roundToWin + " rounds. Have fun!!!");

        while (!end) {

            System.out.println("Make Your move");

            int p = player.makePlayerChoice();
            int c = 0;
            int hardModeLuck = random.nextInt(3);

            //Hard/Easy mode
            if (difficulty == 0) {
                c = computer.generateComputerChoice();
            } else {
                if (hardModeLuck < 3) {
                    c = computer.generateComputerChoice();
                } else {
                    if (p == 1) {
                        c = 3;
                    } else if (p == 2) {
                        c = 1;
                    } else if (p == 3) {
                        c = 2;
                    } else if (p == 4) {
                        c = 3;
                    } else if (p == 5) {
                        c = 2;
                    }
                }
            }

            System.out.println("Player choose: " + p + " || Computer choose: " + c);

            if ((p == 1 && c == 1) || (p == 2 && c == 2) || (p == 3 && c == 3) || (p == 4 && c == 4) || (p == 5 && c == 5)) {
                System.out.println("Draw");
            } else if ((p == 1 && c == 3) || (p == 1 && c == 5) ||
                       (p == 2 && c == 1) || (p == 2 && c == 4) ||
                       (p == 3 && c == 2) || (p == 3 && c == 5) ||
                       (p == 4 && c == 3) || (p == 4 && c == 1) ||
                       (p == 5 && c == 2) || (p == 5 && c == 4)) {
                System.out.println("Player win this round");
                playerPoints += 1;
            } else if ((p == 1 && c == 2) || (p == 1 && c == 4) ||
                       (p == 2 && c == 3) || (p == 2 && c == 5) ||
                       (p == 3 && c == 1) || (p == 3 && c == 4) ||
                       (p == 4 && c == 2) || (p == 4 && c == 5) ||
                       (p == 5 && c == 1) || (p == 5 && c == 3)) {
                System.out.println("Computer win this round");
                computerPoints += 1;
            }

            System.out.println("Player points: " + playerPoints + " || Computer points: " + computerPoints);

            if(playerPoints >= computerPoints) {
                betterPlayerPoints = playerPoints;
            } else {
                betterPlayerPoints = computerPoints;
            }

            if(betterPlayerPoints == roundToWin) {
                if(betterPlayerPoints == playerPoints) {
                    System.out.println("Player win the game!!!");
                } else {
                    System.out.println("Computer win the game!!!");
                }
                end = true;
            }
        }
    }
}