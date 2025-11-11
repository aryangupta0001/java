public class Ceiling {
    public static void main(String[] args) {
        int[] arr = { 1, 3, 5, 6, 8, 10, 12, 13, 13, 16, 18 };

        int target = 11, beg = 0, end = arr.length - 1, mid;

        while (beg <= end) {
            mid = beg + (end - beg) / 2;

            if (arr[mid] < target)
                beg = mid + 1;

            else if (arr[mid] > target)
                end = mid - 1;

            else {
                System.out.println("Ceiling(" + target + ") = " + arr[mid]);
                break;
            }
        }

        if (beg > end) {
            if (beg > arr.length - 1)
                System.out.println("Ceiling(" + target + ") = Not Exists in Array");
            else
                System.out.println("Ceiling(" + target + ") = " + arr[beg]);
        }

    }
}
