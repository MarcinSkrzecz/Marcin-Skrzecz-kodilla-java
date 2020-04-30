package com.kodilla.rps;

public class EasyHardMode {
    String p;
    int difficulty;
    int hardModeLuck;

    public EasyHardMode(String playerMove, int difficulty, int hardModeLuck) {
        this.p = playerMove;
        this.difficulty = difficulty;
        this.hardModeLuck = hardModeLuck;
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
                switch (p) {
                    case "1":
                    case "4":
                        c = 3;
                        break;
                    case "2":
                        c = 1;
                        break;
                    case "3":
                    case "5":
                        c = 2;
                        break;
                }
            }
        }
        return c;
    }
}


