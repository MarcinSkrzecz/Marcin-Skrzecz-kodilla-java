package SudokuSolver;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

public class SudokuElement {
    private static final int EMPTY = 0;
    private static final int RANGE = 9;
    private Integer move;
    private List<Integer> possibleMoves = new ArrayList<>();

    public SudokuElement() {
        this.move = EMPTY;
        IntStream.range(0, RANGE).forEach(i -> possibleMoves.add(i+1));
    }

    public Integer getMove() {
        return move;
    }

    public List<Integer> getPossibleMoves() {
        return possibleMoves;
    }

    public void makeMove(Integer move) {
        this.move = move;
    }

    public void removeNumberFromList(Integer numberToRemove) {
        possibleMoves.remove(numberToRemove);
    }

    public String showMove() {
        if (move == EMPTY) {
            return "-";
        } else {
            return move.toString();
        }
    }
}