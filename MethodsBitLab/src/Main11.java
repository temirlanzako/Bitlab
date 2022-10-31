import java.util.Scanner;

public class Main11 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str = in.nextLine();
        asd(str);
    }
    public static void asd (String str) {
        for (int i = 0; i < str.length(); i++) {
            System.out.print(str.charAt(i));
            System.out.print(str.charAt(i));
        }
    }
}
