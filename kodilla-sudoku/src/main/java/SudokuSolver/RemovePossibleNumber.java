package SudokuSolver;

import java.util.ArrayList;
import java.util.List;

public class RemovePossibleNumber {

    private List<Integer> rowNumbers(SudokuBoard sudokuBoard, int row) {
        List<Integer> claimedRowMoves = new ArrayList<>();
        for (int i = 0; i < 9; i++) {
            int r = sudokuBoard.getSudokuRows().get(row).getSudokuElements().get(i).getMove();
            claimedRowMoves.add(r);
        }
        return claimedRowMoves;
    }

    private List<Integer> columnNumbers(SudokuBoard sudokuBoard, int colum) {
        List<Integer> claimedColumnMoves = new ArrayList<>();
        for (int i = 0; i < 9; i++) {
            int c = sudokuBoard.getSudokuRows().get(i).getSudokuElements().get(colum).getMove();
            claimedColumnMoves.add(c);
        }
        return claimedColumnMoves;
    }

    private List<Integer> boxNumbers(SudokuBoard sudokuBoard, int row, int column) {
        List<Integer> claimedBoxMoves = new ArrayList<>();
        int startingRow = row - row % 3;
        int startingColumn = column - column % 3;
        for (int i = startingRow; i < startingRow + 3; i++) {
            for (int j = startingColumn; j < startingColumn + 3; j++) {
                int b = sudokuBoard.getSudokuRows().get(i).getSudokuElements().get(j).getMove();
                claimedBoxMoves.add(b);
            }
        }
        return claimedBoxMoves;
    }

    private List<Integer> all3Numbers(SudokuBoard sudokuBoard, int row, int column){
        List<Integer> rowMoves = rowNumbers(sudokuBoard,row);
        List<Integer> columnMoves = columnNumbers(sudokuBoard,column);
        List<Integer> boxMoves = boxNumbers(sudokuBoard,row,column);

        List<Integer> allClaimedMoves = new ArrayList<>();
        List<Integer> uniqueClaimedMoves = new ArrayList<>();

        for (int i = 0; i < rowMoves.size(); i++) {
            allClaimedMoves.add(rowMoves.get(i));
        }
        for (int i = 0; i < columnMoves.size(); i++) {
            allClaimedMoves.add(columnMoves.get(i));
        }
        for (int i = 0; i < boxMoves.size(); i++) {
            allClaimedMoves.add(boxMoves.get(i));
        }

        for (int i = 0; i < allClaimedMoves.size(); i++) {
            if (!uniqueClaimedMoves.contains(allClaimedMoves.get(i))) {
                uniqueClaimedMoves.add(allClaimedMoves.get(i));
            }
        }
        return uniqueClaimedMoves;
    }

    public void executeNumberRemove(SudokuBoard sudokuBoard) {
        for (int row = 0; row < 9; row++) {
            for (int column = 0; column < 9; column++) {
                SudokuElement sudokuElement = sudokuBoard.getSudokuRows().get(row).getSudokuElements().get(column);
                List<Integer> listOfElementPossibleMoves = sudokuElement.getPossibleMoves();
                List<Integer> listOfClaimedMoves = all3Numbers(sudokuBoard,row,column);
                for (int i = 0; i < listOfClaimedMoves.size(); i++) {
                    if (listOfElementPossibleMoves.contains(listOfClaimedMoves.get(i))) {
                        listOfElementPossibleMoves.remove(listOfClaimedMoves.get(i));
                    }
                }
            }
        }
    }
}
