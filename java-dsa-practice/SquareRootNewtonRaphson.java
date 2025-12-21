public class SquareRootNewtonRaphson {
    public static void main(String[] args) {
        int n = 100;

        double ans = sqrt(n);

        System.out.println(ans);
        System.out.println(ans * ans);

    }

    static double sqrt(int n) {
        double root;
        double x = n;

        while (true) {
            root = (x + (n / x)) / 2;
            System.out.println("root" + root);

            if (Math.abs(root - x) < 1)
                return root;

            x = root;
        }

        // return root;
    }
}
