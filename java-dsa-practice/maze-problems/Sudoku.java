public class Sudoku {
    public static void main(String[] args) {
        int[][] sudoku = { { -1, 5, 7, 6, -1, -1, -1, 4, -1 },
                { -1, -1, -1, -1, -1, 5, 1, 3, -1 },
                { -1, -1, 4, 9, -1, -1, 6, -1, -1 },
                { 5, -1, -1, 3, 7, 6, -1, -1, -1 },
                { -1, 8, -1, -1, -1, -1, -1, 7, -1 },
                { -1, -1, -1, -1, 4, 5, 8, -1, -1, 2 },
                { -1, -1, 1, -1, -1, 7, 9, -1, -1 },
                { -1, 2, 9, 5, -1, -1, -1, -1, -1 },
                { -1, 3, -1, -1, -1, 3, 7, 6, -1 } };

        int[][] solution = solveSudoku(sudoku);
    }

    static int[][] solveSudoku(int[][] sudoku) {

        int N = sudoku.length;

        int[][][] expected = new int[N][N][9];

        for (int i = 0; i < N; i++)
            for (int j = 0; j < N; j++)
                expected[i][j][0] = sudoku[i][j];

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                if (expected[i][j][0] == -1) {

                    int [] currentRow = new int[N];
                    int [] currentCol = new int[N];
                    int [] currentBox = new int[N];

                    


                    for(int k = 0; k<N; k++)
                        currentRow[k] = expected[i][k][0];

                    for(int k = 0; k<N; k++)
                        currentCol[k] = expected[k][j][0];


                    int rowOffset = i%3;
                    int colOffset = j%3;
                    int idx = 0;


                    for(int k = i - rowOffset; i<= i - rowOffset + 2; k++)
                        for(int l = j - colOffset; j<= j-colOffset + 2; l++)
                            currentBox[idx++] = expected[i][j][0];
                    
                    
                    int[] missing = getMissingEements(currentRow, currentCol, currentBox);

                    for(int k = 0; k<missing.length; k++)
                        expected[i][j][k] = missing[k];

                }
            }
        }
    }

    static int[] getMissingEements(int[] currentRow, int[] currentCol, int[] currentBox) {
        List<Integer> list = new ArrayList<>();

        boolean[] exist = new boolean[10];

        for (int i = 0; i < currentRow.length; i++)
            if (currentRow[i] > -1)
                exist[currentRow[i]] = true;
        
        for (int i = 0; i < currentCol.length; i++)
            if (currentRow[i] > -1)
                exist[currentCol[i]] = true;
        
        for (int i = 0; i < currentBox.length; i++)
            if (currentRow[i] > -1)
                exist[currentBox[i]] = true;

        for (int i = 1; i < 10; i++)
            if (!exist[i])
                list.add(i);

        int[] ans = new int[list.size()];

        for (int i = 0; i < list.size(); i++)
            ans[i] = list.get(i);

        return ans;

    }
}