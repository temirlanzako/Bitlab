import java.util.Scanner;

public class Main13 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int[] ar = new int [a];
        for (int i = 0; i < ar.length; i++){
            ar[i] = in.nextInt();
        }
        asd(ar);
    }
    public static void asd(int[] ar) {
        int sum = 0;
        for (int i = 0; i < ar.length; i++) {
            if (ar[i] != 0) {
                sum++;
            }
        }
        System.out.println(sum);
    }
}
