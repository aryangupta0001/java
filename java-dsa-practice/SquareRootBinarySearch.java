public class SquareRootBinarySearch {
    public static void main(String[] args) {
        int num = 1360, p = 10;

        double ans = sqrt(num, p);

        System.out.println(ans);

        System.out.println(ans * ans);
    }

    static double sqrt(int n, int p) {
        int a = 0, b = n;
        double root = 0.0;

        while (a <= b) {
            int m = a + (b - a) / 2;

            if (m * m == n)
                return m;

            else if (m * m < n)
                a = m + 1;

            else
                b = m - 1;
        }

        double incr = 0.1;

        for (int i = 0; i < p; i++) {

            while(root * root <= n){
                root += incr;
            }

            root -= incr;

            incr /= 10;

        }

        return root;

    }
}
