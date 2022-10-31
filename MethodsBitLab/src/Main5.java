import java.util.Scanner;

public class Main5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str = in.nextLine();
        String str1 = in.nextLine();
        answer(str,str1);

    }
    public static void answer(String str, String str1) {
        String login = "admin";
        String password = "qwerty";
        if (str.equals(login) && str1.equals(password)) {
            System.out.println("Authentication completed");
        }
        else {
            System.out.println("Invalid login or password");
        }
    }
}
