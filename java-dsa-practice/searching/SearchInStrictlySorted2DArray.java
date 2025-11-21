import java.util.Arrays;

public class SearchInStrictlySorted2DArray {

    static int[] binarySearch(int[] arr, int target, int row) {

        int beg = 0, end = arr.length - 1;

        while (beg <= end) {
            int mid = beg + (end - end) / 2;

            if (target < arr[mid])
                end = mid - 1;

            else if (target == arr[mid])
                return new int[] { row, mid };

            else
                beg = mid + 1;
        }
        return new int[] { -1, -1 };
    }

    static int[] searchIn2dArray(int[][] arr, int target) {

        int row = arr.length;

        if (row == 0)
            return new int[] { -1, -1 };

        if (row == 1)
            return binarySearch(arr[0], target, 0);

        int col = arr[0].length;

        if (col == 0)
            return new int[] { -1, -1 };

        int initRow = 0, lastRow = row - 1, midCol = (col - 1) / 2;

        while (initRow < lastRow - 1) {
            int midRow = initRow + (lastRow - initRow) / 2;

            if (target < arr[midRow][midCol])
                lastRow = midRow;

            else if (target == arr[midRow][midCol])
                return new int[] { midRow, midCol };

            else
                initRow = midRow;
        }

        if (target <= arr[initRow][col - 1])
            return binarySearch(arr[initRow], target, initRow);

        else
            return binarySearch(arr[lastRow], target, lastRow);
    }

    public static void main(String[] args) {
        int[][] arr = { { 1, 2, 3, 5, 8 },
                { 10, 12, 14, 15, 18 },
                { 21, 22, 25, 28, 29 },
                { 31, 35, 39, 41, 43 } };

        int target = 15;

        int[] index = searchIn2dArray(arr, target);

        System.out.println(Arrays.toString(index));

    }
}
