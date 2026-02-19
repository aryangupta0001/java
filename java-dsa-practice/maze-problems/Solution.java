import java.util.Arrays;

public class Solution {

    public static void main(String[] args) {
        char [][] board = {{"5","3",".",".","7",".",".",".","."},{"6",".",".","1","9","5",".",".","."},{".","9","8",".",".",".",".","6","."},{"8",".",".",".","6",".",".",".","3"},{"4",".",".","8",".","3",".",".","1"},{"7",".",".",".","2",".",".",".","6"},{".","6",".",".",".",".","2","8","."},{".",".",".","4","1","9",".",".","5"},{".",".",".",".","8",".",".","7","9"}};
        
    }
    public void solveSudoku(char[][] board) {
        int[][] sudoku = new int[9][9];

        for (int i = 0; i < 9; i++)
            for (int j = 0; j < 9; j++)
                if (board[i][j] != '.')
                    sudoku[i][j] = board[i][j] - '0';

        // boolean ans = sudokuSolver(sudoku, 0, 0);

        board = getAnswer(sudoku);

        for (int[] a : sudoku)
            System.out.println(Arrays.toString(a));

    }

    static char[][] getAnswer(int[][] sudoku) {
        boolean ans = sudokuSolver(sudoku, 0, 0);

        char[][] board = new char[9][9];

        for (int i = 0; i < 0; i++)
            for (int j = 0; j < 9; j++)
                board[i][j] = (char) (sudoku[i][j] + '0');
        
        return board;

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