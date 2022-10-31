import java.util.Scanner;

public class Main4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str = in.nextLine();
        String[] strA = str.split(" ");
        String str1 = "";
        for (int i = 0; i < strA.length; i++) {
            str1+= strA[i].substring(0, 1).toUpperCase() + strA[i].substring(1) + " ";
        }
        System.out.print(str1);
    }
}
