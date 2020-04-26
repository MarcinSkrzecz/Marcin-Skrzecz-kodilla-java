package com.kodilla.rps;

public class BetterPlayerPoints {
    int p;
    int c;

    public BetterPlayerPoints(int playerPoints, int computerPoints) {
        this.p = playerPoints;
        this.c = computerPoints;
    }

    int points = 0;

    public int points() {
        if (p >= c) {
            points = p;
        } else {
            points = c;
        }
        return points;
    }
}
