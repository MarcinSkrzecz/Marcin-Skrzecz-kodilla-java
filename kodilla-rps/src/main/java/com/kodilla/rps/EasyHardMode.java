package com.kodilla.rps;

public class EasyHardMode {
    String p;
    int difficulty;
    int hardModeLuck;

    public EasyHardMode(String playerMove, int difficulty, int hardModeLuck) {
        this.p = playerMove;
        this.difficulty = difficulty;
    }

    Computer computer = new Computer();

    int c = 0;

    public int easyHardModeComputerMove() {
        if (difficulty == 0) {
            c = computer.generateComputerChoice();
        } else {
            if (hardModeLuck < 3) {
                c = computer.generateComputerChoice();
            } else {
                if (p.equals("1")) {
                    c = 3;
                } else if (p.equals("2")) {
                    c = 1;
                } else if (p.equals("3")) {
                    c = 2;
                } else if (p.equals("4")) {
                    c = 3;
                } else if (p.equals("5")) {
                    c = 2;
                }
            }
        }
        return c;
    }
}


