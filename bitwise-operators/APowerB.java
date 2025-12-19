public class APowerB {
    public static void main(String[] args) {
        // Ques. Calculate a power b, pow(a, b).

        // We can use a for loop & multiply a to itself b no. of times. This is will
        // have a runtime complexity of O(b)

        // We can use Bitwise AND to reduce the complexity to O(log(b))

        // a = 3
        // b = 4 ---> 100 = 2 power 2

        int a = 3, b = 4;
        int ans = 1;

        while (b > 0) {
            if ((b & 1) == 1) {
                ans = ans * a;
            }

            a = a * a;

            b = b >> 1;
        }

        System.out.println(ans);
    }
}
