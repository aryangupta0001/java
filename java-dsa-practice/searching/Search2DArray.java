import java.util.Arrays;

public class Search2DArray {
    public static void main(String[] args) {
        int[][] arr = { { 1, 2, 4 }, { 3, 5, 6, 7 }, { 22, 13 }, { 10 } };

        int target1 = 100;
        int target2 = 6;

        int[] location1 = search2D(arr, target1);
        int[] location2 = search2D(arr, target2);

        System.out.println(target1 + " is present at indices : " + Arrays.toString(location1));
        System.out.println(target2 + " is present at indices : " + Arrays.toString(location2));
    }

    static int[] search2D(int[][] arr, int target) {
        for (int i = 0; i < arr.length; i++)
            for (int j = 0; j < arr[i].length; j++)
                if (arr[i][j] == target)
                    return new int[] { i, j };

        return new int[] { -1, -1 };
    }
}
