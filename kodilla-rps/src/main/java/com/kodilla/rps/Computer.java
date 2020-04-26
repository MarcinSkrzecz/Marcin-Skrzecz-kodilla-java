package com.kodilla.rps;

import java.util.Random;

public class Computer {
    Random random = new Random();

    public int generateComputerChoice() {
        return random.nextInt(3)+1;
    }
}
