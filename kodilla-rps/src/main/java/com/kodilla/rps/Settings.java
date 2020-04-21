package com.kodilla.rps;

import java.util.Scanner;

public class Settings {

    Scanner scanner = new Scanner(System.in);

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
        System.out.println("Czy na pewno zakończyć grę? y/n");
        String endGameQuestion = scanner.next();
        if(endGameQuestion.equals("y")) {
            System.exit(0);
        }
    }

    public void resetGame() {
        System.out.println("Czy na pewno zakończyć aktualną grę? y/n");
        String newGameQuestion = scanner.next();
        if(newGameQuestion.equals("y")) {
            System.exit(0);
            askUsername();
            setRoundsNumber();
            rules();
        }
    }

    public void whatAfterGame() {
        System.out.println("wybór pomiędzy zakończeniem gry (klawisz x) i rozpoczęciem nowej gry (klawisz n)");
    }
}