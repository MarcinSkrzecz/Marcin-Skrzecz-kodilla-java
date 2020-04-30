package com.kodilla.rps;

import java.util.Random;

public class GameApplicationEngine {

    public void game() {

        Settings settings = new Settings();

        settings.askUsername();
        String username = settings.setUsername();

        settings.askRoundsNumber();
        int roundToWin = settings.setRoundsNumber();

        settings.askDifficulty();
        int difficulty = settings.setDifficulty();

        settings.rules();

        Random random = new Random();
        int hardModeLuck = random.nextInt(3);

        EngineExecutor ee = new EngineExecutor(username, roundToWin, difficulty, hardModeLuck);
        ee.executor();
    }
}