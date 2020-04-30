package com.kodilla.rps;

public class EngineExecutor {
    int roundsToWin;
    int difficulty;
    String username;
    int hardModeLuck;

    public EngineExecutor(String username, int roundsToWin, int difficulty, int hardModeLuck) {
        this.roundsToWin = roundsToWin;
        this.difficulty = difficulty;
        this.username = username;
        this.hardModeLuck = hardModeLuck;
    }

    Settings settings = new Settings();
    Player player = new Player();

    public void executor() {
        if(username.length() > 0) {
            System.out.println("Hello " + username + ". You have set game into " + roundsToWin + " rounds. Have fun!!!");
        } else {
            System.out.println("Hello Player. You have set game into " + roundsToWin + " rounds. Have fun!!!");
        }

        System.out.println("Make Your move");

        int playerPoints = 0, computerPoints = 0;

        boolean end = false;

        while (!end) {
            String p = player.makePlayerChoice();

            //Hard/Easy mode
            EasyHardMode easyHardMode = new EasyHardMode(p, difficulty, hardModeLuck);
            int c = easyHardMode.easyHardModeComputerMove();


            //Naming of moves
            MoveCheck moveCheck = new MoveCheck(p, c);
            moveCheck.actionMoveCheck();

            //0 = draw 1 = player win 2 = computer win
            moveCheck.actionDrawWinLose();
            //Counting of points and communicates based on draw/win/lose decision
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

            //Check loop "while" conditions to end game
            EndGameCondition egc = new EndGameCondition(playerPoints, computerPoints, roundsToWin);
            egc.winner();
            end = egc.endGame();
        }
        settings.whatAfterGame();
    }
}