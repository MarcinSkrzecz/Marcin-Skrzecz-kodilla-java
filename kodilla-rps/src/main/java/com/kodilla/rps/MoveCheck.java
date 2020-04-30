package com.kodilla.rps;

public class MoveCheck {
    String p;
    int c;

    public MoveCheck(String playerMove, int computerMove) {
        this.p = playerMove;
        this.c = computerMove;
    }

    //Naming of moves
    public void actionMoveCheck() {
        String PlayerMove = null;
        String ComputerMove = null;

        if(p.equals("1")) {
            PlayerMove = "Rock";
        } else if(p.equals("2")) {
            PlayerMove = "Paper";
        } else if(p.equals("3")) {
            PlayerMove = "Scissors";
        } else if(p.equals("4")) {
            PlayerMove = "Spock";
        } else if(p.equals("5")) {
            PlayerMove = "Lizard";
        }

        if(c == 1) {
            ComputerMove = "Rock";
        } else if(c == 2) {
            ComputerMove = "Paper";
        } else if(c == 3) {
            ComputerMove = "Scissors";
        } else if(c == 4) {
            ComputerMove = "Spock";
        } else if(c == 5) {
            ComputerMove = "Lizard";
        }

        if (p.equals("1") || p.equals("2") || p.equals("3") || p.equals("4") || p.equals("5")) {
            System.out.println("Player choose: " + PlayerMove + " || Computer choose: " + ComputerMove);
        }
    }


    //0 = draw 1 = player win 2 = computer win
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