import java.util.Scanner;

public class Main3 {
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        String str1 = in.next();
        System.out.print(str1.charAt(1) + "" + Integer.parseInt(String.valueOf(str1.charAt(0))) * 2);
    }
}
