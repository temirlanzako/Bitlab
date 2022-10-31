import java.util.Scanner;

public class Main9 {
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        int a = in.nextInt();
        int[] ar = new int [a];

        for(int i = 0; i <ar.length; i++) {
            ar[i] = in.nextInt();
        }
        asd(ar);
    }
    public static void asd (int[]ar) {
        int sum = 0;
        int sum2 = 0;
        for (int i = 0; i < ar.length; i++) {
            sum = sum + ar[i];
            if (ar[i]%5 == 0) {
                sum2 = sum2 +ar[i];
            }
        }
        System.out.println(sum - sum2);
    }
}

