import java.util.Scanner;

public class Main19 {
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
            int n = in.nextInt();
           // int[] a = {0,1,2,3,4,5,6,7,8,9,10,11,12};
            asd(n);
    }
    public static void asd (int n) {
        if (n <= 2 || n == 12) {
            System.out.println("Winter");
        }
        if (n > 2 && n <= 5) {
            System.out.println("Spring");
        }
        if (n > 5 && n <= 8) {
            System.out.println("Summer");
        }
        if (n > 8 && n <= 11) {
            System.out.println("Autumn");
        }
    }
}
