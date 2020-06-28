package SudokuSolver;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class SudokuScanner {

    private Scanner scanner = new Scanner(System.in);
    private SudokuSolver sudokuSolver = new SudokuSolver();

    public ArrayList<String> inputSplit(String input) {
        ArrayList<String> inputList = new ArrayList<>(Arrays.asList(input.split("|")));
        return inputList;
    }

    public void fillAndPrintBoard(SudokuBoard sudokuBoard) {
        System.out.println("Sudoku solver");
        System.out.println("Insert row,column,number separated by coma (Like: 1,3,9|1,2,3|3,3,3|...)");

        String insertingScanner = scanner.nextLine();
        ArrayList<String> splittedInput = inputSplit(insertingScanner);
        int size = splittedInput.size();
        for (int i = 0; i < size; i++) {
            sudokuBoard.setElementValue(splittedInput.get(i));
        }
        sudokuBoard.printBoard();
    }

}
