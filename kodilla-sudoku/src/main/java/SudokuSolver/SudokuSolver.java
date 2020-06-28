package SudokuSolver;

public class SudokuSolver {

    public void solveSudoku(SudokuBoard sudokuBoard) {
        boolean gameFinished = false;
        int completedElements = 0;
        while (!gameFinished) {
            for (int row = 0; row <= 9; row++) {
                for (int column = 0; column <= 9; column++) {
                    if (sudokuBoard.getSudokuRows().get(row).getSudokuElements().get(column).getMove() == 0) {
                        completedElements += 1;
                    }
                }
            }

            if (completedElements == 81) {
                gameFinished = true;
            }

            for (int row = 0; row <= 9; row++) {
                for (int column = 0; column <= 9; column++) {
                    RemovePossibleNumber removePossibleNumber = new RemovePossibleNumber();
                    removePossibleNumber.executeNumberRemove(sudokuBoard);
                    if (sudokuBoard.getSudokuRows().get(row).getSudokuElements().get(column).getPossibleMoves().size() == 1) {
                        int move = sudokuBoard.getSudokuRows().get(row).getSudokuElements().get(column).getPossibleMoves().get(0);
                        sudokuBoard.getSudokuRows().get(row).getSudokuElements().get(column).makeMove(move);
                    } else {
                        System.out.println("Dupa bedzie trudniej");
                    }
                }
            }
        }
    }
}
