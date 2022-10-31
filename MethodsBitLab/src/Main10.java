import java.util.Scanner;

public class Main10 {
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        int a = in.nextInt();
        asd(a);
    }
    public static void asd (int a) {
        if(a%2==0){
            System.out.println("YES");
        }
        else {
            System.out.println("NO");
        }
    }
}
