public class Factorial {

    static int factorial(int n) {
        if (n > 1)
            return n * factorial(--n);

        else
            return 1;
    }

    public static void main(String[] args) {
        int n = 5;
        System.out.println(factorial(n));
    }
}