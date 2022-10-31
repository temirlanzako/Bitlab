import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        String str = in.nextLine();
        int zero = '0';
        String ans = "";
        for (int i = 0; i < str.length(); i++) {
            if (Character.isDigit(str.charAt(i)) == true) {
                ans+= "0";
            }
            else {
                ans = ans + str.charAt(i);
            }
        }
        System.out.println(ans);
    }
}
