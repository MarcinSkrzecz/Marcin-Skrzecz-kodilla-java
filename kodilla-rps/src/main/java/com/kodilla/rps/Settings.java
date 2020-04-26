package com.kodilla.rps;

import java.util.Scanner;

public class Settings {

    Scanner scanner = new Scanner(System.in);
    RPS rps = new RPS();

    public void askUsername() {
        System.out.println("Please set Your Username");
    }
    public String setUsername() {
        return scanner.next();
    }

    public void askRoundsNumber() {
        System.out.println("Please set number of wining rounds to play");
    }
    public int setRoundsNumber() {
        return scanner.nextInt();
    }

    public void askDifficulty() {
        System.out.println("Please set difficulty: 0 = normal, 1 = hard");
    }

    public int setDifficulty() {
        return scanner.nextInt();
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
        System.out.println("Do You want to end game? y/n");
        boolean endGameAction = false;
        while(!endGameAction) {
            String endGameQuestion = scanner.next();
            if(endGameQuestion.equals("y")) {
                System.exit(0);
                endGameAction = true;
            } else if (endGameQuestion.equals("n")) {
                //nothing
                endGameAction = true;
            } else {
                System.out.println("Wrong choice");
            }
        }
    }

    public void resetGame() {
        System.out.println("Do You want to reset actual game? y/n");
        boolean resetGameAction = false;
        while(!resetGameAction) {
            String resetGameQuestion = scanner.next();
            if(resetGameQuestion.equals("y")) {
                System.out.println("******************************");
                System.out.println("New Game Starting... >>>> NIE DZIALAAAAAAAAAAAAAA");
                System.out.println("******************************");
                resetGameAction = true;
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
        System.out.println("If you want to end game press n. For new game press n");
        System.out.println("******************************");

        boolean wagaction = false;
        while(!wagaction) {
            String wagChoice = scanner.next();
            if(wagChoice.equals("n")) {
                System.exit(0);
                wagaction = true;
            } else if (wagChoice.equals("n")) {
                System.out.println("******************************");
                System.out.println("New Game Starting... >>>> NIE DZIALAAAAAAAAAAAAAA");
                System.out.println("******************************");
                rps.game();
            } else {
                System.out.println("Wrong choice");
            }
        }
    }
}