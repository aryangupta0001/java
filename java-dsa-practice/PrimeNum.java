public class PrimeNum {
    public static void main(String[] args) {
        int a = 13;
        int[] prime = new int[a + 1];

        prime[1] = 1;

        int k = 2;
        boolean isPrime;

        while (k * k <= a) {
            isPrime = true;

            if (prime[k] == 0) {

                isPrime = isPrime(k);

                if (isPrime) {

                    int i = k + k;

                    while (i <= a) {
                        prime[i] = 1;
                        i += k;
                    }

                }
            }

            k++;
        }

        for (int i = 1; i < prime.length; i++)
            System.out.println(i + (prime[i] == 0 ? " - Prime" : " - Not Prime"));
    }

    static boolean isPrime(int a) {
        int k = 2;

        while (k * k <= a) {
            if (a % k == 0)
                return false;

            k++;
        }

        return true;
    }
}
