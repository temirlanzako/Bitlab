import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        String str = in.nextLine();
        str = str.toLowerCase();
        String ch = in.nextLine();
        sum(str,ch);
    }
    public static void sum (String str, String ch) {
        int sum = 0;
        for (int i = 0; i < str.length(); i++) {
            if(str.charAt(i) == ch.charAt(0)) {
                sum = sum + 1;
            }
        }
        System.out.println(sum);
    }
}
