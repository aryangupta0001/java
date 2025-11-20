public class SearchInSorted2DArray {
    public static void main(String[] args) {
        int[][] arr = {
                { 1, 5, 10, 15, 20, 25 },
                { 4, 8, 13, 18, 21, 28 },
                { 6, 11, 17, 22, 24, 30 },
                { 9, 14, 19, 26, 29, 35 },
                { 12, 16, 23, 31, 36, 40 }
        };

        int target = 102, i = 0, j = arr[0].length - 1;
        boolean found = false;

        while (i < arr.length && j >= 0 && (!found))
            if (target < arr[i][j])
                j--;

            else if (target > arr[i][j])
                i++;

            else {
                found = true;
            }

        if (found)
            System.out.println(i + ", " + j);

        else
            System.out.println("-1, -1");
    }
}
