package com.kodilla.rps;

import java.util.Random;

public class GameRulesExecutor {
    int roundsToWin;
    int difficulty;

    public GameRulesExecutor(int roundsToWin, int difficulty) {
        this.roundsToWin = roundsToWin;
        this.difficulty = difficulty;
    }
    Random random = new Random();
    Settings settings = new Settings();
    Player player = new Player();

    public void executor() {
        System.out.println("You have set game into" + roundsToWin + " rounds. Have fun!!!");
        System.out.println("Make Your move");

        int hardModeLuck = random.nextInt(3);

        int playerPoints = 0, computerPoints = 0;

        boolean end = false;

        while (!end) {
            String p = player.makePlayerChoice();

            //Hard/Easy mode
            EasyHardMode easyHardMode = new EasyHardMode(p, difficulty, hardModeLuck);
            int c = easyHardMode.easyHardModeComputerMove();


            //Move 1-5 or x-End or n-Reset
            MoveCheck moveCheck = new MoveCheck(p, c);
            moveCheck.actionMoveCheck();
            //0 = draw 1 = player win 2 = computer win
            moveCheck.actionDrawWinLose();

            if(moveCheck.actionDrawWinLose() == 0) {
                System.out.println("Draw");
                System.out.println("Player points: " + playerPoints + " || Computer points: " + computerPoints);
            } else if (moveCheck.actionDrawWinLose() == 1) {
                System.out.println("Player win this round");
                playerPoints += 1;
                System.out.println("Player points: " + playerPoints + " || Computer points: " + computerPoints);
            } else if (moveCheck.actionDrawWinLose() == 2) {
                System.out.println("Computer win this round");
                computerPoints += 1;
                System.out.println("Player points: " + playerPoints + " || Computer points: " + computerPoints);
            }


            BetterPlayerPoints bpb = new BetterPlayerPoints(playerPoints, computerPoints);

            if (bpb.points() == roundsToWin) {
                if (bpb.points() == playerPoints) {
                    System.out.println("Player win the game!!!");
                } else {
                    System.out.println("Computer win the game!!!");
                }
                end = true;
            }
        }
        settings.whatAfterGame();
    }
}
