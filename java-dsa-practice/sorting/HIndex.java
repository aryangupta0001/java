public class HIndex {
    public static void main(String[] args) {

        int[] citations = {0, 1, 3, 5, 6};
        
        int n = citations.length, a = 0, b = n - 1;

        if (n == 1)
            System.out.println(citations[0] > 0 ? 1 : 0);

        while (a < b) {
            int mid = a + (b - a) / 2;

            System.out.println("a : " + a + "\tb : " + b + "\tmid : " + mid + "  : " + citations[mid] + "\tlength : " + (n-mid));

            if (n - mid <= citations[mid])
                b = mid;

            else
                a = mid + 1;
        }

        System.out.println(citations[a]);

    }
}
