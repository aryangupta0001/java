import java.util.Arrays;
import java.util.Scanner;

public class SudokuSolver {
    public static void main(String[] args) {
        int[][] sudoku = new int[9][9];

        Scanner Sc = new Scanner(System.in);

        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++)
                sudoku[i][j] = Sc.nextInt();
        }

        Sc.close();

        solveSudoku(sudoku);

        for (int[] a : sudoku)
            System.out.println(Arrays.toString(a));
    }

    static void solveSudoku(int[][] board) {
        sudokuSolver(board, 0, 0);
    }

    static boolean sudokuSolver(int[][] board, int row, int col) {
        if (col == 9) {
            if (row == 8)
                return true;
            else {
                row++;
                col = 0;
            }
        }

        if (board[row][col] != 0)
            return sudokuSolver(board, row, col + 1);

        for (int k = 1; k <= 9; k++) {
            if (isSafe(board, k, row, col)) {
                board[row][col] = k;

                if (sudokuSolver(board, row, col + 1))
                    return true;

                board[row][col] = 0;
            }
        }
        return false;
    }

    static boolean isSafe(int[][] board, int k, int row, int col) {
        for (int i = 0; i < 9; i++)
            if (board[row][i] == k || board[i][col] == k)
                return false;

        for (int i = row - row % 3; i <= row - row % 3 + 2; i++)
            for (int j = col - col % 3; j <= col - col % 3 + 2; j++)
                if (board[i][j] == k)
                    return false;

        return true;
    }
}