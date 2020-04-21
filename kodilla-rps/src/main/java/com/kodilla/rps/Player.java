package com.kodilla.rps;

import java.util.Scanner;

public class Player {
    Scanner scanner = new Scanner(System.in);



    public int makePlayerChoice() {
        return scanner.nextInt();
    }

    public static void main (String args[]){
        Player player = new Player();
        System.out.println("Choice: " + player.makePlayerChoice());
    }
}

