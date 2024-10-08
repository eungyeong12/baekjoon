import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(fibonacci(n));
    }

    static long fibonacci(int n) {
        long[] f = new long[n+1];
        f[0] = 0;
        f[1] = 1;

        for(int i=2; i<=n; i++) {
            f[i] = f[i-1] + f[i-2];
        }
        return f[n];
    }
}
