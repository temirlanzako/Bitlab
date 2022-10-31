import java.util.Scanner;

public class MAin18 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] a = new int [n];
        for (int i = 0; i < n; i++) {
            a[i] = in.nextInt();
        }
        asd(n,a);
    }
    public static void asd (int n, int[]a) {
        for (int i = 0; i < n; i++) {
            if (a[i]%5 == 0 && a[i] < 50) {
                System.out.println(a[i]);
            }
        }
    }
}
