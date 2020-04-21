package com.kodilla.rps;

import java.util.Random;

public class Computer {
    Random random = new Random();

    public int generateComputerChoice() {
        return random.nextInt(3)+1;
    }

    public static void main (String args[]){
        Computer computer = new Computer();
        System.out.println("Choice: " + computer.generateComputerChoice());
    }
}
