import java.util.Scanner;

public class Main3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String a = in.nextLine();
        answer(a);
    }
    public static void answer (String a) {
        String first = "";
        String second = "";
        for (int i = 0; i <= a.length()/2; i++) {
            first = first + a.charAt(i);
        }
        for (int i = a.length()-1; i >= a.length()/2; i--) {
            second = second + a.charAt(i);
        }
        if (first.equalsIgnoreCase(second)) {
            System.out.println("YES");
        }
        else{
            System.out.println("NO");
        }

    }
}
