package SudokuSolver;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

public class SudokuRow {
    private static final int ELEMENTSNUMBER = 9;
    private List<SudokuElement> sudokuElements = new ArrayList<>();

    public SudokuRow() {
        IntStream.range(0,ELEMENTSNUMBER).forEach(i -> sudokuElements.add(new SudokuElement()));
    }

    public List<SudokuElement> getSudokuElements() {
        return sudokuElements;
    }

    @Override
    public String toString() {
        return "|" + sudokuElements.get(0).showMove() +
                "|" + sudokuElements.get(1).showMove() +
                "|" + sudokuElements.get(2).showMove() +
                "|" + sudokuElements.get(3).showMove() +
                "|" + sudokuElements.get(4).showMove() +
                "|" + sudokuElements.get(5).showMove() +
                "|" + sudokuElements.get(6).showMove() +
                "|" + sudokuElements.get(7).showMove() +
                "|" + sudokuElements.get(8).showMove() + "|";
    }
}
