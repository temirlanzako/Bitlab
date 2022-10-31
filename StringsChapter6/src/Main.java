import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        String s = in.next();
        System.out.println(s.charAt(1) + "" + Character.getNumericValue(s.charAt(0))*2);
    }
}
