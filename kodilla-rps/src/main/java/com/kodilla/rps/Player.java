package com.kodilla.rps;

import java.util.Scanner;

public class Player {
    Scanner scanner = new Scanner(System.in);
    Settings settings = new Settings();

    public String makePlayerChoice() {
        String playerChoice = scanner.nextLine();

        if(playerChoice.equals("1") || playerChoice.equals("2") || playerChoice.equals("3") ||
           playerChoice.equals("4") || playerChoice.equals("5")) {
            return playerChoice;
        } else if(playerChoice.equals("x")) {
            settings.endGame();
        } else if(playerChoice.equals("n")) {
            settings.resetGame();
        }
        return playerChoice;
    }

 /*   public String moveName() {
        String input = makePlayerChoice();

        if("1".equals(input)) {
            return "Rock";
        } else if("2".equals(input)) {
            return "Paper";
        } else if("3".equals(input)) {
            return "Scissors";
        } else if("4".equals(input)) {
            return "Spock";
        } else if("5".equals(input)) {
            return "Lizard";
        }
    }

  */
}

