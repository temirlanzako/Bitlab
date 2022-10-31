import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        int n = in.nextInt();
        int max = 0;
        while (true) {
            n = in.nextInt();
            if (n == 0) break;
            if (max<n) {
                max = n;
            }
        }
        System.out.print(max);
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    }
}