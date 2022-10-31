import java.util.Scanner;

public class Main4 {
    public static void main (String[] args) {
        Scanner in = new Scanner(System.in);
        String str = in.nextLine();
        String str1 = in.nextLine();
        tf(str,str1);
    }
    public static void tf (String str, String str1) {
        if (str.contains(str1)) {
            System.out.println("YES");
        }
        else {
            System.out.println("NO");
        }

    }
}
