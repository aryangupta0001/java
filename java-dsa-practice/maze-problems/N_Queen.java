import java.util.Arrays;

public class N_Queen {
    public static void main(String[] args) {
        int r = 5;
        int c = 5;

        char[][] board = new char[r][c];

    }

    static void getQueenPositions(char[][] board, int r, int c) {

        if (r == board.length - 1 && c == board[0].length - 1) {
            for (char[] i : board)
                System.out.println(Arrays.toString(i));
        }

        if (board[r][c] == '_' || board[r][c] == 'Q')
            if (c < board[0].length - 1)
                getQueenPositions(board, r, c + 1);
            else
                getQueenPositions(board, r + 1, 0);
        
        board[r][c] = 'Q';

        for(int i = )
        
    }
}