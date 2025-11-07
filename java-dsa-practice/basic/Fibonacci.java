public class Fibonacci {

    static int a = 0, b = 1;

    static void fibonacci(int n) {
        if(n>0){
            System.out.println(a);

            int c = a + b;
            a = b;
            b = c;
            
            fibonacci(--n);
        }
    }

    public static void main(String[] args) {
        fibonacci(5);
    }
}