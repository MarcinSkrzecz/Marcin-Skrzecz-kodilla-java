package com.kodilla.rps;

public class EndGameCondition {
    int p;
    int c;
    int roundsToWin;

    public EndGameCondition(int playerPoints, int computerPoints, int roundsToWin) {
        this.p = playerPoints;
        this.c = computerPoints;
        this.roundsToWin = roundsToWin;
    }

    int points = 0;

    public void winner() {
        if (p >= c) {
            points = p;
        } else {
            points = c;
        }

        if(points == roundsToWin) {
            if(points == p) {
                System.out.println("Player win the game!!!");
            } else {
                System.out.println("Computer win the game!!!");
            }
        }
    }

    boolean endgameTF = false;

    public boolean endGame() {
        if (p >= c) {
            points = p;
        } else {
            points = c;
        }

        if(points == roundsToWin) {
            endgameTF = true;
        }
        return endgameTF;
    }
}