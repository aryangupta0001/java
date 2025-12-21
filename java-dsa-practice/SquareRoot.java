public class SquareRoot {
    public static void main(String[] args) {
        int num = 100;

        int a = 1, b = num / 2, root = 1;

        while (a <= b) {
            root = a + (b - a) / 2;

            int sq = root * root;

            if (sq < num)
                a = root + 1;

            else if (sq == num)
                break;

            else
                b = root - 1;

        }

        System.out.println(b);
    }
}
