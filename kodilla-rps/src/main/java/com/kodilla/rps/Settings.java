package com.kodilla.rps;

import java.util.Scanner;

public class Settings {

    Scanner scanner = new Scanner(System.in);
    GameApplicationEngine gae = new GameApplicationEngine();

    public void askUsername() {
        System.out.println("Please set Your Username");
    }
    public String setUsername() {
        return scanner.nextLine();
    }

    public void askRoundsNumber() {
        System.out.println("Please set number of winning rounds to play");
    }
    public int setRoundsNumber() {
        int number;
        while(true) {
            String roundsNumber = scanner.nextLine();
            try {
                number = Integer.parseInt(roundsNumber);
            } catch (Exception e) {
                System.out.println("Please provide valid number");
                continue;
            }
            if(number > 0) {
                return number;
            }
            System.out.println("Provided number is too low");
        }
    }

    public void askDifficulty() {
        System.out.println("Please set difficulty:");
        System.out.println("Normal - press 0");
        System.out.println("Hard - press 1");
    }
    public int setDifficulty() {
        int difficulty;
        while(true) {
            String difficultySelect = scanner.nextLine();
            try {
                difficulty = Integer.parseInt(difficultySelect);
            } catch (Exception e) {
                System.out.println("Please provide valid number");
                continue;
            }
            if(difficulty == 0 || difficulty == 1) {
                return difficulty;
            }
            System.out.println("Provided different than other than 0 or 1");
        }
    }

    public void rules() {
        System.out.println("But first keys info:");
        System.out.println("key 1 - play Rock \n" +
                        "key 2 - play Paper \n" +
                        "key 3 - play Scissors \n" +
                        "key 4 - play Spock \n" +
                        "key 5 - play Lizard \n" +
                        "key x - end game \n" +
                        "key n - restart game");
        System.out.println("Lets start");
    }

    public void endGame() {
        System.out.println("Do You want to end actual game?");
        System.out.println("Yes - press y");
        System.out.println("No - press n");
        boolean endGameAction = false;
        while(!endGameAction) {
            String endGameQuestion = scanner.nextLine();
            if(endGameQuestion.equals("y")) {
                System.out.println("Thanks for good game :) Bye!!!");
                System.exit(0);
                endGameAction = true;
            } else if (endGameQuestion.equals("n")) {
                //nothing
                endGameAction = true;
                return;
            } else {
                System.out.println("Wrong choice");
            }
        }
    }

    public void resetGame() {
        System.out.println("Do You want to reset actual game?");
        System.out.println("Yes - press y");
        System.out.println("No - press n");
        boolean resetGameAction = false;
        while(!resetGameAction) {
            String resetGameQuestion = scanner.nextLine();
            if(resetGameQuestion.equals("y")) {
                System.out.println("******************************");
                System.out.println("New Game Starting...");
                System.out.println("******************************");
                gae.game();
            } else if (resetGameQuestion.equals("n")) {
                //nothing
                resetGameAction = true;
            } else {
                System.out.println("Wrong choice");
            }
        }
    }

    public void whatAfterGame() {
        System.out.println("******************************");
        System.out.println("Thanks for playing");
        System.out.println("******************************");
        System.out.println("End game - press n");
        System.out.println("New game - press x");
        System.out.println("******************************");

        boolean wagaction = false;
        while(!wagaction) {
            String wagChoice = scanner.nextLine();
            if(wagChoice.equals("n")) {
                System.out.println("Thanks for good game :) Bye!!!");
                System.exit(0);
            } else if (wagChoice.equals("x")) {
                System.out.println("******************************");
                System.out.println("New Game Starting...");
                System.out.println("******************************");
                gae.game();
            } else {
                System.out.println("Wrong choice");
                System.out.println("End game - press n");
                System.out.println("New game - press x");
            }
        }
    }
}