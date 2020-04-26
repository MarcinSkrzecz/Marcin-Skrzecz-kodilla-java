package com.kodilla.rps;

public class MoveCheck {
    String p;
    int c;

    public MoveCheck(String playerMove, int computerMove) {
        this.p = playerMove;
        this.c = computerMove;
    }

    public void actionMoveCheck() {

        if (p.equals("1") || p.equals("2") || p.equals("3") || p.equals("4") || p.equals("5")) {
            System.out.println("Player choose: " + p + " || Computer choose: " + c);
        } else if (p.equals("x")) {
            System.out.println("End Game");
        } else if (p.equals("n")) {
            System.out.println("Reset game");
        } else {
            System.out.println("Make right move");
        }
    }


    int decision = 0;

    public int actionDrawWinLose() {
        if ((p.equals("1") && c == 1) || (p.equals("2") && c == 2) || (p.equals("3") && c == 3)
                || (p.equals("4") && c == 4) || (p.equals("5") && c == 5)) {
            decision = 0;
        } else if ((p.equals("1") && c == 3) || (p.equals("1") && c == 5) ||
                (p.equals("2") && c == 1) || (p.equals("2") && c == 4) ||
                (p.equals("3") && c == 2) || (p.equals("3") && c == 5) ||
                (p.equals("4") && c == 3) || (p.equals("4") && c == 1) ||
                (p.equals("5") && c == 2) || (p.equals("5") && c == 4)) {
            decision = 1;
        } else if ((p.equals("1") && c == 2) || (p.equals("1") && c == 4) ||
                (p.equals("2") && c == 3) || (p.equals("2") && c == 5) ||
                (p.equals("3") && c == 1) || (p.equals("3") && c == 4) ||
                (p.equals("4") && c == 2) || (p.equals("4") && c == 5) ||
                (p.equals("5") && c == 1) || (p.equals("5") && c == 3)) {
            decision = 2;
        }
        return decision;
    }
}