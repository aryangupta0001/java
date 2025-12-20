public class PrimeNum {
    public static void main(String[] args) {
        int a = 20;
        int[] prime = new int[a + 1];

        prime[1] = 1;

        int k = 2;

        while (k * k <= a) {

            if (prime[k] == 0) {

                int i = k + k;

                while (i <= a) {
                    prime[i] = 1;
                    i += k;
                }

            }

            k++;
        }

        for (int i = 1; i < prime.length; i++)
            System.out.println(i + (prime[i] == 0 ? " - Prime" : " - Not Prime"));
    }
}
