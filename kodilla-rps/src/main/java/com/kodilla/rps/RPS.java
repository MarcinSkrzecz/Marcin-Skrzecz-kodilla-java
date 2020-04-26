package com.kodilla.rps;

public class RPS {

    public void game() {

        Settings settings = new Settings();

        settings.askUsername();
        String username = settings.setUsername();
        settings.askRoundsNumber();
        int roundToWin = settings.setRoundsNumber();
        settings.askDifficulty();
        int difficulty = settings.setDifficulty();
        settings.rules();
        GameRulesExecutor GRE = new GameRulesExecutor(roundToWin, difficulty);

        System.out.println("Hello " + username);

        GRE.executor();
    }
}