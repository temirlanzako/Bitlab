import java.util.Scanner;

public class Main14 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int[] ar = new int[a];
        for (int i = 0; i < ar.length; i++) {
            ar[i] = in.nextInt();
        }
        asd(ar);
    }

    public static void asd(int[] ar) {
        int as = 0;
        int as2 = 0;
        for (int i = 0; i < ar.length; i++) {
            boolean flag = true;
            for (int j = 1; j < ar.length; j++) {
                if (i == j) {
                    continue;
                }
                if (ar[i] == ar[j]) {
                    flag = false;
                    break;
                    }
                }
            if(flag) {
                System.out.print(ar[i] + " ");

                 }
            }
        }
    }
