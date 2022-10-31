import java.util.Scanner;

public class Main16 {

     {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        char c = in.next().charAt(0);
        asd(a, b, c);
    }
    public static void asd (int a, int b, char c) {
        if ( c == '+') {
            System.out.println(a+b);
        }
        if ( c == '-') {
            System.out.println(a-b);
        }
    }
}