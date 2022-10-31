import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str = in.nextLine();
        String str1 = "";
        for (int i = 0; i < str.length(); i++) {
            if (Character.isUpperCase(str.charAt(i)) == true) {
                str1 = str1 + Character.toLowerCase(str.charAt(i));
            }
            else if (Character.isLowerCase(str.charAt(i)) == true) {
                str1 = str1 + Character.toUpperCase(str.charAt(i));
            }
            else if (Character.isWhitespace(str.charAt(i)) == true) {
                str1 = str1 + " ";
            }
        }
        System.out.println(str1);
    }
}
// if (CaseLetters.contains(String.valueOf(str.charAt(i)))){
//str = str.toLowerCase();