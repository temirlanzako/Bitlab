import java.util.Scanner;

public class Main17 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        int[][] a = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                a[i][j] = in.nextInt();
            }
        }
        asd(n, m, a);
    }

    public static void asd(int n, int m, int[][] a) {
        for (int i = 0; i < n; i++) {
            int maxI = a[i][0];
            for (int j = 0; j < m; j++) {
                if (maxI < a[i][j]) {
                    maxI = a[i][j];
                }
            }
            System.out.println(maxI);
        }
    }
}

