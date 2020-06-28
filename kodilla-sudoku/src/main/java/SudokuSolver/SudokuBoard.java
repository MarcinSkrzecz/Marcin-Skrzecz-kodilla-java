package SudokuSolver;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

public class SudokuBoard {
    public static final int ROWNUMBERS = 9;
    private List<SudokuRow> sudokuRows = new ArrayList<>();

    public SudokuBoard() {
        IntStream.range(0,ROWNUMBERS).forEach(i -> sudokuRows.add(new SudokuRow()));
    }

    public void setElementValue(String input) {
        ArrayList<String> inputList = new ArrayList<>(Arrays.asList((input.split(","))));

        sudokuRows.get(Integer.parseInt(inputList.get(0)))
                .getSudokuElements().get(Integer.parseInt(inputList.get(1)))
                .makeMove(Integer.parseInt(inputList.get(2)));
    }

    public List<SudokuRow> getSudokuRows() {
        return sudokuRows;
    }

    public String printBoard() {
        return sudokuRows.get(0).toString() +
                "------------------------------" +
                sudokuRows.get(1).toString() +
                "------------------------------" +
                sudokuRows.get(2).toString() +
                "------------------------------" +
                sudokuRows.get(3).toString() +
                "------------------------------" +
                sudokuRows.get(4).toString() +
                "------------------------------" +
                sudokuRows.get(5).toString() +
                "------------------------------" +
                sudokuRows.get(6).toString() +
                "------------------------------" +
                sudokuRows.get(7).toString() +
                "------------------------------" +
                sudokuRows.get(8).toString() +
                "------------------------------";
    }
}